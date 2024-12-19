package MovieTicketSystem;

import java.util.*;

public class BookingSystem {
    private Map<String, Map<String, Set<Integer>>> bookings;
    private List<Movie> movies;

    public BookingSystem(List<Movie> movies){
        this.movies = movies;
        bookings = new HashMap<>();

        for(Movie movie : movies){
            Map<String, Set<Integer>> showTimeBookings = new HashMap<>();
            for(String showTime : movie.getShowTime()){
                showTimeBookings.put(showTime, new HashSet<>());
            }

            bookings.put(movie.getName(), showTimeBookings);
        }
    }

    public void viewMovies(){
        System.out.println("Available movies: ");

        for(int i = 0; i < movies.size(); i++){
            System.out.println((i + 1) + ". " + movies.get(i).getName());
        }
    }

    public void viewShowtimes(String movieName) {
        if (!bookings.containsKey(movieName)) {
            System.out.println("Movie not found!");
            return;
        }
        System.out.println("Showtimes for " + movieName + ":");
        for (String showtime : bookings.get(movieName).keySet()) {
            System.out.println("- " + showtime);
        }
    }

    public Ticket bookTicket(String movieName, String showtime, int seatNumber) {
        if (!bookings.containsKey(movieName)) {
            System.out.println("Movie not found!");
            return null;
        }
        if (!bookings.get(movieName).containsKey(showtime)) {
            System.out.println("Showtime not available!");
            return null;
        }
        Set<Integer> bookedSeats = bookings.get(movieName).get(showtime);
        if (bookedSeats.contains(seatNumber)) {
            System.out.println("Seat already booked!");
            return null;
        }

        bookedSeats.add(seatNumber);
        return new Ticket(movieName, showtime, seatNumber);
    }
}

package MovieTicketSystem;

import java.util.*;

public class BookingSystem {
    // the below data structure stores, movie name as key, and HashMap which contains show time as key
    // and the seat booked for that showtime.
    private Map<String, Map<String, Set<Integer>>> bookings;
    private List<Movie> movies;

    public BookingSystem(List<Movie> movies){
        // all movies are added, in the theater
        this.movies = movies;
        bookings = new HashMap<>();

        // now for each movie
        for(Movie movie : movies){
            // get are going to fill showtime and respective booked seats
            Map<String, Set<Integer>> showTimeBookings = new HashMap<>();

            // for each show time of this movie, we are making vacant set of seats
            // which will be later booked
            for(String showTime : movie.getShowTime()){
                // for each showtime, we putting showtime as key and the seats as HashSet which will empty at first
                showTimeBookings.put(showTime, new HashSet<>());
            }

            // now after filling the showtime with respective vacant set of seat
            // we are putting that movie in bookings
            // movie name -> {{showtime1}, {showtime2}, ...        {showtime n}}
            //                    |             |                       |
            //                    v             v                       v
            //           {all booked seats}, {all booked seats} ... {all booked seats}
            //                empty             empty                  empty
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

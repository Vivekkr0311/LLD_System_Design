package MovieTicketSystem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        // Sample Movies
        List<Movie> movies = Arrays.asList(
                new Movie("Avengers: Endgame", Arrays.asList("10:00 AM", "1:00 PM", "6:00 PM")),
                new Movie("Inception", Arrays.asList("11:00 AM", "3:00 PM", "9:00 PM"))
        );

        BookingSystem bookingSystem = new BookingSystem(movies);

        // Menu-driven system
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. View Movies");
            System.out.println("2. View Showtimes");
            System.out.println("3. Book Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    bookingSystem.viewMovies();
                    break;
                case 2:
                    System.out.print("Enter movie name: ");
                    String movieName = scanner.nextLine();
                    bookingSystem.viewShowtimes(movieName);
                    break;
                case 3:
                    System.out.print("Enter movie name: ");
                    movieName = scanner.nextLine();
                    System.out.print("Enter showtime: ");
                    String showtime = scanner.nextLine();
                    System.out.print("Enter seat number: ");
                    int seatNumber = scanner.nextInt();
                    Ticket ticket = bookingSystem.bookTicket(movieName, showtime, seatNumber);
                    if (ticket != null) {
                        System.out.println("Booking successful! Your ticket details:");
                        System.out.println(ticket);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Movie Ticket Booking System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

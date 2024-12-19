# Diagram of Movie Ticket System

```plaintext
+--------------------+
|  Movie (Class)     |
|--------------------|
| - name             |
| - showtimes        |
+--------------------+
| + getName()        |
| + getShowtimes()   |
+--------------------+

         ^
         |
         |
+--------------------+          +--------------------+
| BookingSystem      |<-------->| Ticket (Class)     |
|--------------------|          |--------------------|
| - bookings         |          | - movieName        |
| - movies           |          | - showtime         |
|--------------------|          | - seatNumber       |
| + viewMovies()     |          +--------------------+
| + viewShowtimes()  |          | + toString()       |
| + bookTicket()     |          +--------------------+
+--------------------+
         |
         |
         v
+--------------------+
| Main Class         |
|--------------------|
| MovieTicketBooking |
| System             |
+--------------------+
| + main()           |
+--------------------+
```
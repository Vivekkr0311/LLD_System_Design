package MovieTicketSystem;

public class Ticket {
    private String movieName;
    private String showTime;
    private Integer seatNumber;

    public Ticket(String movieName, String showTime, Integer seatNumber) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", showTime='" + showTime + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}

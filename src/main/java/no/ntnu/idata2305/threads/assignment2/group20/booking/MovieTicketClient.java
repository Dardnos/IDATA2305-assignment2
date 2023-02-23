package no.ntnu.idata2305.threads.assignment2.group20.booking;
import no.ntnu.idata2305.threads.assignment2.group20.booking.MovieTicketServer;

public class MovieTicketClient {
    MovieTicketServer ticketServer;
    String customerName;
    int numberOfTickets;

    public MovieTicketClient(MovieTicketServer server,String name,int tickets) {
        ticketServer = server;
        customerName = name;
        numberOfTickets = tickets;

    }

    public void run() {
        ticketServer.bookTicket(customerName,numberOfTickets);
    }
}

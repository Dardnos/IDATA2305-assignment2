package no.ntnu.idata2305.threads.assignment2.group20.booking;

public class MovieTicketClient extends Thread {
    MovieTicketServer ticketServer;
    String customerName;
    int numberOfTickets;

    public MovieTicketClient(MovieTicketServer server, String name, int tickets) {
        ticketServer = server;
        customerName = name;
        numberOfTickets = tickets;

    }

    @Override
    public void run() {
        ticketServer.bookTicket(customerName, numberOfTickets);
    }
}

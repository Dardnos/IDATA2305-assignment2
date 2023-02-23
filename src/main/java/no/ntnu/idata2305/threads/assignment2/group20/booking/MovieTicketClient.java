package no.ntnu.idata2305.threads.assignment2.group20.booking;

/**
 * Movie ticket client. This class is responsible for booking tickets from a
 * movie ticket server.
 * 
 * @author @Dardnos
 * @version 1.0
 */
public class MovieTicketClient extends Thread {

    private final MovieTicketServer ticketServer;
    private final String customerName;
    private final int numberOfTickets;

    /**
     * Create a new movie ticket client
     * 
     * @param server  The server to book tickets from
     * @param name    Name of the client
     * @param tickets Number of tickets to book
     * 
     * @throws IllegalArgumentException if server is null or if name is null or
     *                                  empty or if the number of tickets is less
     *                                  than 0
     */
    public MovieTicketClient(MovieTicketServer server, String name, int tickets) {
        if (server == null)
            throw new IllegalArgumentException("Server cannot be null");
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        if (tickets <= 0)
            throw new IllegalArgumentException("Number of tickets must be greater than 0");

        ticketServer = server;
        customerName = name;
        numberOfTickets = tickets;
    }

    @Override
    public void run() {
        ticketServer.bookTicket(customerName, numberOfTickets);
    }
}

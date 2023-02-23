package no.ntnu.idata2305.threads.assignment2.group20.booking;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MovieTicketServer {
    // TBD
    private final String movieName;
    private int availableSeats;

    private static Logger logger = Logger.getLogger(MovieTicketServer.class.getName());

    /**
     * Create a new movie ticket server
     * 
     * @param movieName      Name of the movie
     * @param availableSeats Number of available seats
     */
    public MovieTicketServer(String movieName, int availableSeats) {
        if (movieName == null || movieName.isEmpty()) {
            throw new IllegalArgumentException("Movie name cannot be null or empty");
        }
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    /**
     * Book tickets for a client. If there are not enough tickets available, the
     * client will be notified.
     * 
     * @param clientName    Name of the client
     * @param ticketsAmount Number of tickets to book
     */
    public void bookTicket(String clientName, int ticketsAmount) {
        if (clientName == null || clientName.isEmpty()) {
            throw new IllegalArgumentException("Client name cannot be null or empty");
        }
        if (ticketsAmount <= 0) {
            throw new IllegalArgumentException("Number of tickets must be greater than 0");
        }

        // Just to make sonar happy
        String intro = String.format("%s is trying to book %s tickets for  %s", clientName, ticketsAmount, movieName);
        String notEnough = String.format("Sorry, %s there are not enough tickets available for %s", clientName,
                movieName);
        String enough = String.format("Thank you, %s you have booked %s tickets for %s ", clientName, ticketsAmount,
                movieName);

        logger.info(intro);
        if ((availableSeats - ticketsAmount) < 0) {
            logger.log(Level.WARNING, notEnough);
        } else {
            availableSeats -= ticketsAmount;
            logger.log(Level.INFO, enough);
        }
    }
}

package no.ntnu.idata2305.threads.assignment2.group20;

import no.ntnu.idata2305.threads.assignment2.group20.booking.MovieTicketServer;
import no.ntnu.idata2305.threads.assignment2.group20.booking.MovieTicketClient;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        MovieTicketServer movieTicketServer = new MovieTicketServer("Troll", 10);

        // Creating 4 threads
        Thread t1 = new MovieTicketClient(movieTicketServer, "Xiangming", 3);
        Thread t2 = new MovieTicketClient(movieTicketServer, "Ilaria", 2);
        Thread t3 = new MovieTicketClient(movieTicketServer, "Sam", 3);
        Thread t4 = new MovieTicketClient(movieTicketServer, "Andreas", 4);

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

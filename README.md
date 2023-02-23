# IDATA2305-assignment2

In this assignment we will learn about thread Synchronization. We will be building a movie ticket booking application (a really basic one) in order to demonstrate and understand the importance of thread synchronization.

## Getting started

You are able to start the application from the [App](src/main/java/no/ntnu/idata2305/threads/assignment2/group20/App.java) class with the main method. 

To be able to replicate the different with and without synchronisation add/remove the synchronisation keyword from bookTicket method in [MovieTicketServer](src/main/java/no/ntnu/idata2305/threads/assignment2/group20/booking/MovieTicketServer.java) as shown in the video [here](docs/Video/IDATA2305-assignment2.mp4).


## Report

In the assignment 2 Thread Synchronisation we have built a basic movie ticket booking application, in order to demonstrate and understand the importance of thread synchronisation.

In the first part of the assignment we created two different classes: [MovieTicketClient](src/main/java/no/ntnu/idata2305/threads/assignment2/group20/booking/MovieTicketClient.java) and [MovieTicketServer](src/main/java/no/ntnu/idata2305/threads/assignment2/group20/booking/MovieTicketServer.java). When we ran the application we noticed that the threads ran simultaneously but did not finish in the same order as they requested tickets. This can cause an issue since we don't prioritize the "customers" order.

In the second part of the assignment to make the application more realistic towards a real life scenario we decided to add the synchronized keyword to bookTicket. This way only one client could book tickets at a time. Running the application showed the desired result where a client would order and receive the tickets before the next client could order.

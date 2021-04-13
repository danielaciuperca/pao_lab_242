package streams.main;

import streams.model.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Ticket> tickets = new TravelAgency().getTickets();

        System.out.println("Number of tickets for Barcelona: " +
                getNumberOfTicketsForDestination(tickets, "Barcelona"));

//        Stream<String> stream = Stream.of("hello", "world", "!");
//        System.out.println(stream);

        printTicketsForEmail(tickets, "apopescu@gmail.com");

        System.out.println("There is at least 1 ticket for this email apopescu@gmail.com: " +
                existsTicketForEmail(tickets, "apopescu@gmail.com"));

        System.out.println("Tickets average value: " + getTicketsAverageValue(tickets));
        System.out.println("Number of tickets for client from Bucuresti " +
                getNumberOfTicketsForClientCity(tickets, "Bucuresti"));

        System.out.println("All ticket clients have address defined: " +
                allTicketClientsHaveAddress(tickets));
    }

    public static Predicate<Ticket> getTicketEmailPredicate(String email) {
        return ticket -> ticket.getClient().getEmail() != null &&
                ticket.getClient().getEmail().equals(email);
    }

    public static long getNumberOfTicketsForDestination(List<Ticket> tickets, String destination) {
        return tickets.stream()
                    .filter(ticket -> ticket.getDestination() != null &&
                            ticket.getDestination().equals(destination))
                    .count();
    }

    public static void printTicketsForEmail(List<Ticket> tickets, String email) {
        tickets.stream()
                .filter(ticket -> getTicketEmailPredicate(email).test(ticket))
                .forEach(ticket -> System.out.println(ticket));
    }

    public static boolean existsTicketForEmail(List<Ticket> tickets, String email) {
//        varianta 1
//        return tickets.stream()
//                .anyMatch(ticket -> getTicketEmailPredicate(email).test(ticket));

//        varianta 2
        return tickets.stream()
                .filter(ticket -> getTicketEmailPredicate(email).test(ticket))
                .count() > 0;

    }

    public static double getTicketsAverageValue(List<Ticket> tickets) {
//        varianta 1
//        return tickets.stream()
//                .mapToDouble(ticket -> ticket.getPrice())
//                .average().getAsDouble();

//        varianta 2
        double totalValue = tickets.stream()
                .map(ticket -> ticket.getPrice())
                .reduce(0.0, (price1, price2) -> price1 + price2);
        return totalValue / tickets.size();
    }

    public static long getNumberOfTicketsForClientCity(List<Ticket> tickets, String city) {
        return tickets.stream()
                .filter(ticket -> ticket.getClient().getAddress() != null &&
                        ticket.getClient().getAddress().contains(city))
                .count();
    }

    public static boolean allTicketClientsHaveAddress(List<Ticket> tickets) {
        return tickets.stream()
                .allMatch(ticket -> ticket.getClient().getEmail() != null &&
                        !ticket.getClient().getEmail().isEmpty());
    }
}

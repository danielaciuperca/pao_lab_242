package streams.model;

public class Ticket {
    String origin;
    String destination;
    Client client;
    double price;
    
    public Ticket(String origin, String destination, Client client, double price) {
       this.origin = origin;
       this.destination = destination;
       this.client = client;
       this.price = price;
    }
    
    @Override
    public String toString() {
       return origin + " / " + destination + " / " + client + " / " + price;
    }
}
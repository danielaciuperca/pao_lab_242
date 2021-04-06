package streams.model;

public class Client {
    String name;
    String address;
    String email;
    
    public Client(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return name + " / " + address + " / " + email;
    }
}
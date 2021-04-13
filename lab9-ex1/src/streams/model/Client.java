package streams.model;

public class Client {
    private String name;
    private String address;
    private String email;
    
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
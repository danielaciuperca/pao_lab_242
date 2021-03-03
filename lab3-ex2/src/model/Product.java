package model;

public class Product { //POJO
    private int id;
    private String name = "no name"; //1.
    private double price;
    private boolean inStock;

    public Product() { //constructor default (fara parametrii)
        //2.
        //name = "telefon"; -> hardcoded
    }

    public Product(String n) {
        name = n; //2.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}

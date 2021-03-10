package model;

public class Car extends Vehicle { //Car is-A Vehicle
    private String color;
    private Engine engine; //Car has-A Engine

    public Car(long id, String name, double price, int stock, String model,
               boolean limitedEdition, String color, Engine engine) {
        super(id, name, price, stock, model, limitedEdition);
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

public abstract class Car {

    private double price;
    private String colour;
    private String type;

    public Car(double price, String colour, String type){
        this.price=price;
        this.colour=colour;
        this.type=type;
    }


    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}

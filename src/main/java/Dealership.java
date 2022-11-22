import java.util.ArrayList;

public class Dealership {
    private String name;
    private double till;
    private ArrayList<Car> cars;

    public Dealership(String name, double till){
        this.name=name;
        this.till=till;
        this.cars=new ArrayList<Car>();
    }


    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public int getCars() {
        return this.cars.size();
    }

    public void sellCar(Car car){
        this.cars.remove(car);
    }

    public void buyCar(Car car){
        this.cars.add(car);
    }

    public void sellCarByIndex(){
        Car removedCar = cars.remove(0);
    }
}

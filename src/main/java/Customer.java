import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Car>cars;

    public Customer(String name, double wallet){
        this.name=name;
        this.wallet=wallet;
        this.cars=new ArrayList<Car>();
    }


    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public int getCars() {
        return this.cars.size();
    }

    public void buyCar(Car car){
        if(car.getPrice() <= this.wallet) {
            this.cars.add(car);
        }
    }

    public void buyCarFromDealership(Dealership dealership ){
        HybridCar hybridCar = dealership.sellCar(hybridCar);
        cars.add(hybridCar);
    }
}

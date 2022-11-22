public class ElectricCar extends Car{

    private String chargingTime;

    public ElectricCar(double price, String colour, String type, String chargingTime){
        super(price, colour, chargingTime);
        this.chargingTime=chargingTime;
    }


    public String getChargingTime() {
        return chargingTime;
    }
}

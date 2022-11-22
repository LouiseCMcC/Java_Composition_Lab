import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    HybridCar hybridCar;

    Dealership dealership;
    @Before
    public void before(){
        customer=new Customer("Louise", 1000.00);
        hybridCar=new HybridCar(100.00, "red", "ford");
        dealership=new Dealership("Arnold Clark", 10000.00);

    }

    @Test
    public void listStartsEmpty(){
        assertEquals(0, customer.getCars());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(hybridCar);
        assertEquals(1, customer.getCars());
    }

    @Test
    public void canBuyCarFromDealership(){
        dealership.buyCar(hybridCar);
        customer.buyCarFromDealership(hybridCar);
        assertEquals(1, customer.getCars());
    }



}

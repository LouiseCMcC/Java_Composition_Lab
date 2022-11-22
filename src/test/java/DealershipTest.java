import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    HybridCar hybridCar;

    @Before
    public void before(){
        dealership=new Dealership("Arnold CodeClan", 0.00);
        hybridCar=new HybridCar(100.00, "red", "ford");
    }

    @Test
    public void listStartsAtZero(){
        assertEquals(0, dealership.getCars());
    }

    @Test
    public void canSellCar(){
        dealership.buyCar(hybridCar);
        dealership.buyCar(hybridCar);
        dealership.sellCar(hybridCar);
        assertEquals(1, dealership.getCars());
    }

}

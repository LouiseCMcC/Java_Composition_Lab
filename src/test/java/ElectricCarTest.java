import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar=new ElectricCar(200.00, "green", "ford", "1 hour");
    }

    @Test
    public void hasPrice(){
        assertEquals(200.00, electricCar.getPrice(),0.1);
    }
}

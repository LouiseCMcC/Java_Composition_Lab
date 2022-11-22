import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar(100.00, "red", "BMW");
    }

    @Test
    public void hasType(){
        assertEquals("BMW", hybridCar.getType());
    }

}

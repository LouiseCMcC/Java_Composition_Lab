import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
    Tyre tyre;

    @Before
    public void before(){
        tyre=new Tyre("Goodyear", "large");
    }

    @Test
    public void tyreHasSize(){
        assertEquals("large", tyre.getSize());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;
    @Before
    public void before(){
        engine=new Engine("V8", "petrol");
    }

    @Test
    public void engineHasName(){
        assertEquals("V8", engine.getName());
    }
}

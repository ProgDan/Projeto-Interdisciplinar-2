package example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ProgDan
 */
public class ExampleTest {

    @Test
    public void ConstructorTest() {
        Example e = new Example(1);
        assertEquals(new Integer(1), e.getNumber());
    }
}

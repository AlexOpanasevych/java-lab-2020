package musicinstrument.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import musicinstrument.src.Body;
import musicinstrument.src.MIPart;
import org.junit.Test;

public class BodyTest {
    @Test
    public void test1() {
        MIPart body = new Body(1.2);
        assertEquals(Double.valueOf(1.2), body.getWeight());
    }
}

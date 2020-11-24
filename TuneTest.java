import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.mockito.junit.*;

public class TuneTest {
    @Test
    public void test1() {
        Tune tune = new Tune(2.4);
        assertEquals(tune.partType, MIPartType.METAL);
    }
}

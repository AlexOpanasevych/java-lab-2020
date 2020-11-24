import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MusicInstrumentTest {
    @Test
    public void test1() {
        MusicInstrument mi = new MusicInstrument();
        mi.addPart(new Body(1.2)).addPart(new Tune(2.2));
        // assertEquals(new Body(1.2), mi.getParts().get(0));

    }
}

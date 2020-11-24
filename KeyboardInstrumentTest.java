import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

/**
 * KeyboardInstrumentTest
 */
public class KeyboardInstrumentTest {

    @Test
    public void test1() {
        KeyboardInstrument ins = new KeyboardInstrument();
        ins.play();
        ins.addPart(new Tune(1.2));
    }
}
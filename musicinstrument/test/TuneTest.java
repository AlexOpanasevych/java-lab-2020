package musicinstrument.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.mockito.junit.*;
import musicinstrument.src.Tune;
import musicinstrument.src.MIPartType;

public class TuneTest {
    @Test
    public void partType_PartTypeValid_True() {
        Tune tune = new Tune(2.4);
        assertEquals(tune.partType, MIPartType.METAL);
    }
}

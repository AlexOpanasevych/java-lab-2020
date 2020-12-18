package musicinstrument.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import musicinstrument.src.MIPartType;
import org.junit.Test;

public class MIPartTypeTest {
    @Test
    public void type_TypeValid_True() {
        MIPartType type = MIPartType.METAL;
        assertEquals(MIPartType.METAL.toString(), type.toString());
    }
}

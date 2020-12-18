package musicinstrument.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import musicinstrument.src.MIType;
import org.junit.Test;

public class MITypeTest {
    @Test
    public void allTypes_AllTypesAreIn_True() {
        assertEquals("string, keyboard, percussion, woodwind, brass, electric", MIType.allTypes());
    }
    @Test
    public void getCode_CodeValid_True() {
        assertEquals(1, MIType.STRING.getCode(), "Code does not match");
    }
}

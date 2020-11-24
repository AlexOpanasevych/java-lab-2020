import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MITypeTest {
    @Test
    public void test1() {
        assertEquals("string, keyboard, percussion, woodwind, brass, electric", MIType.allTypes());
    }
    @Test
    public void checkCode() {
        assertEquals(1, MIType.STRING.getCode(), "Code does not match");
    }
}

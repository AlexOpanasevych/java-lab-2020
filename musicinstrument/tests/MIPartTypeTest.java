package musicinstrument.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MIPartTypeTest {
    @Test
    public void test1() {
        MIPartType type = MIPartType.METAL;
        assertEquals(MIPartType.METAL.toString(), type.toString());
    }
}

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MIFactoryTest {
    @Test
    public void test1() {
        MIFactory factory = new MIFactory();
        MusicInstrument mi = factory.createMI(MIType.STRING);
        assertEquals(MIType.STRING, mi.type);
    }
}

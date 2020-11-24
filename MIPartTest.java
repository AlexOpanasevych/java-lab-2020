
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MIPartTest {
    @Test
    public void test1() {
        MIPart part = new Body(1.1);
        System.out.println("Body weight" + part.getWeight());
        System.out.println("Part of " + part.miType);
        System.out.println("Part material" + part.partType);

    }
    
}
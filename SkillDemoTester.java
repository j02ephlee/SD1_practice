import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class SkillDemoTester {
    @Test
    public void TwoPlusTwoShouldEqualFour() {
        assertEquals(4, add(2, 2));
    }
}

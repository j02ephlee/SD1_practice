import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void TwoPlusTwoShouldEqualFour() {
        assertEquals(4, SkillDemo.add(2, 2));
    }
}

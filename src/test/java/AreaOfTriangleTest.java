import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AreaOfTriangleTest {

    @Test
    public void testAreaOfTriangle() {
        double base = 4.0;
        double height = 3.0;
        double expectedArea = 6.0;
        double actualArea = AreaOfTriangle.calculateTriangleArea(base, height);
        assertEquals(expectedArea, actualArea, 0.001);
    }
}

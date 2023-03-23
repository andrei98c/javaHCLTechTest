import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CombinedTest {

    @Test
    public void testAreaOfTriangle() {
        double base = 4.0;
        double height = 3.0;
        double expectedArea = 6.0;
        double actualArea = AreaOfTriangle.calculateTriangleArea(base, height);
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testPrintNumbers() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintNumbers.printNumbers();

        Assertions.assertEquals("1,2,3,4,5,6,7,8,10", outContent.toString());
    }
}



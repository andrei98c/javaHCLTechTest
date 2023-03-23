import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintNumbersTest {

    @Test
    public void testPrintNumbers() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintNumbers.printNumbers();

        assertEquals("1,2,3,4,5,6,7,8,10", outContent.toString());
    }
}
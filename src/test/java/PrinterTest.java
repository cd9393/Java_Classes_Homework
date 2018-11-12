import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(200, 1000);
    }

    @Test
    public void hasPaper(){
        assertEquals(200, printer.getLoadedPaper());
    }

    @Test
    public void canPrint(){
        printer.print(5, 3);
        assertEquals(185, printer.getLoadedPaper());
    }

    @Test
    public void failedPrint(){
        assertEquals(" Not enough paper to print", printer.print(30, 10));

    }

    @Test
    public void canRefillPaper(){
        printer.print(10, 10);
        printer.refill(100);
        assertEquals(200, printer.getLoadedPaper());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(1000,printer.getTonerVolume());
    }

    @Test
    public void printLowersToner(){
        printer.print(10, 10);
        assertEquals(900, printer.getTonerVolume());
    }
}

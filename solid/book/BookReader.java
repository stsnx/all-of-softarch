
import java.util.List;

public class BookReader implements InterfaceReader{
    private PrinterBook printer;
    
    BookReader(PrinterBook printer) {
        super();
        this.printer = printer;
    }
    @Override
    public void printToScreen() {
        printer.printToScreen();
    }
}

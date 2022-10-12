
import java.util.List;

public class BookPublisher implements InterfacePublisher{
    private PrinterBook printer;
    BookPublisher(PrinterBook printer) {
        this.printer = printer;
    }
    @Override
    public void printToFile() {
        printer.printToFile();
    }
}

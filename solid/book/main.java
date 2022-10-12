import java.util.List;
public class main {
    public static void main(String[] args) {
        Book book = new Book("Tyland",List.of("I", "moved", "here", "recently", "too"));
		PrinterBook printer = new PrinterBook(book);
        BookReader bookReader = new BookReader(printer);
        bookReader.printToScreen();
        BookPublisher bookPublisher = new BookPublisher(printer);
        bookPublisher.printToFile();
		
    }
}

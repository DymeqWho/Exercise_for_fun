package encapsulation.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(23323, 0, false);

        System.out.println("printer.getNumberOfPrintedPages() = " + printer.getNumberOfPrintedPages());
        printer.printPage();
        printer.printPage();
        printer.printPage();
        System.out.println("printer.getNumberOfPrintedPages() = " + printer.getNumberOfPrintedPages());
        System.out.println("printer.getTonerLevel() = " + printer.getTonerLevel());
    }
}

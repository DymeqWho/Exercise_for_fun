package encapsulation.printer;

public class Printer {
    private double tonerLevel = 100;
    private int numberOfPrintedPages;
    private boolean isItDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPrintedPages, boolean isItDuplexPrinter) {
        if (tonerLevel <= 100 && tonerLevel > 0) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPrintedPages = numberOfPrintedPages;
        this.isItDuplexPrinter = isItDuplexPrinter;
    }

    public void fillUpToner(int tonerLevel) {
        if (tonerLevel <= this.tonerLevel) {
            System.out.println("it is not necessary to change toner!");
        } else if (tonerLevel <= 0) {
            System.out.println("invalid toner!");
        } else if (tonerLevel > 100) {
            double leftToner = this.tonerLevel - tonerLevel;
            System.out.println("toner is full. there also is left " + leftToner + " for the future.");
        } else {
            this.tonerLevel = tonerLevel;
        }
    }

    public void printPage() {
        this.tonerLevel -= 0.05;
        numberOfPrintedPages++;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isItDuplexPrinter() {
        return isItDuplexPrinter;
    }
}

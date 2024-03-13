import java.util.ArrayList;

public class SortPrinterMachine {
    ArrayList<Integer> numList;
    SortModule printer;

    public void insert(ArrayList<Integer> numList) {
        this.numList = numList;
    }

    public void selection(SortModule printer) {
        this.printer = printer;
    }

    public void run() {
        printer.run(numList);
    }

    public void show() {
        printer.show(numList);
    }
}

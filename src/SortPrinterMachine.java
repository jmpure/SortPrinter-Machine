import java.util.ArrayList;

public class SortPrinterMachine {
    private ArrayList<Integer> numList;
    private SortModule printer;

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

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        SortPrinterMachine machine = new SortPrinterMachine();
        SortPrinter sortType = new BubbleSort();

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3,3,3,2,1,1,2,3,2,1,2,3,1,2,3,2,1,5,5,2,1,7));

        machine.insert(numList);
        machine.selection(new SelectionSort());
        machine.run();
        machine.show();
    }
}

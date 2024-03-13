import java.util.ArrayList;

public class SelectionSort implements SortModule {
    @Override
    public void run(ArrayList<Integer> numList) {
        for(int i = 0 ; i < numList.size(); i++) {
            for(int j = i + 1 ; j < numList.size(); j ++) {
                if(numList.get(i) > numList.get(j)){
                    int tmp = numList.get(i);
                    numList.set(i, numList.get(j));
                    numList.set(j, tmp);
                }
            }
        }
    }

    @Override
    public void show(ArrayList<Integer> numList) {
        System.out.println("[[SelectionSort Result]]");
        System.out.println(numList);
    }
}

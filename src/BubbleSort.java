import java.util.ArrayList;

public class BubbleSort implements Sort {
    @Override
    public void run(ArrayList<Integer> numList) {
        for(int cycle = 0 ;cycle < numList.size(); cycle ++) {
            for(int i = 0 ; i < numList.size() - 1 - cycle; i ++) {
                if(numList.get(i) > numList.get(i + 1)){
                    //swap
                    int tmp = numList.get(i);
                    numList.set(i, numList.get(i + 1));
                    numList.set(i + 1, tmp);
                }
            }
        }
    }

    @Override
    public void show(ArrayList<Integer> numList) {
        System.out.println("[[BubbleSort Result]]");
        System.out.println(numList);
    }
}

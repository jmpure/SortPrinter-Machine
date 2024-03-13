import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Client {
    public static void main(String[] args) throws IOException {
        SortPrinterMachine sortMachine = new SortPrinterMachine();
        int sortType;
        ArrayList<Integer> numList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("입력할 숫자의 개수를 말해주세요 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numCount = Integer.parseInt(st.nextToken());

        System.out.println("정렬할 숫자들을 입력해주세요 : (ex. 1 2 3 4 5 6)");
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < numCount; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }

        // 숫자 List 입력
        sortMachine.insert(numList);

        System.out.println("정렬 방법을 선택해주세요 : (1:Bubble Sort, 2:Selection Sort)");
        st = new StringTokenizer(br.readLine());

        sortType = Integer.parseInt(st.nextToken());

        // Sort Type 선택
        switch (sortType) {
            case 1:
                sortMachine.selection(new BubbleSort());
                break;
            case 2:
                sortMachine.selection(new SelectionSort());
                break;
            default:
                sortMachine.selection(new BubbleSort());
                break;
        }

        // Sort 알고리즘 수행
        sortMachine.run();
        // 정렬된 결과 출력
        sortMachine.show();
    }
}

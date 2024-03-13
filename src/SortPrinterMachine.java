import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SortPrinterMachine {
    private final ArrayList<Integer> numList = new ArrayList<>();
    private Sort printer;
    BufferedReader br;
    StringTokenizer st;

    public void insert() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정렬할 숫자들을 입력해주세요 : (ex. 1 2 3 4 5 6)");
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            numList.add(Integer.parseInt(st.nextToken()));
        }
    }

    public void selection() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정렬 방법을 선택해주세요 : (1:Bubble Sort, 2:Selection Sort)");
        st = new StringTokenizer(br.readLine());

        int sortType = Integer.parseInt(st.nextToken());

        switch (sortType) {
            case 1:
                printer = new BubbleSort();
                break;
            case 2:
                printer = new SelectionSort();
                break;
            default:
                System.out.println("ERROR : 현재 지원하지 않는 정렬 방법입니다.");
                throw new IOException();
        }
    }

    public void run() {
        printer.run(numList);
    }

    public void show() {
        System.out.println(numList);
    }
}

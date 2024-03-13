import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SortPrinterMachine {
    private ArrayList<Integer> numList = new ArrayList<>();
    private SortModule printer;
    private int sortType;
    BufferedReader br;
    StringTokenizer st;

    public void insert() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("입력할 숫자의 개수를 말해주세요 : ");
        st = new StringTokenizer(br.readLine());

        int numCount = Integer.parseInt(st.nextToken());

        System.out.println("정렬할 숫자들을 입력해주세요 : (ex. 1 2 3 4 5 6)");
        st = new StringTokenizer(br.readLine());

        try {
            for (int i = 0; i < numCount; i++) {
                numList.add(Integer.parseInt(st.nextToken()));
            }
        }
        catch (Exception e) {
            System.out.println("ERROR : 입력한 숫자의 개수가 부족합니다!");
            throw new IOException();
        }
    }

    public void selection() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정렬 방법을 선택해주세요 : (1:Bubble Sort, 2:Selection Sort)");
        st = new StringTokenizer(br.readLine());

        sortType = Integer.parseInt(st.nextToken());

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
        printer.show(numList);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Client {
    public static void main(String[] args) throws IOException {
        SortPrinterMachine sortMachine = new SortPrinterMachine();

        try {
            // 숫자 List 입력
            sortMachine.insert();

            // Sort Type 선택
            sortMachine.selection();

            // Sort 알고리즘 수행
            sortMachine.run();

            // 정렬된 결과 출력
            sortMachine.show();
        }
        catch (Exception e) {
            System.out.println(">>> 다시 기계를 동작시켜 주세요!!");
        }
    }
}

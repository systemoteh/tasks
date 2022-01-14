import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_B {
// Последовательно идущие единицы
// Ввод
//9
//1
//1
//1
//0
//1
//1
//1
//1
//0
// Вывод
//4
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = r.readLine();
        int lineCount = Integer.parseInt(firstLine);

        int maxCount = 0;
        int cacheCount = 0;

        for (int i = 0; i < lineCount; i++) {
            int curNumber = Integer.parseInt(r.readLine());
            if (curNumber == 1) {
                ++cacheCount;
                maxCount = Math.max(maxCount, cacheCount);
            } else {
                cacheCount = 0;
            }
        }

        System.out.println(maxCount);
    }
}

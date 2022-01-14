import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

//        5
//        1
//        1
//        1
//        0
//        1

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = r.readLine();
        int lineCount = Integer.parseInt(firstLine);

        int maxCount = 0;
        int cashCount = 0;
        int prevNumber = -1;
        for (int i = 0; i < lineCount; i++) {
            int curNumber = Integer.parseInt(r.readLine());
            if (curNumber == 1 && prevNumber == 1) {
                ++cashCount;
                maxCount = Math.max(maxCount, cashCount);
            } else if (curNumber == 1) {
                ++cashCount;
            }
            else {
                cashCount = 0;
            }
            prevNumber = curNumber;
        }

        System.out.println(Math.max(maxCount, cashCount));

    }
}

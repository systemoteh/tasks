import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main_C {
// Удаление дубликатов
// Ввод
//5
//2
//4
//8
//8
//8

// Вывод
//2
//4
//8

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = r.readLine();
        int lineCount = Integer.parseInt(firstLine);
        lineCount = Math.min(lineCount, 1000000);

        Set<Integer> result = new LinkedHashSet<>();

        for (int i = 0; i < lineCount; i++) {
            int curNumber = Integer.parseInt(r.readLine());
            result.add(curNumber);
        }

        result.forEach(System.out::println);
    }
}

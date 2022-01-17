import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_E {
// Анаграммы
// Ввод
//qiu
//iuq

// Вывод
//1

// Ввод
//zprl
//zprc

// Вывод
//0


    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = r.readLine().toLowerCase(Locale.ROOT);
        String secondLine = r.readLine().toLowerCase(Locale.ROOT);

        char[] firstLineArray = firstLine.toCharArray();
        char[] secondLineArray = secondLine.toCharArray();

        Arrays.sort(firstLineArray);
        Arrays.sort(secondLineArray);

        firstLine = new String(firstLineArray);
        secondLine = new String(secondLineArray);

        boolean result = firstLine.length() == secondLine.length() && firstLine.equals(secondLine);

        System.out.println(result ? 1 : 0);
    }
}

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


// Create new hashtable/hashmap to keep track of how many times each character
// is being used
//character_map -> new hash map

// Initial check. If lengths are not the same, they can't be anagrams.
//        if s1.length != s2.length:
//        throw exception "Not anagrams"

// Add all characters from s1 to hashmap. Increment the value to keep track of
// number of occurences
//        foreach character c1 in s1:
//        character_map[c1]++

// Iterate through all character in s2 and decrement count of each character.
//        foreach character c2 in s2:
//        character_map[c2]--

// If they are anagrams, each character should be at "0" count at the point.
// If we come across a character that is not, it means that they are not anagrams
//        foreach key k, value v in character_map:
//        if v != 0:
//        throw exception "Not anagrams"
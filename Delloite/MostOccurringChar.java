import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostOccurringChar {

    public static void main(String[] args) {
        String[] arr = {"abcd", "abc", "abcabcabc", "aabbccddeeffgghh"};

        for (String s : arr) {
            Map<Character, Integer> charCount = new HashMap<>();
            char[] chars = s.toCharArray();

            for (char c : chars) {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }
            }

            char mostOccurringChar = ' ';
            int maxCount = 0;

            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostOccurringChar = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
            System.out.println(mostOccurringChar);
        }
    }
}

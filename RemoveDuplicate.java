package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
 public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";

        String result = removeDuplicateWords(text);
        System.out.println(result);
    }

    public static String removeDuplicateWords(String text) {
        String[] words = text.split("\\s+");
        Set<String> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String lower = word.toLowerCase();

            if (!seen.contains(lower)) {
                seen.add(lower);
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}

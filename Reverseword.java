package week3.day2;

public class Reverseword {
 public static void main(String[] args) {
        String input = "i am a software tester";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // If it's the last word, keep it as it is
            if (i == words.length - 1) {
                result.append(words[i]);
            } else {
                // Reverse the word
                String reversed = new StringBuilder(words[i]).reverse().toString();
                result.append(reversed);
            }
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}


package week3.day2;

public class CountCharacter {
    public static void main(String[] args) {
        String input = "TestLeaf";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("Number of occurrences of 'e': " + count);

}
        
}

package week1.day2;

public class Fibonacci {

    public static void main(String[] args) {
        int n= 8;
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm +","+ secondTerm);
        for (int i = 2; i <n; i++) {
            
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            }
            
        }
    }



import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");

        int count = scanner.nextInt();

        scanner.close();

        int num1 = 0;
        int num2 = 1;
        int nextTerm;
        
        System.out.println("\nFibonacci Series up to " + count + " terms:");

        if (count >= 1) {
            System.out.print(num1);
        }

        if (count >= 2) {
            System.out.print(", " + num2);
        }

        for (int i = 3; i <= count; i++) {

            nextTerm = num1 + num2;
            System.out.print(", " + nextTerm);
            num1 = num2;
            num2 = nextTerm;
        }
        
        System.out.println(); 
    }
}

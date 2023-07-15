import java.util.*;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive intger n: ");
        int n = scanner.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial*= i;
        }
        
        System.out.println("The factrial of the first " + n + " natural numbers is: " + factorial);
        
    }
}
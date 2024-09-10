import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome!");
        System.out.println("Please enter a number to calculate the sum of its digits.");
        int num = scanner.nextInt();
        int result = 0;
        
        do {
            result += num % 10;
            num /= 10;
        } while (num > 0);
        
        System.out.println("The sum of the digits is: " + result);
    }
}


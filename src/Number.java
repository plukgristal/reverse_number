import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        int number  = Integer.parseInt(num1);
        int maxDigit = 0;
        int minDigit = 9;

        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            if (digit < minDigit) {
                minDigit = digit;
            }
            number /= 10;
        }

        System.out.println("Max number: " + maxDigit);
        System.out.println("Min number: " + minDigit);
    }
}

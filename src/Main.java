import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        int number  = Integer.parseInt(num1);
        int reversed = 0;

        while(number != 0) {
            int digit = number % 10; // берём последнюю цифру числа
            reversed = reversed * 10 + digit; // добавляем эту цифру в обратную сторону числа
            number = number / 10; // убираем последнюю цифру из заданного числа числа
        }

        System.out.println(reversed);


    }
}
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        boolean duplicates = false;
        for (int i = 0; i < number.length() - 1 && !duplicates; i++) {
            for (int j = i + 1; j < number.length(); j++) {

                if (number.charAt(i) == number.charAt(j)) {
                    duplicates = true;
                    break;
                }
            }
        }
        System.out.println(!duplicates);
    }
}

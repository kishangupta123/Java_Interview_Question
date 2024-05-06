package java_Interview_program.converter;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int binary = scanner.nextInt();
        int decimal = 0;
        int digitCount = 0;

        while (binary > 0) {
            int unitDigit = binary % 10;
            binary = binary / 10;
            decimal += (unitDigit * Math.pow(2, digitCount));
            digitCount++;
        }

        System.out.println("The decimal value is: " + decimal);
        scanner.close();
    }
}

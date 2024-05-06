package java_Interview_program.converter;

import java.util.Scanner;

public class DecimalToHexaDecimal {
    private static char hexaValue[] = {'0', '1', '2', '3', '4'
            , '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal value: ");
        int decimal = scanner.nextInt();
        StringBuilder hex = new StringBuilder();

        System.out.println("Decimal Value is :" + decimal);
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexChar = hexaValue[remainder];
            hex.append(hexChar);
            decimal /= 16;
        }
        System.out.println("Hexadecimal Value is :" + hex.reverse());
    }
}
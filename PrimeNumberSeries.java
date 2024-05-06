package java_Interview_program.series;

import java.util.Scanner;

public class PrimeNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value up to which we want to obtain the value");
        int n = scanner.nextInt();
        System.out.println("Prime numbers up to : " + n);
        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                System.out.print(i + ", ");
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }
}

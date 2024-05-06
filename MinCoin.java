package java_Interview_program.coinways;

import java.util.Scanner;

public class MinCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount to be changed : ");
        int n = scanner.nextInt();

        int coins[] = {1, 2};
        int noOfCoins = coins.length;

        int table[] = new int[n + 1];
        table[0] = 0;

        for (int i = 1; i <= n; i++)
            table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < noOfCoins; j++)
                if (coins[j] <= i) {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
        }
        System.out.print(table[n] + " coins are enough to give change.");
    }
}
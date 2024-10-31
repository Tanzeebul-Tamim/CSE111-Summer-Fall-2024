package summer_24.problems;

import java.util.Scanner;

/*
    Write a Java code that asks the user for the value of N as input and then prints the value of Y.

    y = 3 - 5 + 7 - 9.... nth term

    Sample input:
    5

    Sample output:
    7

    Explanation:
    For the input 5 we'll add up the first 5 numbers of the series. So, 3 - 5 + 7 - 9 + 11 = 7
 */

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int n = sc.nextInt();

        int result = 0;
        for (int i = 3, j = 1; j <= n; i += 2, j++) {
            if (j % 2 == 0) {
                result += -1 * i;
            } else {
                result += i;
            }
        }

        System.out.println(result);
        sc.close();
    }
}

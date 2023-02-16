package recursivitatea;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;

        System.out.println("Introduceti n:");
        n = cin.nextInt();
        System.out.println(s(n));
    }

    public static int s(int n) {
        if (n > 0) {
            return 2 * n - 1 + s(n - 1);
        } else {
            return 0;
        }
    }
}

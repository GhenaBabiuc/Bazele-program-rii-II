package recursivitatea;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;

        System.out.println("Introduceti n:");
        n = cin.nextInt();
        System.out.println(p(n));
    }

    public static int p(int n) {
        if (n != 1) {
            return (3 * n - 2) * p(n - 1);
        } else {
            return 1;
        }
    }
}

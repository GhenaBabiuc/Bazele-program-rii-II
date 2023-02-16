package recursivitatea;

public class Ex3 {
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 4, 6, 7, 2};

        System.out.println(p(v, 0));
    }

    public static int p(int[] v, int i) {
        if (i != v.length - 1) {
            return v[i] * p(v, i + 1);
        } else {
            return v[i];
        }
    }
}

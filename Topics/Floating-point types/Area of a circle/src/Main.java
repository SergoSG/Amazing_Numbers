import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double r = scanner.nextDouble();

        //System.out.println(Math.PI * Math.pow(r, 2.0));
        int[] a = {4, 0, 9, 2, 1};
        int[] b = {6, 3, 2, 9, 0};

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] -= b[i];
            } else {
                b[i] -= a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
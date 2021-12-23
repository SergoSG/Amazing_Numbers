import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] array = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean res = false;

        for (int i = 0; i < cnt; i++) {
            if (array[i] == n) {
                if (i != 0 && array[i - 1] == m || i != cnt - 1 && array[i + 1] == m) {
                    res = true;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}

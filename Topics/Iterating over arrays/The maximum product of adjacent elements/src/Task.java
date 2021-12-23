import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] enter = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            enter[i] = scanner.nextInt();
        }
        int res = 0;
        int tmp = 0;
        for (int i = 1; i < cnt; i++) {
            tmp = enter[i - 1] * enter[i];
            res = res < tmp ? tmp : res;
        }
        System.out.println(res);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int res = 0;

        if (cnt > 0 && cnt <= 1000) {
            for (int idx = 1; idx <= cnt; idx++) {
                int a = scanner.nextInt();
                if (a % 4 == 0 && a > res) {
                    res = a;
                }
            }
            System.out.println(res);
        }
    }
}
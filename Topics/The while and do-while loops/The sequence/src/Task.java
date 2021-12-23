import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCount = scanner.nextInt();
        int cur = 0;
        int res = 0;
        int cnt = 0;
        while (cnt < maxCount && cnt < 1000) {
            cur = scanner.nextInt();
            if (cur % 4 == 0 && cur > res) {
                res = cur;
            }
            cnt++;
        }
        System.out.println(res);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int cnt = 0;
        for (int idx = 0; idx <= 1000 || cnt == 3; idx++) {
            if (a * idx * idx * idx + b * idx * idx + c * idx + d == 0) {
                cnt++;
                System.out.println(idx);
            }
        }
    }
}
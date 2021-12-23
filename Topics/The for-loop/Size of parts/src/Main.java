import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] array = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            array[i] = scanner.nextInt();
        }

        int cntNorm = 0;
        int cntDefect = 0;
        int cntRevision = 0;

        for (int num : array) {
            if (num < 0) {
                cntDefect++;
            } else if (num == 0) {
                cntNorm++;
            } else if (num > 0) {
                cntRevision++;
            }
        }
        System.out.printf("%d %d %d", cntNorm, cntRevision, cntDefect);
    }
}
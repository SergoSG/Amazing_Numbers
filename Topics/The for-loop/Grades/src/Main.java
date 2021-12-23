import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        final int a = 5;
        final int b = 4;
        final int c = 3;
        final int d = 2;

        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        int cntD = 0;
        for (int i = 0; i < cnt; i++) {
            switch (scanner.nextInt()) {
                case a:
                    cntA++;
                    break;
                case b:
                    cntB++;
                    break;
                case c:
                    cntC++;
                    break;
                case d:
                    cntD++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("%d %d %d %d", cntD, cntC, cntB, cntA);
    }
}
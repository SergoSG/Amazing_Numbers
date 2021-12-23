import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] array = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = scanner.nextInt();
        }
        int[] res = new int[cnt];
        res[0] = array[cnt - 1];
        for (int i = 0; i < cnt; i++) {
            res[i] = i == 0 ? array[cnt - 1] : array[i - 1];
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
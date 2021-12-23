import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int maxIdx = 0;
        int max = array[maxIdx];
        for (int i = 0; i < n; i++) {
            if (i == 0 || max < array[i]) {
                max = array[i];
                maxIdx = i;
            }
        }
        System.out.println(maxIdx);
    }
}
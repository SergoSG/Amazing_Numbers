import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] incomes = new int[n];
        int[] taxes = new int[n];
        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextInt();
        }

        double max = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            double sum = (double) incomes[i] * (double) taxes[i] / 100;
            if (max == 0 || max < sum) {
                max = sum;
                cnt = i;
            }
        }
        System.out.println(cnt + 1);
    }
}
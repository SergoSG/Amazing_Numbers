import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int[] table = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            table[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean res = true;
        for (int i = 0; i < dimension; i++) {
            if (table[i] == a) {
                if (i == 0 && table[i + 1] == b) {
                    res = false;
                } else if (i == dimension - 1 && table[i - 1] == b) {
                    res = false;
                } else if (i != 0 && table[i - 1] == b || i != dimension - 1 && table[i + 1] == b) {
                    res = false;
                }
            }
        }
        System.out.println(res);
    }
}
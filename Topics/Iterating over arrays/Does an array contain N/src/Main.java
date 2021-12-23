import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int[] array = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            array[i] = scanner.nextInt();
        }
        int find = scanner.nextInt();
        boolean res = false;
        for (int i = 0; i < dimension; i++) {
            if (array[i] == find) {
                res = true;
                break;
            }
        }
        System.out.println(res);
    }
}
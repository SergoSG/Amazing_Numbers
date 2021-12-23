import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayCnt = scanner.nextInt();
        int[] array = new int[arrayCnt];

        for (int i = 0; i < arrayCnt; i++) {
            array[i] = scanner.nextInt();
        }

        int res = 0;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 2] - array[i + 1] == 1 && array[i + 1] - array[i] == 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
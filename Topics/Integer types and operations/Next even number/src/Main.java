import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((num + 1) % 2 == 0) {
            System.out.println(num + 1);
        } else {
            System.out.println(num + 2);
        }
    }
}
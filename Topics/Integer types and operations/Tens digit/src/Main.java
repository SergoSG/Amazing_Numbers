import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();

        int res = a / 10;
        res %= 10;
        System.out.println(res);
    }
}
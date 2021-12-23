import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inNumber;
        int cnt = 0;
        do {
            inNumber = scanner.nextInt();
            cnt++;
        } while (inNumber > 0);
        System.out.println(cnt - 1);
    }
}
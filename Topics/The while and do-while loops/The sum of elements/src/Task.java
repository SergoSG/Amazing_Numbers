import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inNumber;
        int sum = 0;
        do {
            inNumber = scanner.nextInt();
            sum += inNumber;
        } while (inNumber > 0);
        System.out.println(sum);
    }
}
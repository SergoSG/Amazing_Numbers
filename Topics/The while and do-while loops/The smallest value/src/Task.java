import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inNumber = scanner.nextLong();
        int cnt = 1;
        long factorial = 1;
        while (factorial <= inNumber) {
            factorial *= cnt++;
        }
        System.out.println(cnt - 1);
    }
}
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("j".equals(str.toLowerCase(Locale.ROOT).substring(0, 1)));
    }
}
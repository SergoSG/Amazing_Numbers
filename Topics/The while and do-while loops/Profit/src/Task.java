import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double startMoney = scanner.nextInt();
        double percent = scanner.nextInt();
        double endMoney = scanner.nextInt();

        int year = 0;

        while (startMoney < endMoney) {
            year++;
            startMoney = startMoney + startMoney * percent / 100;
        }

        System.out.println(year);
    }
}

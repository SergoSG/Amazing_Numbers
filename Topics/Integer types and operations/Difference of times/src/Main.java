import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int startSec = scanner.nextInt();

        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();
        int endSec = scanner.nextInt();

        int res = endHour * 3600 + endMinute * 60 + endSec -
                  startHour * 3600 - startMinute * 60 - startSec;
        System.out.println(res);
    }
}
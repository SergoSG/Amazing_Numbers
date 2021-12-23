import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        final int max = 4;
        while (cnt < max && scanner.hasNext()) {
            System.out.println(scanner.next());
            cnt++;
        }
    }
}
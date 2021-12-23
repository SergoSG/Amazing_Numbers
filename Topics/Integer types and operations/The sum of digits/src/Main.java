import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enter = scanner.nextInt();
        String numStr = String.valueOf(enter);
        int res = 0;
        for (int i = 0; i < numStr.length(); i++) {
            res += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        System.out.println(res);
    }
}
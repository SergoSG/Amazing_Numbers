import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");

        boolean res = true;
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(str[i - 1]) < 0) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}
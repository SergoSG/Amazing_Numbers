import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if (city.length() >= 4 && city.substring(city.length() - 4, city.length()).contains("burg")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
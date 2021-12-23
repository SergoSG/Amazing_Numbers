import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] enter = scanner.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < enter.length; i++) {
            if (i % 2 != 0) {
                list.add(enter[i]);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
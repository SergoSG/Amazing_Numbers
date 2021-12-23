import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String input = scanner.nextLine();
        Scanner scan = new Scanner(input).useDelimiter(" ");
        while (scan.hasNext()) {
            list.add(scan.nextInt());
        }
        int num = scanner.nextInt();

        int min = Math.abs(list.get(0) - num);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : list) {
            if (min > Math.abs(i - num)) {
                min = Math.abs(i - num);
                res.clear();
                res.add(i);
            } else if (min == Math.abs(i - num)) {
                res.add(i);
            }
        }
        Collections.sort(res);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
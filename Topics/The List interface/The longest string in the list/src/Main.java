import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        list.sort(Comparator.comparingInt(String::length).reversed());
        list.replaceAll(str -> list.get(0));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
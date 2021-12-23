import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> tmp = new ArrayList<>();
        for (Secret word : Secret.values()) {
            tmp.add(word.name());
        }
        int cnt = 0;
        for (String str : tmp) {
            cnt = str.startsWith("STAR") ? cnt + 1 : cnt;
        }
        System.out.println(cnt);
    }
}
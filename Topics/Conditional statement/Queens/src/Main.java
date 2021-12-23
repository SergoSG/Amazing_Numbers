import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posXOne = scanner.nextInt();
        int posYOne = scanner.nextInt();
        int posXTwo = scanner.nextInt();
        int posYTwo = scanner.nextInt();

        System.out.println(posXOne == posXTwo ||
                posYOne == posYTwo ||
                Math.abs(posXOne - posXTwo) == Math.abs(posYOne - posYTwo) ? "YES" : "NO");
    }
}
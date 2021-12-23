import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    ArrayList<String> inputArray = new ArrayList<>(Arrays.asList(input.split(" ")));
    int move = scanner.nextInt() % inputArray.size();

    for (int i = 1; i <= move; i++) {
      ArrayList<String> outputArray = new ArrayList<>();
      outputArray.add(inputArray.get(inputArray.size() - 1));
      for (int j = 0; j < inputArray.size() - 1; j++) {
        outputArray.add(inputArray.get(j));
      }
      inputArray = outputArray;
    }
    for (String num : inputArray) {
      System.out.print(num + " ");
    }
  }
}

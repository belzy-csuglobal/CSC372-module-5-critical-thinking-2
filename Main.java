import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static int recursiveProduct(int[] numbers) {
    if (numbers.length == 0) return 0;
    if (numbers.length == 1) return numbers[0];

    return
      numbers[numbers.length - 1] *
      recursiveProduct(Arrays.copyOf(numbers, numbers.length - 1));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];

    /**
     * Populate the numbers array with values from user input.
     */
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("Enter a number (%d/%d): ", i + 1, numbers.length);
      numbers[i] = scanner.nextInt();
    }

    System.out.printf("Product: %d", recursiveProduct(numbers));
    scanner.close();
  }
}
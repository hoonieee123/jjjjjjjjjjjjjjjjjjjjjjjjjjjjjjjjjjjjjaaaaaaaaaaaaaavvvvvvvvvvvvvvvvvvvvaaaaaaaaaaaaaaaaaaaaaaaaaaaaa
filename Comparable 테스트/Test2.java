import java.util.*;

public class Test2 {
  public static void main(String[] args) {
    int[] values = new int[10];
    Random random = new Random(System.currentTimeMillis());

    for (int i = 0; i < values.length; i++) {
      values[i] = random.nextInt(100);
    }
    System.out.println("정렬하기 전:");
    for (int val : values) {
      System.out.print(val + " ");
    }

    System.out.println("\n정렬 후 :");
    Util.selectionSort(values);
    for (int val : values) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}

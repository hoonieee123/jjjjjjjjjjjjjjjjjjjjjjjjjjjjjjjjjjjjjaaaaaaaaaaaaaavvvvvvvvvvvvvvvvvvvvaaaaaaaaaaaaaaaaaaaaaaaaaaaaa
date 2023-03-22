public class ArrayProcTest {
  final static int STUDENTS = 5;

  public static void main(String[] args) {
    int[] scores = new int[STUDENTS];
    ArrayProc obj = new ArrayProc();

    obj.getValues(scores);
    System.out.println("펑균은 = " + obj.getAverage(scores));
  }
}

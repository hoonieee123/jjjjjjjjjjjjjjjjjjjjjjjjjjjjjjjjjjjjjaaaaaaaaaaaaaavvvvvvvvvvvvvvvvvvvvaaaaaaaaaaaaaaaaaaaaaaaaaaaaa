public class TimeTest {
  public static void main(String[] args) {
    Time time = new Time();
    System.out.println(time);

    Time time2 = new Time(15, 47, 23);
    System.out.println(time2);

    Time time3 = new Time(25, 99, 99);
    System.out.println(time3);
  }
}

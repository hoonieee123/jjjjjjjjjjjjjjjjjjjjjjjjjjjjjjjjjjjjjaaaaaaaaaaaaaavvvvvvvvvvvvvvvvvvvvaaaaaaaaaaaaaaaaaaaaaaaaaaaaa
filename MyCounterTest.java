public class MyCounterTest {
  public static void main(String[] args) {
    MyCounter obj1 = new MyCounter(); // -> 매개 변수가 없는 생성자를 호출
    MyCounter obj2 = new MyCounter(3); // -> 매개 변수를 가지는 생성자를 호출

    System.out.println(obj1.counter);
    System.out.println(obj2.counter);
  }
}

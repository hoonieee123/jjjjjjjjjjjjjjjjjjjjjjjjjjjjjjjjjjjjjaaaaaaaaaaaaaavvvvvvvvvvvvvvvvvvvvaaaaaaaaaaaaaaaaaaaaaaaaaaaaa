public class MyClassTest {
  public static void main(String[] args) {
    // System.out.println(MyClass.x);

    MyClass obj = new MyClass();

    System.out.println(obj.x);

    // 실행 순서는 클래스 -> 인스턴스 -> 생성자이다.
  }
}

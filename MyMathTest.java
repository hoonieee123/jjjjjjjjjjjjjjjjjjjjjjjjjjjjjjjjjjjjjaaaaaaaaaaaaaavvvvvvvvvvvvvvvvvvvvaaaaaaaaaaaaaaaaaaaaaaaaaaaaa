class MyMath {
  // 인스턴스 멤버 변수를 이용하지 않으므로 메서드는 클래스 멤버 메서드로 선언
  // 메서드를 오버로딩하여 사용 -> 매개 변수의 개수나 자료형이 다름. 여기서는 int / double
  static int square(int i) {
    return i * i;
  }

  static double square(double i) {
    return i * i;
  }
}
public class MyMathTest {
  public static void main(String[] args) {
    // 객체 생성
    MyMath obj = new MyMath();
    // 메서드 오버로딩 적용. 매개 변수의 자료형에 따라 서로 다른 메서드를 호출.
    System.out.println(obj.square(10));
    System.out.println(obj.square(3.14));
  }
}

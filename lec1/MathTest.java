class Math {
  // 인스턴스 멤버 변수를 이용하지 않으므로 메서드는 클래스 멤버 메서드로 선언
  static int add(int x, int y) {
    return x + y;
  }
}
public class MathTest {
  public static void main(String[] args) {
    int sum;
    // 객체 생성
    Math obj = new Math();
    sum = obj.add(2, 3);
    System.out.println("2와 3의 합은 " + sum);
    sum = obj.add(7, 8);
    System.out.println("7과 8의 합은 " + sum);
  }
}

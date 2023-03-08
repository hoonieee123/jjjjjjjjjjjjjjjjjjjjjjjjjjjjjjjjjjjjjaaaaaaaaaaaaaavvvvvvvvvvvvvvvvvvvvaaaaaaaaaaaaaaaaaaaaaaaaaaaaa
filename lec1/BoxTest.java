class Box {
  // 인스턴스 멤버 변수 선언
  int width;
  int length;
  int height;
}
public class BoxTest {
  public static void main(String[] args) {
    // 객체 생성
    Box b = new Box();

    // 객체 멤버 변수 접근
    b.width = 20;
    b.length = 20;
    b.height = 30;
    System.out.println("상자의 가로, 세로, 높이는 " +
                      b.width + ", " + b.length + ", " + b.height + "입니다.");
  }
}

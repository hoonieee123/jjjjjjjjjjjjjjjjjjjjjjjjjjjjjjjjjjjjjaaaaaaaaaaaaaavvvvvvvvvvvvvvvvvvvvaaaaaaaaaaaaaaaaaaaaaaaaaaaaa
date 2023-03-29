class LocalClass {
  private int data = 30;

  void display() {
    final String msg = "현재 데이터 값은 ";

    // 메서드 안에 선언된 지역 클래스
    class Local {
      void printMsg() {
        System.out.println(msg + data);
      }
    }

    // 메서드 안에서의 스코프를 가지므로 메서드 내부에서만 사용 가능하며 외부 클래스의 private 변수에 접근할 수 있다.
    Local obj = new Local();
    obj.printMsg();
  }
}

public class LocalClassTest {
  public static void main(String[] args) {
    LocalClass obj = new LocalClass();
    obj.display();
  }
}
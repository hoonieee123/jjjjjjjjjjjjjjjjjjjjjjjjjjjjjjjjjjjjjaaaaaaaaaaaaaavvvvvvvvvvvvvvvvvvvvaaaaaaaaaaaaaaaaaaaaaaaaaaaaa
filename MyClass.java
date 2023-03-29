public class MyClass {
  static int x;
  int y;

  static {
    x = 10;
    System.out.println("클래스 초기화 블록 실행");
  }

  {
    x = 3;
    System.out.println("인스턴스 초기화 블록 실행");
  }
}

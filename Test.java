class A {
  private int a; // private -> 클래스 내부에서만 접근 가능
  int b; // default -> 클래스와 같은 패키지 내에서 접근 가능
  public int c; // public -> 자식 클래스나 다른 패키지에서도 접근 가능
}

public class Test {
  public static void main(String[] args) {
    A obj = new A();
    // obj.a = 1; error
    obj.b = 2;
    obj.c = 3;
  }
}

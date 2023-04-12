class Base {
  public Base() {
    super(); // Object의 생성자
    System.out.println("Base 클래스의 생성자");
  }
}

class Derived extends Base {
  public Derived() {
    super(); // Base의 생성자
    System.out.println("Derived 클래스의 생성자");
  }
}

public class Test {
  public static void main(String[] args) {
    Derived d = new Derived();
  }
}

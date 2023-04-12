public class Child extends Parent {
  public void prt() {
    super.prt();
    System.out.println("이것은 자식 클래스의 메서드");
  }

  public static void main(String[] args) {
    Child c = new Child();
    c.prt();
  }
}

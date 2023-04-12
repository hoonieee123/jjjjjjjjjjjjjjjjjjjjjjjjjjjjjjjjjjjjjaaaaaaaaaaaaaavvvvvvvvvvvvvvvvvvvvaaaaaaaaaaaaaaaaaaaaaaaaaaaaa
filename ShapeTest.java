class Shape3 {
  protected int x, y;
}

class Rectangle3 extends Shape3 {
  private int width, height;
}

class Triangle3 extends Shape3 {
  private int base, height;
}

class Circle3 extends Shape3 {
  private int radius;
}

public class ShapeTest {
  public static void main(String[] args) {
    Shape3 s1 = new Shape3();
    Shape3 s2 = new Rectangle3(); // 자식의 객체를 부모의 참조 변수로 가리킴

    System.out.println(s2.x);
    // System.out.println(s2.width);
  }
}

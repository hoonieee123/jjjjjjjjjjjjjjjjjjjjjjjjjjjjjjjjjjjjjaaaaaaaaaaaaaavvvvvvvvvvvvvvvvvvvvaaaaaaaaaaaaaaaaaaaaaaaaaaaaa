class Shape4 {
  protected int x, y;

  public void draw() {
    System.out.println("Shape Draw");
  }
}

class Rectangle4 extends Shape4 {
  private int width, height;

  public void draw() {
    System.out.println("Rectangle Draw");
  }
}

class Triangle4 extends Shape4 {
  private int base, height;

  public void draw() {
    System.out.println("Triangle Draw");
  }
}

class Circle4 extends Shape4 {
  private int radius;

  public void draw() {
    System.out.println("Circle Draw");
  }
}

public class ShapeTest2 {
  public static void main(String[] args) {
    Shape4 s1 = new Shape4();
    Shape4 s2 = new Rectangle4();
    Shape4 s3 = new Triangle4();
    Shape4 s4 = new Circle4();

    s1.draw();
    s2.draw();
    s3.draw();
    s4.draw();
  }
}

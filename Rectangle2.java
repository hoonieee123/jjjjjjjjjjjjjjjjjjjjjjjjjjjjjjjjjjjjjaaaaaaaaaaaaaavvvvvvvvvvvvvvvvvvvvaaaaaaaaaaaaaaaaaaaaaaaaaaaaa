public class Rectangle2 extends Shape2 {
  private int width;
  private int height;

  public Rectangle2(int x, int y, int width, int height) {
    super(x, y); // Shape 클래스 생성자 호출
    System.out.println("Rectangle2 생성자");
    this.width = width;
    this.height = height;
  }

  double calcArea() {
    return width * height;
  }
}

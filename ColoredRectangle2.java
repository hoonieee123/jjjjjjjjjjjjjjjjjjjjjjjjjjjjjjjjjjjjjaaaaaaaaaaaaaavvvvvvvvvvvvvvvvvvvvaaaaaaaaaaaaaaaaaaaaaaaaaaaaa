public class ColoredRectangle2 extends Rectangle2 {
  String color;

  public ColoredRectangle2(int x, int y, int width, int height, String color) {
    super(x, y, width, height); // Rectangle2 생성자 호출
    System.out.println("ColoredRectangle2 생성자");
    this.color = color;
  }

  public static void main(String[] args) {
    ColoredRectangle2 r = new ColoredRectangle2(10, 10, 20, 20, "blue");
  }
}

public class Rectangle1 extends Shape1 {
  private int width;
  private int height;

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  double area() {
    return (double) width * height;
  }

  void draw() {
    System.out.println("(" + this.getX() + ", " + this.getY() + ") 에 " +
            "가로 : " + getWidth() + " 세로 : " + getHeight() + " 인 직사각형을 그립니다.");
  }
}

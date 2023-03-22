public class Rectangle {
  private int x, y;
  private int width, height;


  Rectangle() {
    // Rectangle(int x, int y, int width, int height) {} 생성자 호출
    this(0, 0, 1, 1);
  }

  Rectangle(int width, int height) {
    // Rectangle(int x, int y, int width, int height) {} 생성자 호출
    this(0, 0, width, height);
  }

  Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
}

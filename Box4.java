public class Box4 {
  private int width, length, height;

  public Box4(int width, int length, int height) {
    this.width = width;
    this.length = length;
    this.height = height;
  }

  boolean isSameBox(Box4 b) {
    if (b.width == width && b.length == length && b.height == height) {
      return true;
    }
    else {
      return false;
    }
  }

}

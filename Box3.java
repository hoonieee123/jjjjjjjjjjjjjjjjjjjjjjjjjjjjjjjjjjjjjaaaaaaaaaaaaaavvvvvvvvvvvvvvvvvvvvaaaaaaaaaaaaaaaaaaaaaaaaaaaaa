public class Box3 {
  int width, length, height;
  int volume;

  public Box3(int width, int length, int height) {
    this.width = width;
    this.length = length;
    this.height = height;
    volume = width * length * height;
  }

  @Override
  public String toString() {
    return "Box3{" +
            "width=" + width +
            ", length=" + length +
            ", height=" + height +
            ", volume=" + volume +
            '}';
  }

  Box3 whoIsLarger(Box3 b1, Box3 b2) {
    if (b1.volume > b2.volume) {
      return b1;
    }
    else {
      return b2;
    }
  }
}

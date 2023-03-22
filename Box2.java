public class Box2 {
  private int width;
  private int length;
  private int height;

  Box2(int w, int l, int h) {
    width = w;
    length = l;
    height = h;
  }


  public int getVolume() {
    return width * length * height;
  }
}

public class BoxTest4 {
  public static void main(String[] args) {
    Box4 b1 = new Box4(10, 20, 30);
    Box4 b2 = new Box4(10, 20, 30);
    Box4 b3 = new Box4(13, 23, 33);

    System.out.println(b1.isSameBox(b1));
    System.out.println(b1.isSameBox(b2));
    System.out.println(b1.isSameBox(b3));
  }
}

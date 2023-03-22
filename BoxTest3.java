public class BoxTest3 {
  public static void main(String[] args) {
    Box3 box1 = new Box3(10, 20, 50);
    Box3 box2 = new Box3(10, 30, 30);

    Box3 largerBox = box1.whoIsLarger(box1, box2);
    System.out.println(largerBox);
  }
}

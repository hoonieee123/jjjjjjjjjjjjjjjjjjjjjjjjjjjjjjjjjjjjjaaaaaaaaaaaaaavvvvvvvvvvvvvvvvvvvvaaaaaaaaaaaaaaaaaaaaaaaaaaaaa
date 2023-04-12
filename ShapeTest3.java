public class ShapeTest3 {
  private static Shape4[] arrayOfShapes;

  public static void init() {
    arrayOfShapes = new Shape4[3];
    arrayOfShapes[0] = new Rectangle4();
    arrayOfShapes[1] = new Triangle4();
    arrayOfShapes[2] = new Circle4();
  }

  public static void drawAll() {
    for (int i = 0 ; i < arrayOfShapes.length ; i++) {
      arrayOfShapes[i].draw();
    }
  }

  public static void main(String[] args) {
    init();
    drawAll();
  }
}

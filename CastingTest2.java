class CarB {
  String color;
  int door;

  void drive() {
    System.out.println("drive");
  }

  void stop() {
    System.out.println("stop");
  }

}

class FireEngineB extends CarB {

  void water() {
    System.out.println("water");
  }

}
public class CastingTest2 {
  public static void main(String[] args) {
    CarB c1 = new CarB();
    CarB c2 = null;
    FireEngineB fe1 = null;

    c1.drive();
    fe1 = (FireEngineB) c1;
    fe1.drive();
    c2 = fe1;
    c2.drive();
  }
}

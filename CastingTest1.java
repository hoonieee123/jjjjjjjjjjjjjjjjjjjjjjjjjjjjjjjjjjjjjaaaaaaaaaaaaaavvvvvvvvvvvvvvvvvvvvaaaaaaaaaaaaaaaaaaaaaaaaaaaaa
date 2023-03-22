class CarA {
  String color;
  int door;

  void drive() {
    System.out.println("drive");
  }

  void stop() {
    System.out.println("stop");
  }

}

class FireEngineA extends CarA {

  void water() {
    System.out.println("water");
  }

}

public class CastingTest1 {
  public static void main(String[] args) {
    CarA c1 = null;
    FireEngineA fe1 = new FireEngineA();
    FireEngineA fe2 = null;

    c1 = (CarA)fe1;
    // c1.water;
    fe2 = (FireEngineA)c1;
    fe2.water();
  }
}

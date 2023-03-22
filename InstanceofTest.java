class CarC {
  int a = 1;
  int b = 2;
}

class FireEngineC extends CarC {
  int c = 3;
}

public class InstanceofTest {
  public static void main(String[] args) {
    CarC c1 = new CarC();
    FireEngineC fe1 = new FireEngineC();
    CarC c2 = null;
    FireEngineC fe2 = null;

    // c1 = (CarC) fe1;

    fe2 = (FireEngineC) c1;
    System.out.println(fe2.a); // error

    if (fe1 instanceof FireEngineC) {
      System.out.println("This is FireEngine instance");
    }
    if (fe1 instanceof CarC) {
      System.out.println("This is a car instance");
    }
    if (fe1 instanceof Object) {
      System.out.println("This is an Object instance");
    }
    System.out.println(fe1.getClass().getName());

  }
}

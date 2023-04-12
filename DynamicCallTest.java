class Animal2 {
  void sound() {
    System.out.println("Animal 클래스의 sound()");
  }
}

class Dog2 extends Animal2 {
  void sound() {
    System.out.println("멍멍");
  }
}

class Cat2 extends Animal2 {
  void sound() {
    System.out.println("야옹");
  }
}

public class DynamicCallTest {
  public static void main(String[] args) {
    Animal2 animal = new Animal2();
    Dog2 dog = new Dog2();
    Cat2 cat = new Cat2();

    Animal2 obj; 

    obj = animal; // Animal2 obj = new Animal2();
    obj.sound();

    obj = dog; // Animal2 obj = new Dog2();
    obj.sound();

    obj = cat; // Animal2 obj = new Cat2();
    obj.sound();
  }
}

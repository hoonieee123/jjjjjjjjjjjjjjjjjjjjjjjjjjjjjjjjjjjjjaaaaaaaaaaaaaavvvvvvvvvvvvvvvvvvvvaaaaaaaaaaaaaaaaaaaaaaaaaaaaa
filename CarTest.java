class Car {
  // 인스턴스 멤버 변수 선언
  String color;
  int speed;
  int gear;

  // toString() 메서드
  @Override
  public String toString() {
    return  "Car [color=" + color + ", speed =" + speed + ", gear=" + gear + "]";
  }

  // 인스턴스 멤버 메서드
  void changeGear(int g) {
    gear = g;
  }
  void speedUp() {
    speed = speed + 10;
  }
  void speedDown() {
    speed = speed - 10;
  }
  // 나중에 해봐야지...
  void fuelEfficiency() {
    System.out.println();
  }
}
public class CarTest {
  public static void main(String[] args) {
    // 객체 생성
    Car myCar = new Car();

    // 객체의 메서드 호출
    myCar.changeGear(1);
    myCar.speedUp();
    // toString() 호출
    System.out.println(myCar);
  }
}

public class Car {
  private String model;
  private String color;
  private int speed;

  private int id;
  static int numbers = 0;

  public Car(String m, String c, int s) {
   model = m;
   color = c;
   speed = s;

   id = ++numbers; // 클래스 멤버 변수는 유지
  }

  // 클래스 멤버 메서드는 인스턴스 멤버를 호출할 수 없다. 호출 때에 인스턴스 멤버가 존재하는지 아닌지 알 수 없기 때문이다.
  public static int getNumberOfCars() {
    return numbers;
  }

}

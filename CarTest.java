public class CarTest {
  public static void main(String[] args) {
    Car c1 = new Car("A", "black", 50);
    Car c2 = new Car("B", "white", 30);
    Car c3 = new Car("C", "red", 70);

    int n = Car.numbers;
    n = Car.getNumberOfCars();

    System.out.println("생성된 자동차 수 : " + n);
  }
}

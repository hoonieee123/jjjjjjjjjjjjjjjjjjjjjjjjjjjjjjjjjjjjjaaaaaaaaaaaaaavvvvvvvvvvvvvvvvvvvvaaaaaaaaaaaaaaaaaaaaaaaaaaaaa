public class Manager1Test {
  public static void main(String[] args) {
    Manager1 m = new Manager1("Tom", "Seoul", 1000000, 123456, 50000);

    System.out.println(m); // 상속받은 toString()
    m.test();
  }
}

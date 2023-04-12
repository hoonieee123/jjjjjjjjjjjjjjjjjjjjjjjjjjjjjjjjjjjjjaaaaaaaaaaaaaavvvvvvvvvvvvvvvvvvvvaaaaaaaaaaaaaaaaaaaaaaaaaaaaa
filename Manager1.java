public class Manager1 extends Employee1 {
  private int bonus;

  public Manager1(String name, String address, int salary, int rrn, int bonus) {
    super(name, address, salary, rrn); // 부모 클래스의 생성자
    this.bonus = bonus;
  }

  void test() {
    System.out.println("name = " + name); // public
    System.out.println("address = " + address); // default
    System.out.println("salary = " + salary); // protected
    // System.out.println("rrn = " + rrn); // private -> x
  }
}

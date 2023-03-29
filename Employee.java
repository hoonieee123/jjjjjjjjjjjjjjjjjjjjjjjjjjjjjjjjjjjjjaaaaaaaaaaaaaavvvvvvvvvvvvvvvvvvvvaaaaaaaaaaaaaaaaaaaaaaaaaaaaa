public class Employee {
  private String name;
  private double salary;

  private static int count = 0;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    count++;
  }

  protected void finalize() {
    count--;
  }

  // 클래스 멤버 변수에 접근하므로 클래스 멤버 메서드를 선언
  public static int getCount() {
    return count;
  }
}

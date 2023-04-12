public class EmployeeTest {
  public static void main(String[] args) {
    Employee e1, e2, e3;
    e1 = new Employee("John", 3300);
    e2 = new Employee("Smith", 5000);
    e3 = new Employee("Mark", 4000);

    int n = Employee.getCount();
    System.out.println("현재 직원 수 : " + n);
  }
}

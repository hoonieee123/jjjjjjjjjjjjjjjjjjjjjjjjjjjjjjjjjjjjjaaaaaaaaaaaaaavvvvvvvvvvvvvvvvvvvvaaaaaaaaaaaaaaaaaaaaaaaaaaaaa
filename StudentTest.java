public class StudentTest {
  public static void main(String[] args) {
    Student obj1 = new Student();
    System.out.println(obj1); // System.out.println(obj1.toString());

    Student obj2 = new Student(111, "Kim", 25);
    System.out.println(obj2); // System.out.println(obj2.toString());
  }
}

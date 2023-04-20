
public class Test {
  public static void main(String[] args) {
    Student[] stds = new Student[5];

    stds[0] = new Student("석진석", "2201363");
    stds[1] = new Student("이재일", "2201392");
    stds[2] = new Student("김일곤", "2201330");
    stds[3] = new Student("최진수", "1801295");
    stds[4] = new Student("조현준", "1901276");

    Util.selectionSort(stds);

    for (Student std: stds) {
      System.out.println(std);
    }
    System.out.println("caa".compareTo("aaa"));

  }
}
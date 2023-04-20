// Comparable 추상 클래스를 상속받는 Student 클래스 생성
// 최하위인 이 클래스는 추상 클래스에 존재하는 compareTo 추상 메서드를 구현해야 함.
public class Student extends Comparable {
  private String name;
  private String stdNum;

  // Constructor
  public Student(String name, String stdNum) {
    this.name = name;
    this.stdNum = stdNum;
  }

  // getter / setter
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getStdNum() {
    return stdNum;
  }
  public void setStdNum(String stdNum) {
    this.stdNum = stdNum;
  }

  // Object 클래스의 toString 메서드 오버라이딩
  @Override
  public String toString() {
    return "[이름: " + name + ", 학번: " + stdNum+ "]";
  }

  // Comparable 추상 클래스의 compareTo 추상 메서드 오버라이딩
  @Override
  public int compareTo(Comparable anotherVal) {
    Student std = (Student)anotherVal; // 하향 형변환.

    // 학번 순으로 정렬하는 예시.
    String yourStdNum = std.getStdNum();
    // java.lang 의 Comparable 인터페이스 안 compareTo 메서드를 통해
    // String 을 비교하는 경우 동일하면 0, 비교 대상이 포함되어 있으면 문자열의 길이 차, 다른 문자에 대해서는
    // 문자의 아스키 코드 값을 비교하여 아스키 코드 값의 차를 반환한다.
    return stdNum.compareTo(yourStdNum);
  }
}
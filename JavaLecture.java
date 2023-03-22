import java.time.LocalDate;

public class JavaLecture {
  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = new String("abc");

    System.out.println(str1 == "abc");
    System.out.println(str1 == str2);

    String str3 = "123";
    int strToInt = Integer.parseInt(str3);
    System.out.println(strToInt + 1);

    Boxxx b1 = new Boxxx(10, 20 ,30);
    Boxxx b2 = new Boxxx(20, 20 , 20);

    Boxxx myBox = b1.whoIsLargerBox(b1, b2);
    System.out.println(myBox.getVolume());
  }

// 언제 스태틱 메서드를 만들고 언제 인스턴스 메서드를 사용해야 하나?
// -> 인스턴스가 가지는 서로 다른 인스턴스 변수를 사용하는 메서드의 경우에는 인스턴스 메서드를 사용
// but 기능을 구현하는데에 인스턴스 변수를 사용하는 경우에는 스태틱 메서드를 사용

// UML!

// String 의 경우 프리미티브 타입이 아닌 클래스이다.
// 따라서 값 뿐만이 아닌 주소값 또한 가지므로 동일 비교 시 단순 == 대신 equal() 메서드를 사용하는 것이다.
// String 클래스의 경우 인스턴스 메서드이다. 왜냐하면 인자로 받은 문자열을 매개변수로 받아 인스턴스 변수를 가지고 메서드를 활용
// String str = "abc"; 는 String str = new String("abc")와 같다.
// String.charAt(0) 이 바로 되지 않듯이 String 클래스는 스태틱이 아닌 인스턴스 멤버이다.
// 하지만 str1 = "zzz"; 와 str2 = "zzz"; 에 대하여 == 연산자 사용 시
// boolean bool = str1 == str2; -> false 값을 기대할 수 있지만, 결과는 true 이다.
// -> 이것은 자바의 성능 최적화 (옵티마이징) 기능이 적용된 것일 뿐이다.
// String 은 이뮤터블, 변경이 불가능하다.
// 예로 concat 메서드를 사용하면 처음 String 이 변경되는 것이 아닌 합쳐진 문자열을 다른 변수에 저장하여 사용해야 한다.
// substring 메서드의 경우 (begin, end) 범위는 begin ~ end - 1 이다.
// String 클래스의 리터럴은 랩퍼 클래스를 이용하여 기본 자료형으로 바꿀 수 있다.
// String str = "123"; -> int strToInt = Interger.parseInt(str); 이것은 클래스에 바로 접근하여 쓰는 정적 메서드이다.

  // 접근 제어자.
// 객체의 멤버 변수에 잘못된 값으로 재할당할 수 없도록 접근 범위를 설정해야 한다. -> 기본적으로 멤버 변수에 private 사용
}
class Person {
  private int age;
  private float height;

  public void setAge(int argAge) {
    // logic...
    this.age = argAge;
  }

  public void getAge() {
    System.out.println(this.age);
  }
}


//  Person obj = new Person();
//  //obj.age = 999; -> 불가능
//  obj.setAge(20);
//  obj.getAge();

// -> 메서드 또한 값을 입력받는 것은 같으나, 메서드 내부에 로직을 추가하여 막무가내의 값을 넣는 것을 방지할 수 있다.
// -> 프로그래머가 멤버 변수 이름을 변경하는 경우, 메서드 내 변수 이름만 변경하면 되기에 유지보수가 간단해진다.

// 멤버 변수를 private 로 설정하는 이유
// 잘못된 값을 설정하는 것을 막을 수 있다.
// 읽기 전용 멤버 변수로 만들 수 있다.
// 클래스 소스 코드를 수정할 때, 그 클래스를 사용하는 다른 코드에 미치는 영향을 최소화할 수 있다.

//public class Student {
//  private String name;
//  private int birthYear;
//
//  public void setName(String argName) {
//    this.name = argName;
//  }
//
//  public void setBirthYear(int argYear) {
//    if (argYear >= 1900) {
//      this.birthYear = argYear;
//    }
//  }
//
//  public int getAge() {
//    LocalDate date = LocalDate.now(); // static
//    int year = date.getYear();
//    return year - birthYear;
//  }
//}

// protected 로 허용이 될까? 이런게 시험? 크크크

//public class safeArray {
//  private int[] a;
//
//  public void createArray(int size) {
//    a = new int[size];
//  }
//
//  public int get(int index) {
//    if (index >= 0 && index < a.length) return a[index];
//    System.out.println("잘못된 인덱스 : " + index);
//    return -1;
//  }
//
//  public void put(int index, int value) {
//    if (index >= 0 && index < a.length) {
//      a[index] = value;
//      return;
//    }
//    System.out.println();
//  }
//
//
//}
// -> public 은 멤버 메서드, private 는 멤버 변수로 대부분 지정

// 생성자는 클래스 내부에 작성하는 특별한 메서드
// 모든 클래스 내에 반드시 1개 이상 존재
// 개발자가 직접 구현하지 않으면 자바에서 기본적으로 자동 생성 default construct
// 객체를 생성함과 동시에 멤버 변수를 초기화하는 역할
// 클래스 이름과 동일하며 리턴값이 없다.
// 생성자도 오버로딩이 가능하다.
//
//class Triangle {
//  int a;
//  int b;
//  int c;
//  int d;
//  int e;
//  public Triangle(int a, int b, int c, int d, int e) {
//    this.a = a;
//    this.b = b;
//    this.c = c;
//    this.d = d;
//    this.e = e;
//  }
//  public Triangle(int c, int d, int e) {
//    this(0, 0, c, d, e);
//  }
//}

// 이렇게 가능하다.

// 부모로부터 상속받은 메소드를 재정의 하는 것을 오버라이딩이라고 한다.

// 인스턴스 초기화 블록
// {

// }

// 메서드에서의 매개변수로 기본값과 참조값을 전달하는 경우
// call by value
// call by reference

class Boxxx {
  private int width, length, height;

  public Boxxx(int w, int l, int h) {
    this.width = w;
    this.length = l;
    this.height = h;
  }

  int getVolume() {
    return width * length * height;
  }


  public Boxxx whoIsLargerBox(Boxxx b1, Boxxx b2) {
    Boxxx box;
    return box = b1.getVolume() > b2.getVolume() ? b1 : b2;
  }
}











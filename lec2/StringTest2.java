import java.util.Scanner;

public class StringTest2 {
  public static void main(String[] args) {
    String str;
    Scanner scan = new Scanner(System.in);

    while(true) {
      System.out.println("문자열을 입력하세요.");
      str = scan.next();

      if (str.equals("quit")) break;

      if (str.matches("(.*)hello(.*)")) {
        System.out.println("hello 포함");
      }
      else System.out.println("hello 미포함");
    }
  }
}

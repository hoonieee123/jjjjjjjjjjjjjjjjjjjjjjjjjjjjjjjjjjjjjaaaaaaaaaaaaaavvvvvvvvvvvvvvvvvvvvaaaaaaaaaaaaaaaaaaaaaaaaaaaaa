public class StringTest {
  public static void main(String[] args) {
    String str = "This is string.";
    // String str = new String("This is string");

    String str1, str2, str3, str4;

    System.out.println("문자열의 길이 : " + str.length());

    str1 = str.concat(" isn't it?");
    str2 = str.replace('.', '!');
    str3 = str.substring(8, 14);
    str4 = str.toUpperCase();

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
  }
}

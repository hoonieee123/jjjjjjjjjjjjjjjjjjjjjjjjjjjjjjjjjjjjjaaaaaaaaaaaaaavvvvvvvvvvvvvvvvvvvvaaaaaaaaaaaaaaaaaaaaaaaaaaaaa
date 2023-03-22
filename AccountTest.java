public class AccountTest {
  public static void main(String[] args) {
    Account obj = new Account();
    // public 접근 제어자의 메서드를 통해 private 접근 제어자의 변수에 값을 대입
    obj.setName("Tom");
    obj.setBalance(100000);
    System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
  }
}

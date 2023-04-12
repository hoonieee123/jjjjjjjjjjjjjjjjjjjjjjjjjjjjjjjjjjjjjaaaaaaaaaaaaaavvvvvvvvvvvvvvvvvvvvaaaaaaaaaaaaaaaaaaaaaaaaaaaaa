// 왜 이자율이 낮은게 좋다고만 생각하지
class Bank {
  double getInterestRate() {
    return 0.0;
  }
}

class BadBank extends Bank {
  double getInterestRate() {
    return 10.0;
  }
}

class NormalBank extends Bank {
  double getInterestRate() {
    return 5.0;
  }
}

class GoodBank extends Bank {
  double getInterestRate() {
    return 3.0;
  }
}

public class BankTest {
  public static void main(String[] args) {
    BadBank bb = new BadBank();
    NormalBank nb = new NormalBank();
    GoodBank gb = new GoodBank();

    System.out.println(bb.getInterestRate());
    System.out.println(nb.getInterestRate());
    System.out.println(gb.getInterestRate());
  }
}

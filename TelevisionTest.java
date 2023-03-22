class Television {
  // 인스턴스 멤버 변수 선언
  int channel;
  int volume;
  boolean onOff;
}

public class TelevisionTest {
  public static void main(String[] args) {
    // 객체 생성
    Television myTv = new Television();

    // 객체 멤버 변수 접근
    myTv.channel = 7;
    myTv.volume = 9;
    myTv.onOff = true;

    // 또 다른 객체 생성
    Television yourTv = new Television();

    // 객체 멤버 변수 접근
    yourTv.channel = 9;
    yourTv.volume = 12;
    yourTv.onOff = true;

    System.out.println("나의 텔레비전 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
    System.out.println("너의 텔레비전 채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
  }
}

public class Television2 {
  private int channel;
  private int volume;
  private boolean onOff;

  Television2(int c, int v, boolean o) {
    channel = c;
    volume = v;
    onOff = o;
  }

  void print() {
    if (onOff == false) {
      System.out.println("전원이 꺼져 있습니다.");
    } else {
      System.out.println("채널은 " + channel + " 이고 볼륨은 " + volume + " 입니다.");
    }
  }
}

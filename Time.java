public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time() {
    this(0 , 0, 0);
  }

  public Time(int hour, int minute, int second) {
    this.hour = (hour >= 0 && hour < 24) ? hour : 0;
    this.minute = (minute >= 0 && minute < 60) ? minute : 0;
    this.second = (second >= 0 && second < 60) ? second : 0;
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute ,second);
  }
}

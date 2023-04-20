// 정렬을 담당하는 클래스
public class Util {

  // 매개 변수를 다르게 받아 각 자료형에 맞게 선택 정렬하는 selectionSort 메서드를 오버로딩.

  // int 자료형 배열을 인수로 받아 선택 정렬하는 메서드
  public static void selectionSort(int[] values) {

    for (int i = 0 ; i < values.length ; i++) {
      // 최소값을 가지는 요소의 인덱스
      int minIndex = i;

      for (int j = i + 1 ; j < values.length ; j++) {
        // minIndex 인덱스의 값과 1 ~ values.length 인덱스의 값과 비교
        // minIndex 인덱스의 값보다 작으면 그 인덱스의 값을 minIndex 로 설정한다.
        if (values[minIndex] > values[j]) {
          minIndex = j;
        }
      }
      // 현재 인덱스의 값과 minIndex 의 값과 순서를 바꾸는 swap 메서드 호출
      swap(i, minIndex, values);
    }
  }

  // 객체 배열을 인수로 받아 선택 정렬하는 메서드
  public static void selectionSort(Comparable[] values) {
    for (int i = 0; i < values.length; i++) {
      int minIndex = i;

      for (int j = i+1; j < values.length; j++ ) {
        // minIndex 인덱스의 값과 1 ~ values.length 인덱스의 값과 비교
        // 학번을 비교하여 선택 정렬하는 이번 예제에서는 Student 클래스의 오버라이딩된 compareTo 메서드를 호출한다.
        if (values[minIndex].compareTo(values[j]) > 0 ) {
          System.out.println(values[minIndex].compareTo(values[j]));
          minIndex = j;
        }
      }
      // 현재 인덱스의 값과 minIndex 의 값과 순서를 바꾸는 swap 메서드 호출
      swap(i, minIndex, values);
    }
  }

  // 매개 변수를 다르게 받아 배열에서의 요소 순서를 바꾸는 swap 메서드를 오버로딩.

  // int 자료형 배열의 요소 순서를 바꾸는 메서드
  private static void swap(int indexA, int indexB, int[] values) {
    int tmp = values[indexA];
    values[indexA] = values[indexB];
    values[indexB] = tmp;
  }

  // 객체 배열의 요소 순서를 바꾸는 메서드
  private static void swap(int indexA, int indexB, Comparable[] values) {
    Comparable tmp = values[indexA];
    values[indexA] = values[indexB];
    values[indexB] = tmp;
  }
}


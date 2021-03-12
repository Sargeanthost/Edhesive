package Unit_6;

public class U6_L4_Activity_Two {

  public static void swap(int[] arr, int i, int j) {
    if (i < arr.length && j < arr.length) {
      int iTemp = arr[i];
      arr[i] = arr[j];
      arr[j] = iTemp;
    }
  }

  public static void allSwap(int[] arr) {
    if (arr.length % 2 == 0) {
      for (int k = 0; k < arr.length; k += 2) {
        int kTemp = arr[k];
        arr[k] = arr[k + 1];
        arr[k + 1] = kTemp;
      }
    }
  }
}

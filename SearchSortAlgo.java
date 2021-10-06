
public class SearchSortAlgo {

  public static void selectionSort(int[] array) {
    // Sorting in assending order
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      // swaping elements
      int minValue = array[minIndex];
      array[minIndex] = array[i];
      array[i] = minValue;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + "  ");
    }
  }

  public static void main(String[] args) {

    int[] array = { 2, 1, 3, 5, 6, 8, 7, 45, 15, 35, 87 };

    selectionSort(array);

  }

}

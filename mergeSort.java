// Merge Sort

  public static void mergeSort(int[] array, int arraySize) {

    // Spliting array into two parts
    if (array.length % 2 == 0) {
      // array with even size
      int mid = array.length / 2;

      int[] arrayA = new int[mid];
      int[] arrayB = new int[mid];

       // filling first array
      for (int i = 0; i < mid; i++) {
        arrayA[i] = array[i];
      }
      
      // filling second array
      for (int i = 0; i < mid; i++) {
        arrayB[i] = array[i + (mid)];

      }
      
      // sorting arrays separately 
      selectionSort(arrayA);
      selectionSort(arrayB);
      
      // combining arrays 

      int[] newArray = new int[arrayA.length + arrayB.length];
      System.arraycopy(arrayA, 0, newArray, 0, arrayA.length);
      System.arraycopy(arrayB, 0, newArray, arrayA.length, arrayB.length);
      System.out.println(Arrays.toString(newArray));
      
    } else {
      // array with odd size
      int mid = array.length / 2;

      int[] arrayA = new int[arraySize / 2];
      int[] arrayB = new int[(arraySize / 2) + 1];
      
      // filling in first array
      for (int i = 0; i < mid; i++) {
        arrayA[i] = array[i];
      }
      
      // filling in second array
      for (int i = 0; i < mid + 1; i++) {
        arrayB[i] = array[i + (mid)];

      }
      
      // sorting arrays separately
      selectionSort(arrayA);
      selectionSort(arrayB);
      
      // combining arrays 

      int[] newArray = new int[arrayA.length + arrayB.length];
      System.arraycopy(arrayA, 0, newArray, 0, arrayA.length);
      System.arraycopy(arrayB, 0, newArray, arrayA.length, arrayB.length);
      System.out.println(Arrays.toString(newArray));
    }

  }

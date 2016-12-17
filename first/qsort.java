class qsort{
  public static void main(String[] args){
    int[] arr = {7, 5, 34, 565, 232, 9, 0, 342, 31, 1411};
    int n = arr.length;
    printArray(arr, n);
    qsort(arr, 0, n-1);
    System.out.println("------------------------------");
    printArray(arr, n);

  }

  public static void printArray(int[] array, int n){
    for(int i=0; i<n; i++){
      System.out.println(array[i]);
    }
  }

  public static int partition(int[] array, int left, int right){
    int pivot = array[(left+right)/2];
    while(left<=right){
      while (array[left] < pivot) {
        left++;
      }
      while(array[right] > pivot){
        right--;
      }
      if(left<=right){
        swap(left, right, array);
        left++;
        right++;
      }
    }
    return left;
  }

  public static void qsort(int[] array, int left, int right){
    int index = partition(array, left, right);
    if(left < index-1)
      qsort(array, left, index-1);
    if(index < right)
      qsort(array, right, index);
  }

  public static void swap(int a, int b, int[] array){
    int temp = array[b];
    array[b]=array[a];
    array[a]=temp;
  }
}

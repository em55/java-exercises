class bsort{
  public static void main(String[] args){
    int[] arr = {7, 5, 34, 565, 232, 9, 0, 342, 31, 1411};
    int n = arr.length;
    printArray(arr, n);
    bsort(arr, n);
    printArray(arr, n);

  }

  public static void printArray(int[] array, int n){
    for(int i=0; i<n; i++){
      System.out.println(array[i]);
    }
  }

  public static void bsort(int[] array, int n){
    int a = 0;
    for(int i=0; i<n;i++){
      for(int j=1; j<n-i; j++){
        if(array[j-1]>array[j]){
          swap(j-1, j, array);
        }
      }
    }
  }

  public static void swap(int a, int b, int[] array){
    int temp = array[b];
    array[b]=array[a];
    array[a]=temp;
  }
}

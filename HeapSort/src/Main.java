public class Main {
   public static void heapSort(int arr[],int n) 
    { 
        for (int i = n / 2 - 1; i >= 0; i--) 
            maxHeapify(arr, n, i); 
  
        for (int i=n-1; i>0; i--) 
        { 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            maxHeapify(arr, i, 0); 
        } 
    } 
  
    public static void maxHeapify(int arr[], int size, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int left = 2*i + 1; // left = 2*i + 1 
        int right = 2*i + 2; // right = 2*i + 2 
  
        if (left < size && arr[left] > arr[largest]) 
            largest = left; 
  
        if (right < size && arr[right] > arr[largest]) 
            largest = right; 
  
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            maxHeapify(arr, size, largest); 
        } 
    } 
  
    static void printArray(int arr[],int n) 
    {  
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    } 
  
    public static void main(String args[]) 
    { 
        int array[] = {33, 11, 13, 1, 6, 7}; 
        int n=array.length;
        
        heapSort(array,n);
        System.out.println("Sorted array is:"); 
        printArray(array,n); 
    }      
}

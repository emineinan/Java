
import java.util.Arrays;

public class Main {
   public static void recursiveInsertionSort(int array[], int n){
       if (n <= 1) 
            return; 
       
        recursiveInsertionSort(array, n-1 ); 
       
        int lastElement = array[n-1]; 
        int k = n-2; 
       
        while (k >= 0 && array[k] > lastElement) 
        { 
            array[k+1] = array[k]; 
            k--; 
        } 
        array[k+1] = lastElement;   
    }
 
    public static void main(String[] args) 
    { 
        int array[] = {3, 8, 76, 1, 9}; 
        int length=array.length;
        recursiveInsertionSort(array, length); 
        System.out.println(Arrays.toString(array)); 
    }  
}

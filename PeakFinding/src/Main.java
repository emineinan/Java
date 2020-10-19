public class Main 
{ 
    static  int findingMaxinColumn(int[][] array, int rows,  
                       int mid, int max){
        int maxIndex=0;
        for(int i=0;i<rows;i++){
            if(max<array[i][mid]){
                max=array[i][mid];
                maxIndex=i;
            }
        }
        return maxIndex;   
    }
  

    static int displayingMaxValue(int[][] array, int rows,  
                       int mid, int max){
        for(int i=0;i<rows;i++){
            if(max<array[i][mid]){
               max=array[i][mid]; 
            }       
        }
        return max;   
    }
   
    
    static int findingPeakElement(int[][] array, int rows,  
                           int columns, int mid){
        int max = 0; 
        int maxIndex=findingMaxinColumn(array, rows, mid, max);
        max=displayingMaxValue(array, rows, mid, max);
        
        if(mid==0||mid==columns-1){ 
            return max;
        }
        if(max>=array[maxIndex][mid-1]&&max>=array[maxIndex][mid+1]){
            return max;
        }
        if (max<array[maxIndex][mid-1]){
            return findingPeakElement(array, rows, columns,  
                         (int)(mid-Math.ceil((double) mid / 2))); //Math.ceil rounds the number up.
        }
        
        return findingPeakElement(array, rows, columns,  
                         (int)(mid+Math.ceil((double) mid / 2))); //Math.ceil rounds the number up.
     
    } 
    
    public static void main(String[] args) 
    { 
        int[][] array = {{12, 8, 5}, 
                        { 11, 3, 6},  
                        { 10, 9, 2},  
                        { 8, 4, 1,}}; 
          
        int rows = 3, columns = 3; 
        System.out.println("The peak element is: "+findingPeakElement(array, rows, columns, columns/2)); 
    } 
 
} 

import java.util.Scanner;

public class Main {
    public static void displayEven(int evenArray[], int count1)
    {
    System.out.println("EVEN NUMBERS:");
    for(int i=0;i<count1;i++)
           System.out.println("\t"+evenArray[i]);
               
    }
    
    public static void displayOdd(int oddArray[], int count2)
    {
        System.out.println("ODD NUMBERS:");
    for(int i=0;i<count2;i++)
           
               System.out.println("\t"+oddArray[i]);
    }
    
    public static int maxEven(int evenArray[],int count1)
    {
    int maxeven=evenArray[0];
    for(int i=1;i<count1;i++)
    {
    if(maxeven<evenArray[i])
        maxeven=evenArray[i];
    }
      return maxeven;
    }
    
    public static int maxOdd(int oddArray[],int count2)
    {
    int maxodd=oddArray[0];
    for(int i=1;i<count2;i++)
    {
    if(maxodd<oddArray[i])
        maxodd=oddArray[i];
    }
      return maxodd;
    }
  
  public static void main(String[] args) {
      int[] oddArray=new int[10];
      int[] evenArray=new int[10];
      int num, count1=0, count2=0;
      int sum=0;
  
      Scanner input=new Scanner(System.in);
      System.out.println("Enter numbers (to stop enter -1):");
      num=input.nextInt();
      
      while(num!=-1)
      {
        if(num%2==0){
          evenArray[count1++]=num;
          sum+=num;
        }else{
        oddArray[count2++]=num;
        sum+=num;
        }
        num=input.nextInt();
      }
      
      double average=((double)sum/(count1+count2));
      displayEven(evenArray, count1);
      displayOdd(oddArray, count2);
      System.out.println("The sum of numbers is: "+sum);
      System.out.println("The average of numbers is: "+average);
      System.out.println("The maximum of the odd numbers: "+maxOdd(oddArray, count2));
      System.out.println("The maximum of the odd numbers: "+maxEven(evenArray, count1));
   }
}

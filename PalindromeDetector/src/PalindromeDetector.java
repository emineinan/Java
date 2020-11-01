
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromeDetector {
    
     public static boolean isPalindrome(String line, MyStack stack){
         int k=0;//We change our initial value depending on whether the String line size is odd or even.
         if(line.length()%2==0)
             k=(line.length()/2);
         else
             k=(line.length()/2)+1;
         
      for(int i=k;i<line.length();i++){ 
         if(line.charAt(i)!=stack.pop()){
             return false;
         }
     }
    
     return true;
}
    
 
  public static void main(String[] args) {
    
      MyStack stack=new MyStack();
    
     try(Scanner input=new Scanner(new FileReader("palindromes.txt"))){
         while(input.hasNextLine()){
             String line=input.nextLine();
             String nline=line.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
             nline=nline.replace("ı", "i");
            for(int i=0;i<(nline.length()/2);i++){
                Character ch=nline.charAt(i);
                stack.push(ch);
            }
            
            if(isPalindrome(nline, stack))
                 System.out.println("'"+line+"'"+" is a palindrome!");
        }    
        
      }catch (FileNotFoundException ex) {
          Logger.getLogger(PalindromeDetector.class.getName()).log(Level.SEVERE, null, ex);
      }
  
}
}


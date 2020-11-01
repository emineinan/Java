
import java.util.ArrayList;

public class MyStack {
private ArrayList<Character> stackList;
     
MyStack() {
   stackList = new ArrayList<>();
} 

//MyStack functions
       
public void push(char value) {
    stackList.add(value);
 }      
       
public boolean isEmpty() {
    if (stackList.isEmpty())
       return true;
    else 
        return false;        
}          
     
       
public int pop() {

    if (!isEmpty()) { 
       int popVal = stackList.get(stackList.size() - 1);
       stackList.remove(stackList.size() - 1);             
       return popVal;       
    } 
    else {
     System.out.print("The stack is empty!");
         return -1;         
    }     
}     
      
}
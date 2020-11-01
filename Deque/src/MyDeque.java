
import java.util.ArrayList;

public class MyDeque<T> {
    
private ArrayList<T> dequeList;

 public MyDeque() {
     dequeList= new ArrayList<>();
}
 
 //MyDeque functions
public void push(T item){
    dequeList.add(0,item);
}

public T pop(){
    if(dequeList.isEmpty()){
    System.out.println("Deque is empty!");
    }

    T rmv = dequeList.remove(0);
    return rmv;
}


public void inject(T item){
    dequeList.add(item);
}


public T eject(){
    if(dequeList.isEmpty()){
    System.out.println("Deque is epmty!");
    }

    T rmv = dequeList.remove(dequeList.size()-1);
    return rmv;
}
   
}


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
    HashMap<String, Integer> map=new HashMap<>();
    Scanner inputstr=new Scanner(System.in);
    Scanner inputfrequency=new Scanner(System.in);
    System.out.println("Please enter the name of the file you want to read(totc.txt, tomsawyer.txt, dyssy10.txt:");
    String fileName=inputstr.nextLine();
    
       try(Scanner input=new Scanner(new FileReader(fileName))) {
            while (input.hasNextLine()) {
            String nline=input.nextLine();
            String[] line=nline.toLowerCase().split("[^a-zA-Z']");
            for(int i=0;i<line.length;i++){
                if(line[i].length()>1)
                {
                 if(map.containsKey(line[i]))
                    map.put(line[i], map.get(line[i])+1);
                else
                    map.put(line[i], 1);}
            }}
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        try(Scanner input1=new Scanner(new FileReader("commonwords.txt"))) {
               while(input1.hasNextLine()){
                String commonwords=input1.nextLine();
                if(map.containsKey(commonwords))
                    map.remove(commonwords);
        }
      } catch (Exception e) {
          e.printStackTrace();
      }
        
      System.out.println("Please enter word frequency: ");
      int frequency=inputfrequency.nextInt();
      
      System.out.println("Java WordCounter "+fileName+" "+frequency);
        
         for(Map.Entry<String, Integer> entry:map.entrySet()){
            if(entry.getValue()>frequency)
            System.out.println(entry.getKey()+": "+entry.getValue());
         } 
}
}

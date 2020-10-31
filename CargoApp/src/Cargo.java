
import java.util.Scanner;

public class Cargo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Luggage no. "+(i+1));
            System.out.print("Belongs to: ");
            String belongsTo=input.nextLine();
            System.out.print("Enter weight in kilos: ");
            int weight=input.nextInt();
            input.nextLine();
            System.out.println("Enter capacity like Width:Height:Length");
            String capacity=input.nextLine();
            String capacities[]=capacity.split(":");
            double totalCapacity=Double.valueOf(capacities[0])*Double.valueOf(capacities[1])*Double.valueOf(capacities[2])/1000;
            
            Luggage l1=new Luggage(belongsTo, weight, totalCapacity);
            LuggageList.addLuggage(l1);
            System.out.println("--------------------------------------------------------------------------------");
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Here is a list of the luggages (using toString() method of list object)...");
        LuggageList.display();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Which luggage would you delete?\nEnter an ID: ");
        int id=input.nextInt();
        System.out.println(LuggageList.removeLuggage(String.valueOf(id)));
        String x=input.nextLine();
        LuggageList.display();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Whoose luggage would you like to search?: ");
        String name=input.nextLine();
        
        System.out.println("Here is the luggage you were looking for...");
        System.out.println(LuggageList.getLuggage(name));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("The luggage belonging to: "+LuggageList.getHighestCapacityLuggage().getBelongsTo()+" has the highest capacity of "+LuggageList.getHighestCapacityLuggage().getCapacityLt()+" liters.");
        
}
    
}

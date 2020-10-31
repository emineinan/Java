
import Memory.Alzheimer;
import Memory.Amnesia;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   Scanner inputstr=new Scanner(System.in);
   
   System.out.print("Deficit id:");
   String deficitId=inputstr.nextLine();
   
   System.out.print("memory loss:");
   String memoryLoss=inputstr.nextLine();
   
   System.out.println("Clinical Cases");
   System.out.print("patient id:");
   int patientId=input.nextInt();
   
   System.out.print("patient name:");
   String name=inputstr.nextLine();
   
   System.out.print("patient surname:");
   String surname=inputstr.nextLine();
   
   System.out.print("age:");
   int age=input.nextInt();
   
   System.out.print("gender:");
   String gender=inputstr.nextLine();
   
   System.out.println("deficit type(amnesia or alzheimer):");
   String deficitType=inputstr.nextLine();
   
   if(deficitType.equals("amnesia")){
       System.out.println("amnesia type: ");
       String amnesiaType=inputstr.nextLine();
       
       System.out.println("cause:");
       String cause=inputstr.nextLine();
       
       System.out.println("brain location:");
       String brainLocation=inputstr.nextLine();
       
      Amnesia a=new Amnesia(amnesiaType, cause, brainLocation, deficitId, memoryLoss, deficitId, name, surname, age, gender);
      InfoClass.addMemory(a);
       
   }
   else{
       System.out.println("Affected area: ");
       String decliningArea=inputstr.nextLine();

       Alzheimer a=new Alzheimer(decliningArea, deficitId, memoryLoss, deficitId, name, surname, age, gender);
       InfoClass.addMemory(a);
   }
   
        System.out.println(InfoClass.getAllMemory());
   
   
}
}

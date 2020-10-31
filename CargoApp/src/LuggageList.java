public class LuggageList {
    public static final int MAXCOUNT=5;
    public static final int MAXKILOS=50;
    private static Luggage[] myLuggages=new Luggage[MAXCOUNT];
    private static int totalKilo;
    private static int totalLuggageCount;
    
    /////////////////////////////////////////////
    public static boolean addLuggage(Luggage x)
    {
      if(totalLuggageCount==MAXCOUNT|| (totalKilo+x.getWeight())>MAXKILOS)
      {
          System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!");
          return false;
      }
      
      else
      {
          myLuggages[totalLuggageCount++]=x;
          totalKilo+=x.getWeight();
          System.out.println("The luggage belonging to: "+x.getBelongsTo()+" is added to the list.");
       if(totalLuggageCount==MAXCOUNT||(totalKilo+x.getWeight())>MAXKILOS)   
     System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!");
         return true;
      }
          
    }
           
      
    /////////////////////////////////////////////
    public static boolean removeLuggage(String lugId)
    {
        for(int i=0;i<totalLuggageCount;i++)
        {
            if(myLuggages[i].getLuggageId()==Integer.parseInt(lugId))
            {
                System.out.println("The luggage belonging to: "+myLuggages[i].getBelongsTo()+" is removed from the list.");
                myLuggages[totalLuggageCount--]=myLuggages[i];
                return true;
            }
        }    
                
        return false;    
    }    
    /////////////////////////////////////////////
    public static Luggage getLuggage(String findbelongs)
    {
        
        for(int i=0;i<totalLuggageCount;i++)
        {
        if(myLuggages[i].getBelongsTo().equalsIgnoreCase(findbelongs))
        return myLuggages[i];
        
        }
        return null;
        
    }    
    
    /////////////////////////////////////////////
    public static Luggage[] getAll()
    {
        return myLuggages;
    }
    /////////////////////////////////////////////
    public static Luggage getHighestCapacityLuggage()
    {  
        int maxIndex=0;
        
        for(int i=1;i<totalLuggageCount;i++)
        {
            if(myLuggages[maxIndex].getCapacityLt()<myLuggages[i].getCapacityLt())
            maxIndex=i;
           
        }
        return myLuggages[maxIndex];
    }
    /////////////////////////////////////////////
    public static void display()
    {
        for(int i=0;i<totalLuggageCount;i++)
            System.out.println(myLuggages[i].toString());
    }
    /////////////////////////////////////////////
    
    
}

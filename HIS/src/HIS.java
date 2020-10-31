public class HIS {
    private static final int MAXSIZE=10;
    private static Patient myPatients[]=new Patient[MAXSIZE];
    private static int index=0;
    ///////////////////////////////////////////////////////
    public static int indexOf(int id)
    {
    for(int i=0;i<MAXSIZE;i++)
    {
    if(myPatients[i].getId()==id)
      return i;
     
    }
    return -1;
    }
    ///////////////////////////////////////////////////////
    public static int indexOf(Patient pat)
    {
    for(int i=0;i<index;i++)
    {
    if(myPatients[i].getName().equalsIgnoreCase(pat.getName()))
        return i;
    }
    return -1;
    }
    ///////////////////////////////////////////////////////
    public static boolean addPatient(Patient newpat)
    {
    if(index<MAXSIZE)
    {
      if(indexOf(newpat)>=0)
        return false;
    
      else
      {
      myPatients[index++]=newpat;
      return true;
      }
    }
    return false;
    }
    ///////////////////////////////////////////////////////
     public static boolean removePatient(int patId)
     {
     int i=indexOf(patId);
     if(index>=0)
     {
        myPatients[i]=null;
        myPatients[i]=myPatients[index];
        myPatients[index--]=null;
        return true;
     }    
     return false;
     }
    ///////////////////////////////////////////////////////
     public static String display()
     {
     String output="";
     for(int i=0;i<index;i++)
         output+=myPatients[i].toString();
     
     return output;
     }
     
 
}

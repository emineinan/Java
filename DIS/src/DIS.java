public class DIS {

    private static final int MAX_SIZE = 10;
    private static Doctor[] myDoctors = new Doctor[MAX_SIZE];
    private static int index = 0;

    public static int indexOf(int id) {
        for (int i = 0; i < index; i++) {
            if (myDoctors[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(Doctor dct) {
        for (int i = 0; i < index; i++) {
            if (myDoctors[i].equals(dct)) {
                return i;
            }
        }
        return -1;
    }

    
    public  static boolean addDoctor(Doctor doc)
{
    if(index<MAX_SIZE){
                if(indexOf(doc)!=-1){
                    System.out.println("The Doctor is already in the list!");
                    return false;
                }
                else{
                    myDoctors[index++]=doc;
                    System.out.println("The Doctor is added to the list.");
                    return true;
                }
            }
    
return false;
}

   public static boolean removeDoctor(int id) {
        int removeindex = indexOf(id);
        if (removeindex!=-1) {
            index--;
            myDoctors[removeindex] = myDoctors[index];
            return true;

        }
        return false;
    }
    


    public static Doctor[] getAll() {
        return myDoctors;
    }

    public static Doctor search(String name, String surname) {
        for (int i = 0; i < index; i++) {
            if (myDoctors[i].getName().equalsIgnoreCase(name) && myDoctors[i].getSurname().equalsIgnoreCase(surname)) {
                return myDoctors[i];
            }
        }
        return null;
    }


    
public static String display()
{
String output="";
for(int i=0;i<index;i++)
    output+=myDoctors[i].toString();
return output;
}

}


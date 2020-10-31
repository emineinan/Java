import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> countryList=new ArrayList<>();
        countryList.add("ISTANBUL");
        countryList.add("DENMARK");
        countryList.add("TOKYO");
        countryList.add("BOSTON");
        countryList.add("OSLO");
        
        Collections.sort(countryList);
        for(int i=0;i<countryList.size();i++){
        System.out.println(countryList.get(i));}
}
}

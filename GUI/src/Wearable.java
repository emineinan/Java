public class Wearable extends Electronics {
    private String  bodypart;
    

    public Wearable(int id, String  brand, String type, double price, String bodypart)
    {
        super(id, brand,type,price);
        this.bodypart=bodypart;
    }

    public String getBodypart() {
        return bodypart;
    }

    
    
    @Override
    public String toString()
    {
        return("\nWearable Information:\n"+super.toString()+"\nBodypart: "+bodypart);

   
    }
}

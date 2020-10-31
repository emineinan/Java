public class Tv extends Electronics{
    private String type;
    private int screenSize;

    public Tv(String type, int screenSize, String brand, double price, int guarantee) {
        super(brand, price, guarantee);
        this.type = type;
        this.screenSize = screenSize;
    }

    
    @Override
    public String findPromotion()
    {
        if(type.equals("LCD") && price >500)
            return ("\nYou get a free toaster!\n");
        else if(type.equals("HD") && price >800)
            return ("\nYou get a free food processor!\n");
        else
            return ("\nNo promotion.\n");
    }

   
 @Override
    public String toString()
    {
        return("\nTV Information:\n"+super.toString()+"\nType : "+type+"\nScreen size: "+screenSize+"\n"+findPromotion());
    }

}

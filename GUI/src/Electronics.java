public class Electronics{
    protected int ID;
    protected String brand;
    protected double price;
    protected String type;
    protected static int total=0;

    public Electronics(int ID, String brand, String type, double price)
    {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.ID=ID;
        total++;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
    
     public double getPrice() {
        return price;
    }

    public int getID() {
        return ID;
    }
     
    public boolean checkID(int id) {
        if (this.ID == id) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int getTotal() {
        return (total);
    }

    public static void setTotal(int total) {
        Electronics.total = total;
    }
    
     
    @Override
    public String toString()
    {
        return("\nID: "+ID+"\nBrand: "+brand+"\nPrice: "+price+" TL"+"\nType: "+type);
    }
}

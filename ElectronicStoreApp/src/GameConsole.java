public class GameConsole extends Electronics{
  private int hdd;
  private double usb;

    public GameConsole(int hdd, double usb, String brand, double price, int guarantee) {
        super(brand, price, guarantee);
        this.hdd = hdd;
        this.usb = usb;
    }

    @Override
    public String toString() {
                return ("\nGame Console Information:\n" + super.toString() + "\nHDD  : " + hdd + "GB" + "\nUSB  : " + usb+"\n"+findPromotion());
    }

    @Override
    public String findPromotion() {
            if (hdd > 30) {
            price -= price * gameConsoleDiscount;
            return ("\nPrice after discount: " + price +"\n");
        }
        return "\nNo discount!\n";
    }

    }
  
  



public class Projector extends Electronics {

    int ansilumen;
    int lampHour;

    public Projector(String brand, double price, int guarantee, int ansilumen, int lampHour) {
        super(brand, price, guarantee);
        this.ansilumen = ansilumen;
        this.lampHour = lampHour;
    }

    @Override
    public String toString() {
        return ("\nProjector Information:\n" + super.toString() + "\nAnsilumen: " + ansilumen + "\nLamp Hour: " + lampHour+"\n"+findPromotion());
    }

    @Override
    public String findPromotion() {

        if (guarantee > 3) {
            price -= price * projectorDiscount;
            return ("\nPrice after discount: " + price +"\n");
        }
        return "\nNo discount!\n";
    }
}

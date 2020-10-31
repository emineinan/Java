class BasketItem{
    private Product prod;
    private int amount;
    
    public BasketItem(Product p, int a){
        prod = p;
        amount = a;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}


public class Basket {
    private final int MAX_PRODUCT = 5;
    private BasketItem[] basket = new BasketItem[MAX_PRODUCT];
    private int productNum = 0;
    private double basketSum = 0;
    
    public boolean addToBasket(Product p, int amount){
        for(int i = 0; i < productNum; i++){
            if(p.getId() == basket[i].getProd().getId()){
                basketSum += amount * p.getPrice();
                basket[i].setAmount(basket[i].getAmount()+amount);
                return true;
            }
        }
        if(productNum < MAX_PRODUCT){
            basket[productNum++] = new BasketItem(p, amount);
            basketSum += amount * p.getPrice();
            return true;
        }
        return false;
    }
    
    public boolean removeFromBasket(String name){
        for(int i = 0; i < productNum; i++){
            if(name.equals(basket[i].getProd().getName())){
               basketSum -= basket[i].getAmount() * basket[i].getProd().getPrice();
               basket[i] = basket[--productNum];
               return true;
            }
        }
        return false;
    }
    
    public void showBasketandSum(){
        for(int i = 0; i < productNum; i++){
            System.out.println(basket[i].getAmount() + " " + basket[i].getProd().getName() 
                    + " " + (basket[i].getAmount()*basket[i].getProd().getPrice()));
        }
        System.out.println("Total: " + basketSum);
    }
}


public class Customer {
    private String username;
    private String password;
    private Basket myBasket = new Basket();
    
    public Customer(String username_, String password_){
        username = username_;
        password = password_;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Basket getMyBasket() {
        return myBasket;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMyBasket(Basket myBasket) {
        this.myBasket = myBasket;
    }
     
}

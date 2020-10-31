import java.util.Scanner;

public class Test{

    private static final int MAX_PRODUCT = 3;
    private static final int MAX_CUSTOMER = 3;
    private static int productCount = 0;
    private static int customerCount = 0;
    private static Product[] productList = new Product[MAX_PRODUCT];
    private static Customer[] customerList = new Customer[MAX_CUSTOMER];
    
    public static int checkPassword(){
        Scanner sInput = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String username = sInput.nextLine();
        System.out.println("Enter password: ");
        String password = sInput.nextLine();
        
        for(int i = 0; i < MAX_CUSTOMER; i++){
            if(customerList[i].getUsername().equals(username)){
                if(customerList[i].getPassword().equals(password)){
                    return i;
                }
                else{
                    System.out.println("Password is not correct !!!");
                    return -1;
                }
            }
        }
        System.out.println("Username does not exist !!!");
        return -1;
    }
    
    public static void productList(){
        System.out.println("\nPRODUCT LIST");
        System.out.println("**************");
        for(int i = 0; i < MAX_PRODUCT; i++){
            System.out.println((i+1) + ". " + productList[i].getName() + " " + productList[i].getPrice());
        } 
    }
    
    public static void addProduct(int cIndex){
        Scanner nInput = new Scanner(System.in);
        productList();
        System.out.println("Enter a product to ADD your Basket: ");
        int pIndex = nInput.nextInt() - 1;
        System.out.println("Enter the amount: ");
        int amount = nInput.nextInt();

        customerList[cIndex].getMyBasket().addToBasket(productList[pIndex], amount);
    }
    
    public static void deleteProduct(int cIndex){
        Scanner sInput = new Scanner(System.in);
        showBasket(cIndex);
        System.out.println("Enter a product to DELETE from your Basket: ");
        String name = sInput.nextLine();

        customerList[cIndex].getMyBasket().removeFromBasket(name);
    }
    
    public static void showBasket(int cIndex){
        customerList[cIndex].getMyBasket().showBasketandSum();
    }
    
    public static void main(String[] args) {
        customerList[0] = new Customer("ali", "123");
        customerList[1] = new Customer("veli", "234");
        customerList[2] = new Customer("can", "345");
        
        productList[0] = new Product("Computer", 2358.5);
        productList[1] = new Product("Phone", 1230.55);
        productList[2] = new Product("Television", 3569.2);
        
        Scanner sInput = new Scanner(System.in);
        Scanner nInput = new Scanner(System.in);
        
        int cIndex;
        do{
            cIndex = checkPassword();
        }while(cIndex == -1);
        
        System.out.println("Welcome " + customerList[cIndex].getUsername());
        while (cIndex != -1){
            
            
            System.out.println("MENU");
            System.out.println("1. Add Product to MyBasket");
            System.out.println("2. Remove Product from MyBasket");
            System.out.println("3. Show MyBasket and Sum");
            int choice = nInput.nextInt();
            
            switch(choice){
                case 1:
                    addProduct(cIndex);
                    break;
                case 2:
                    deleteProduct(cIndex);
                    break;
                case 3:
                    showBasket(cIndex);
                    break;
                default:
                    System.out.println("You entered a wrong number");
                    break;
            }
            
            System.out.println("Press (Y) to continue, (N) to Logout");
            String decision = sInput.nextLine();
            if(decision.equals("N")){
                cIndex = -1;
            }
        }  
        System.out.println("GOOD BYE!!!");
    }
}

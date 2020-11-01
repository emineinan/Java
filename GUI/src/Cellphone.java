public class Cellphone extends Electronics {

    private String operator;

    public Cellphone(int id, String brand, String type, double price, String operator) {
        super(id, brand, type, price);
     
        this.operator = operator;
    }

    public String findPromotion()
    {
        if(operator.equalsIgnoreCase("turkcell"))
           return("it is free in the mornings");
        else if(operator.equalsIgnoreCase("vodafone"))
            return("it is free in the lunch times");
        else if(operator.equalsIgnoreCase("avea"))
            return("it is free in the evenings");
        else
            return("No promotion");
    }
    
    public String getOperator() {
        return operator;
    }

    @Override
    public String toString()
    {
        return("\nCellphone Information:\n"+super.toString()+"\nOperator  : "+operator);
    
    }
}

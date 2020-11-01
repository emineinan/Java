
import java.util.Scanner;

public class ExternalBattery extends Electronics {
    
    private int cablelength;
    private int capacity;

    

    public ExternalBattery(int id, String brand, String type, double price, int capacity, int cablelength) {
        
        super(id, brand, type, price);
        this.capacity = capacity;
        this.cablelength = cablelength;
    }

    
    public int getCapacity() {
        return capacity;
    }
    
    public int getCableLength() {
        return cablelength;
    }

    @Override
    public String toString()
    {
        return("\nExternal battery Information:\n"+super.toString()+"\nCapacity  : "+capacity+"\nCable length  : "+cablelength);
    
    }
}

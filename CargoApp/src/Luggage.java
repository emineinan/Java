public class Luggage {
    private int luggageId;
    private String belongsTo;
    private  int weight;       
    private  double capacityLt;       
    private static int lastUsedId=500;  

    public Luggage(String belongsTo, int weight, double capacityLt) {
        this.belongsTo = belongsTo;
        this.weight = weight;
        this.capacityLt = capacityLt;
        luggageId=lastUsedId;
        lastUsedId++;
    }

    public int getLuggageId() {
        return luggageId;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public int getWeight() {
        return weight;
    }

    public double getCapacityLt() {
        return capacityLt;
    }

    @Override
    public String toString() {
        return "Luggage ID:"+ luggageId + "\nBelongs To: " + belongsTo + "\nWeight of the luggage:" + weight + "\nCapacity of the luggage: " + capacityLt;
    }
    
    
    
}

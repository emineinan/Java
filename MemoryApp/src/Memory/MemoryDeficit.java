
package Memory;

import Improvement.Improvement;

public abstract class MemoryDeficit implements Improvement{
    
   protected String deficitId;
   protected String memoryLoss;
   private static int totalDeficit=0;

    public MemoryDeficit(String deficitId, String memoryLoss) {
        this.deficitId = deficitId;
        this.memoryLoss = memoryLoss;
        totalDeficit++;
    }

    public String getDeficitId() {
        return deficitId;
    }

    public static int getTotalDeficit() {
        return totalDeficit;
    }

    @Override
    public String toString() {
        return "MemoryDeficit{" + "deficitId=" + deficitId + ", memoryLoss=" + memoryLoss + '}';
    }
    
    public boolean findId(String deficitId){
        if(deficitId.equals(this.deficitId))
            return true;
        else
            return false;
    }
   
   
    
}

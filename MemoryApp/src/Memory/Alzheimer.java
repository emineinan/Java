package Memory;

import ClinicalCase.ClinicalCase;

public class Alzheimer extends MemoryDeficit{
    private String decliningArea;
    private static int totalAlzheimer=0;
    private ClinicalCase clin;

    public Alzheimer(String decliningArea, String deficitId, String memoryLoss,String patientId ,String name,String surname ,int age,String gender)
    {
        super(deficitId, memoryLoss);
        this.decliningArea = decliningArea;
        clin=new ClinicalCase(patientId, name, surname, age, gender);
        totalAlzheimer++;
    }

   

    @Override
    public String toString() {
        return "Alzheimer{" + "decliningArea=" + decliningArea + ", clin=" + clin + '}';
    }

    public static int getTotalAlzheimer() {
        return totalAlzheimer;
    }

    @Override
    public String improveMemory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    
    
    
}

package Memory;

import ClinicalCase.ClinicalCase;

public class Amnesia extends MemoryDeficit{
    private String amnesiaType;
    private String cause;
    private String location;
    private ClinicalCase clin;
    private static  int totalAmnesia=0;

    public Amnesia(String amnesiaType, String cause, String location,String deficitId, String memoryLoss, String patientId ,String name,String surname ,int age,String gender) {
        super(deficitId, memoryLoss);
        this.amnesiaType = amnesiaType;
        this.cause = cause;
        this.location = location;
        this.clin = clin;
        clin=new ClinicalCase(patientId, name, surname, age, gender);
        totalAmnesia++;
    }

   
    @Override
    public String toString() {
        return "Amnesia{" + "amnesiaType=" + amnesiaType + ", cause=" + cause + ", location=" + location + ", clin=" + clin + '}';
    }

    public static int getTotalAmnesia() {
        return totalAmnesia;
    }

    @Override
    public String improveMemory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}

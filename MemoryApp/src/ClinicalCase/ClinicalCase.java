
package ClinicalCase;


public class ClinicalCase {
    private String patientId;
    private String name;
    private String surname;
    private int age;
    private String gender;

    public ClinicalCase(String patientId, String name, String surname, int age, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "ClinicalCase{" + "patientId=" + patientId + ", name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender + '}';
    }
    
    
    
}

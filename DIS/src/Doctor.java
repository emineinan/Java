public class Doctor {

    private int id;
    private String name;
    private String surname;
    private int patient_number;
    private static int nextId = 100;

    public Doctor(String name, String surname, int patient_number) {
        this.name = name;
        this.surname = surname;
        this.patient_number = patient_number;
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + this.id + "\n"
                + "NAME:" + this.name + "\n"
                + "SURNAME: " + this.surname + "\n"
                + "NUMBER of PATIENT:" + this.patient_number + "\n";

    }

    public boolean equals(Doctor dct) {
        if (this.name.equalsIgnoreCase(dct.getName())) {
            return true;
        } else if (this.surname.equalsIgnoreCase(dct.getSurname())) {
            return true;
        } else if (this.id == dct.getId()) {
            return true;
        } else {
            return false;
        }
    }

}

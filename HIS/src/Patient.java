public class Patient {
    private int id;
    private String name;
    private String disase;
    public static int lastUsedId=100;

    public Patient(String name, String disase) {
        this.name = name;
        this.disase = disase;
        id=lastUsedId;
        lastUsedId++;
    }

    @Override
    public String toString() {
        return "Patient\nid= " + id + "\nname=" + name + "\ndisase=" + disase+"\n\n";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisase() {
        return disase;
    }
    
    
    
    public boolean equals(Patient p)
    {
        if(p.getName().equalsIgnoreCase(this.name)==true)
            return true;
        else
            return false;
    }
}

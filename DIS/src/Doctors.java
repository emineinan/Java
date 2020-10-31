import java.util.Scanner;

public class Doctors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.println("How many doctor works in the X hospital: ");
        int manyWork = input.nextInt();
        String nameOfDoctor;
        String surnameOfDoctor;
        int patientNumber;
        for (int i = 0; i < manyWork; i++) {
            System.out.println("Enter the name of the doctor:");
            nameOfDoctor = stringInput.nextLine();
            System.out.println("Enter the surname of the doctor");
            surnameOfDoctor = stringInput.nextLine();
            System.out.println("Enter the patient number:");
            patientNumber = input.nextInt();
            if (DIS.addDoctor(new Doctor(nameOfDoctor, surnameOfDoctor, patientNumber))) {
                System.out.println("The doctor added to the list!! ");
            } else {
                System.out.println("The doctor is already in the list!! ");
                i--;
            }

        }
        System.out.println(DIS.display());

        System.out.println("Enter a doctor name and surname to search:");
        String searchName = stringInput.nextLine();
        String searchSurname = stringInput.nextLine();
        if (DIS.search(searchName, searchSurname) != null) {
            System.out.println(DIS.search(searchName, searchSurname).toString());

        } else {
            System.out.println("dont find!");
        }
        System.out.println("Enter a Doctor id to delete:");
        int removeID = input.nextInt();
        if (DIS.removeDoctor(removeID)) {
            System.out.println("the new list");
            System.out.println(DIS.display());
        } else {
            System.out.println("dont find");
        }

    }

}

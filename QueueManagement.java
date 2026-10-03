import java.util.Scanner;

public class QueueManagement {
    Scanner sc = new Scanner(System.in);
    int[] PatientId = new int[100];
    String[] PatientName = new String[100];
    int[] PatientAge = new int[100];
    String[] PatientGender = new String[100];
    int[] PatientPriority = new int[100];
    String[] PatientDisease = new String[100];
    String[] PatientDoctorName = new String[100];
    int count = 0;

    void searchPatient(int id) {
            for (int i = 0; i < count; i++) {
                if (PatientId[i] == id) {
                    System.out.println("Patient Found:");
                    System.out.println("Patient ID: " + PatientId[i]);
                    System.out.println("Patient Name: " + PatientName[i]);
                    System.out.println("Patient Age: " + PatientAge[i]);
                    System.out.println("Patient Gender: " + PatientGender[i]);
                    System.out.println("Patient Priority: " + (PatientPriority[i] == 1 ? "Emergency" : "Normal"));
                    System.out.println("Patient Disease: " + PatientDisease[i]);
                    System.out.println("Patient Doctor Name: " + PatientDoctorName[i]);
                } else {
                    System.out.println("Patient Not Found...");
                }
        }

    }

    void viewAllPatients() {
        if (count == 0) {
            System.out.println("No patients in the queue.");
            return;
        }
        System.out.println("Patient List:");
        for (int i = 0; i < count; i++) {
            System.out.println("Patient ID: " + PatientId[i]);
            System.out.println("Patient Name: " + PatientName[i]);
            System.out.println("Patient Age: " + PatientAge[i]);
            System.out.println("Patient Gender: " + PatientGender[i]);
            System.out.println("Patient Priority: " + (PatientPriority[i] == 1 ? "Emergency" : "Normal"));
            System.out.println("Patient Disease: " + PatientDisease[i]);
            System.out.println("Patient Doctor Name: " + PatientDoctorName[i]);
            System.out.println("-------------------------");
        }
    }

    void addPatient() {
        if (count < 100) {
            System.out.println("Enter Patient ID: ");
            PatientId[count] = sc.nextInt();
            System.out.println("Enter Patient Name: ");
            PatientName[count] = sc.nextLine();
            System.out.println("Enter Patient Age: ");
            PatientAge[count] = sc.nextInt();
            System.out.println("Enter Patient Gender: ");
            PatientGender[count] = sc.nextLine();
            System.out.println("Enter Patient Priority: 1 = Emergency, 2 = Normal ");
            PatientPriority[count] = sc.nextInt();
            System.out.println("Enter Patient Disease: ");
            PatientDisease[count] = sc.nextLine();
            System.out.println("Enter Patient Doctor Name: ");
            PatientDoctorName[count] = sc.nextLine();
            count++;
        } else {
            System.out.println("Queue is full!");
        }
        System.out.println("Patient added successfully.");
    }

    void menu() {
        System.out.println(" HOSPITAL QUEUE MANAGEMENT SYSTEM ");
        System.out.println("1. Add Patient");
        System.out.println("2. View All Patients");
        System.out.println("3. Search Patient");
        System.out.println("4. Call Next Patient");
        System.out.println("5. View Waiting Queue");
        System.out.println("6. Sort Patients");
        System.out.println("7. Update Patient");
        System.out.println("8. Remove Patient");
        System.out.println("9. Hospital Report");
        System.out.println("10. Exit");
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        QueueManagement obj = new QueueManagement();
        int choice;
        do {
            obj.menu();
            System.out.println("Enter Choice : ");
            choice = obj.sc.nextInt();
            switch (choice) {
                case 1:
                    obj.addPatient();
                    break;
                case 2:
                    obj.viewAllPatients();
                    break;
                case 3:
                    if (obj.count == 0) {
                        System.out.println("Please Add Patient ... ");
                      }
                      else
                      {
                         System.out.println("Enter Patient Id : ");
                        int id = obj.sc.nextInt();
                        obj.searchPatient(id);
                      }
                    break;
                case 10:
                    break;
            }
        } while (choice != 10);
    }
}
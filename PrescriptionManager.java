
package Unknown;
import java.util.ArrayList;

public class PrescriptionManager {
    private ArrayList<Prescription> prescriptions;

    public PrescriptionManager() {
        prescriptions = new ArrayList<>();
    }

    // Them don thuoc
    public void addPrescription(Prescription prescription) {
        if (prescription == null) {
            System.out.println("Don thuoc khong hop le!");
            return;
        }

        if (findPrescriptionById(prescription.getPrescriptionId()) != null) {
            System.out.println("Ma don thuoc da ton tai!");
            return;
        }

        prescriptions.add(prescription);
    }

    // Hien thi tat ca don thuoc
    public void displayAllPrescriptions() {
        if (prescriptions.isEmpty()) {
            System.out.println("Chua co don thuoc nao!");
            return;
        }
        for (Prescription prescription : prescriptions) {
            prescription.displayInfo();
        }
    }

    // Tim don thuoc theo ma
       public Prescription findPrescriptionById(String id) {
       for (Prescription prescription : prescriptions) {
          if (prescription.getPrescriptionId().equals(id)) {
               return prescription;
            }
        }

        return null;
    }
}

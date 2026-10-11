package Unknown;
import java.util.ArrayList;

public class Prescription {
    private String prescriptionId;
    private Patient patient;
    private String prescriptionDate;
    private String status;
    // Danh sách các dòng thuốc
    private ArrayList<PrescriptionItem> items = new ArrayList<>();
    public Prescription(String prescriptionId, Patient patient, String prescriptionDate,String status) {
        this.prescriptionId = prescriptionId;
        this.patient = patient;
        this.prescriptionDate = prescriptionDate;
        this.status = status;
    }
    public String getPrescriptionId() {
        return prescriptionId;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getPrescriptionDate() {
        return prescriptionDate;
    }
    public String getStatus() {
        return status;
    }
    public void addItem(PrescriptionItem item) {
        if (item == null) {
            System.out.println("Dong thuoc khong hop le!");
            return;
        }
        items.add(item);
    }
    public void displayInfo() {
        System.out.println("Mã đơn thuốc: " + prescriptionId);
        System.out.println("Ngày kê đơn: " + prescriptionDate);
        System.out.println("Trạng thái bệnh nhân hiện tại: " + status);
        System.out.println("=======================THÔNG TIN BỆNH NHÂN ĐANG KHÁM========================");
        patient.displayInfo();//Xuất ra mã,tên,ngày sinh,hướng dẫn sử dụng
        System.out.println("\nDANH SÁCH THUỐC:");
        if (items.isEmpty()) {
            System.out.println("Đơn này chưa có loại thuốc này.");
            return;
        }
        /*for (int i = 0; i < items.size(); i++) {
            PrescriptionItem item = items.get(i); // Lấy ra từng dòng thuốc theo vị trí i
            item.display();
            System.out.println("--------------------");
        }
        }*/
       for (PrescriptionItem item : items) {
            item.display();
            System.out.println("--------------------");
        }
        System.out.println("Tong so dong thuoc: " + items.size());
    }
}


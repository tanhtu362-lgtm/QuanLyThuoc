package Unknown;
public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient (
                1,"Nguyen Van A" , "30/4/1975" , "0123456789");
        Patient p2 = new Patient (
                2,"Nguyen Van B" , "31/7/2005" , "03645789281");
        p1.displayInfo();
        System.out.println("       ");
        p2.displayInfo();
        Medication m1 = new Medication(
                "101", "Paracetamol", "hộp", "3 năm sau",500
        );
        m1.displayInfo();
        m1.addStock(100);
        System.out.println("Số lượng thuốc trong kho là: " + m1.getStockQuantity());
        m1.removeStock(200);
        System.out.println("Số lượng thuốc còn lại trong kho là: " + m1.getStockQuantity());
        Medication m2 = new Medication(
                "102","VitaminC","viên","2 năm sau",200
        );
        m2.displayInfo();
        m2.addStock(125);
        System.out.println("Số lượng thuốc trong kho là: " + m2.getStockQuantity());
        m2.removeStock(50);
        System.out.println("Số lượng thuốc còn lại trong kho là: " + m2.getStockQuantity());
        Prescription rx1 = new Prescription(
                "RX001", p1, "09/10/2026","Vẫn khoẻ manh"
        );
        Prescription rx2 = new Prescription(
                "RX002", p2, "10/10/2026","Đã ổn định"
        );
        //một đối tượng có thể sử dụng hành vi của đối tượng khác thông qua tham chiếu của nó.
        rx1.displayInfo();
        rx2.displayInfo();

        PrescriptionItem n1 = new PrescriptionItem(m1,
                5,"Sau bữa ăn","2 lần/ngày ", "6 ngày"
        );
        n1.display();
        PrescriptionItem n2 = new PrescriptionItem(m2,
                5,"Sau bữa ăn","2 lần/ngày ", "5 ngày"
        );
        n2.display();

        PrescriptionItem item1 = new PrescriptionItem(
                m1, 5, "Sau bữa ăn", "2 lần/ngày", "6 ngày"
        );

        PrescriptionItem item2 = new PrescriptionItem(
                m2, 10, "Sau bữa ăn ", "2 lần/ ngày", "5 ngày"
        );
        rx1.addItem(item1);
        rx1.addItem(item2);

        rx1.displayInfo();


        PrescriptionManager manager = new PrescriptionManager();

        manager.addPrescription(rx1);
        manager.addPrescription(rx2);

      // Hien thi tat ca don
        manager.displayAllPrescriptions();

      // Tim don theo ma
        Prescription result = manager.findPrescriptionById("RX001");

        if (result != null) {
            System.out.println("Tim thay don thuoc:");
            result.displayInfo();
        } else {
            System.out.println("Khong tim thay don thuoc!");
        }

    }
}
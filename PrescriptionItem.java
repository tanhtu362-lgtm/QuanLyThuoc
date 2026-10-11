package Unknown;

public class PrescriptionItem {
    private Medication medication;
    private int quantity;
    private String dosageInstructions;
    private String frequency;
    private String durationDays;

    public PrescriptionItem(
            Medication medication, int quantity,String dosageInstructions,String frequency,String durationDays
    ){
        this.medication = medication;
        this.quantity = quantity;
        this.dosageInstructions = dosageInstructions;
        this.frequency = frequency;
        this.durationDays = durationDays;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosageInstructions() {
        return dosageInstructions;
    }

    public void setDosageInstructions(String dosageInstructions) {
        this.dosageInstructions = dosageInstructions;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(String durationDays) {
        this.durationDays = durationDays;
    }
    public void display(){
        System.out.println("===============THÔNG TIN CỦA THUỐC=============== " );
        System.out.println("Số lượng đơn thuốc: " + quantity);
        System.out.println("Liều lượng theo hướng dẫn: " + dosageInstructions);
        System.out.println("Tính thường xuyên: " + frequency);
        System.out.println("Thời lượng trong ngày: " + durationDays);
        medication.getName();

    }


}

package Unknown;

public class Medication{
    private String medicationId;
    private String name;
    private String unit;
    private String expiryDate;
    private int stockQuantity;

    public Medication(String medicationId,String name,String unit,String expiryDate,int stockQuantity){
        this.medicationId = medicationId;
        this.name = name;
        this.unit = unit;
        this.expiryDate = expiryDate;
        this.stockQuantity = stockQuantity;
    }

    public String getMedicationId() {
        return medicationId;
    }
    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        if(stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        }
        else{
            System.out.println("Số lượng tồn kho không hợp lệ");
        }

    }
    public void displayInfo() {
        System.out.println("Ma thuoc: " + medicationId);
        System.out.println("Tên thuốc: " + name);
        System.out.println("Ngày hết hạn: " + expiryDate);
        System.out.println("Don vi tinh: " + unit);
        System.out.println("So luong ton kho: " + stockQuantity);
    }
    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        }
        else {
            System.out.println("số lượng nhập không hợp lệ");
        }
    }
    public void removeStock(int quantity){
        if(quantity <= 0){
            System.out.println("Số lượng xuất không hợp lệ");
        }
        else if (quantity > stockQuantity){
            System.out.println("Số lượng thuốc không đủ trong kho ");
        }
        else{
            stockQuantity -= quantity;
            System.out.println("Xuất thuốc thành công!");
        }
    }
}

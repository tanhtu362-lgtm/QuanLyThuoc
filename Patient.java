package Unknown;

public class Patient{
    private int patientId;
    private String fullName;
    private String dateOfBirth;
    private String phone;

    public Patient(int patientId,String fullName,String dateOfBirth,String phone){
        this.patientId = patientId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;

    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void displayInfo(){
        System.out.println("Mã số Bệnh Nhân: " +  patientId );
        System.out.println("Tên Bệnh Nhân: " + fullName);
        System.out.println("Ngày Sinh: " + dateOfBirth);
        System.out.println("Số Điện Thoại: " + phone);
    }
}

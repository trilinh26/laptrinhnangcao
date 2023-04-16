package buoi1;

public class People { //lớp
    // thuộc tính
    private String ten;
    private boolean gioiTinh;
    private int tuoi;
    public People(){ // pt khởi tạo ko tham số có thuộc tính
        this.ten="mạc định";
        this.gioiTinh=false;
        this.tuoi=0;
    }
    public People(String ten , boolean gioiTinh,int tuoi){ // ptkt đầy đủ thuộc tính
        this.ten=ten;
        this.gioiTinh=gioiTinh;
        this.tuoi=tuoi;
    }
// pt getter,setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void an() {
        System.out.println("Đang ăn......");
    }//ptkt ăn

    public void ngu(){
        System.out.println("ngủ.....");
    }// ptkt ngủ

    @Override // ghi chú ghi đè
    public String toString() {
        return "tên: " + getTen() + ", tuổi: " + getTuoi() + "và giới tính: " + (isGioiTinh() ? "Nam" : "Nữ");
    }
}
//class PeopleTest {
//    public static void main(String[] args) {
//        People people = new People();
//        System.out.println(people);
//
//        people = new People("Nguyen Van C", false, 18);
//        System.out.println(people);
//
//        people.setTuoi(20);
//        System.out.println(people);
//    }
//}
//tạo lớp con từ lớp cha
class Student extends People{
    // thuộc tính lớp con
    private String tenLop;
    public Student(){
        super();// gọi đến ptkt lớp cha
        this.tenLop = "D101_C1K14";
    }
public Student(String tenLop){
        super();
        this.tenLop=tenLop;
}
public Student(String ten,boolean gioiTinh, int tuoi , String tenLop){
      super(ten,gioiTinh,tuoi);//gọi pt khởi tạo 3 tham số của lớp cha
        this.tenLop=tenLop;
}

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
public void hocTap(){
        System.out.println("đang học.....");
    } // ptkt học
    public String toString(){ // pt ghi đè
         return "Một học sinh có tên lớp: "   + getTenLop() + " ,đó là một lớp con của " + super.toString();
    }
}
// class StudentTest {
//    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println(student);
//
//        student = new Student("D101_C2K14");
//        System.out.println(student);
//
//        student = new Student("huong", false, 18, "IBSK1D1");
//        System.out.println(student);
//    }
//}
//tạo lớp con từ lớp cha
 class Employee extends People {
    private String congTy;
    public Employee(){
        super();
        this.congTy = "CodeGym";
    }

    public Employee(String congTy){
        super();
        this.congTy = congTy;
    }

    public Employee(String ten, boolean gioiTinh, int tuoi, String congTy) {
        super(ten, gioiTinh, tuoi);
        this.congTy = congTy;
    }

    public String getCongTy() {
        return congTy;
    }

    public void setCongTy(String congTy) {
        this.congTy = congTy;
    }

    public void congViec() {
        System.out.println("Đang làm việc.......");
    }

    @Override
    public String toString() {
        return "Một nhân viên làm việc tại: " + getCongTy() + " ,đó là một lớp con của " + super.toString();
    }
}

// class EmployeeTest {
//    public static void main(String[] args) {
//        Employee employee = new Employee();
//        System.out.println(employee);
//
//        employee = new Employee("linh", true, 19, "FPT");
//        System.out.println(employee);
//        employee.congViec();
//        employee.setCongTy("Viettel");
//        System.out.println(employee);
//        employee.congViec();
//    }
//}





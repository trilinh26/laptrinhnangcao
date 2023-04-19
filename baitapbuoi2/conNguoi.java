package baitapbuoi2;

public class conNguoi {
}
abstract class People {
    private String ten;
    private boolean gioiTinh;
    private int tuoi;
    public People(){

    }
    public People(String ten,int tuoi,boolean gioiTinh){
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }
    abstract void an();
    abstract void ngu();
    abstract void hoc();
}
interface Student{
    void dangKyKhoa(String khoa);
    void lopHoc();
}
interface Employee {
    void lamViec();

    void giaiLao();
}

class StudentImpl extends People implements Student {
    public StudentImpl(String ten, int tuoi, boolean gioiTinh) {
        super(ten, tuoi, gioiTinh);
    }

    @Override
    public void an() {
        System.out.println("đg ăn");
    }

    @Override
    public void ngu() {
        System.out.println("đg ngủ");
    }
    @Override
    public void hoc(){
        System.out.println("đg học");
    }
    @Override
    public void dangKyKhoa(String khoa) {
        System.out.println(khoa);
    }

    @Override
    public void lopHoc() {
        System.out.println("lop 12");
    }
}
class Test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("linh",20,true){};
        student.an();
        student.ngu();
        student.dangKyKhoa("Programming Node JS");
        student.lopHoc();
    }
}


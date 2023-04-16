package buoi1;

public class tron {
    private double banKinh;
    private String mauSac;
    public tron(double banKinh , String mauSac){
        this.banKinh=banKinh;
        this.mauSac=mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public double dienTich(){
        return Math.PI *  banKinh * banKinh;
    }
    public String toString(){
        return "hinh tron [bán kính = "+banKinh+", mauSac = "+mauSac+ " + " + "dien tich" + dienTich()+"]";
    }
}
//class  in{
//    public static void main(String[] args) {
//        tron oo=new tron(2,"đỏ");
//        System.out.println(oo);
//    }
//}
class hinhTru extends tron {
private double chieuCao;
    public hinhTru(double banKinh, String mauSac,double chieuCao) {
        super(banKinh, mauSac);//gọi dến ptkt 2 tham số từ lop cha
        this.chieuCao=chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double getVolume() {
        return dienTich() * chieuCao;
    }

    public String toString() {
        return "Cylinder[bk=" + getBanKinh() + ", mau=" + getMauSac() + ", cao=" + chieuCao +" dii"+getVolume()+ "]";
    }
}
class in {
    public static void main(String[] args) {


        hinhTru oo = new hinhTru(2, "vang", 4);
        System.out.println(oo);
    }
}
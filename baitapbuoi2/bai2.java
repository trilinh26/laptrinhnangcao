package baitapbuoi2;

public class bai2 {
}
interface  GeometricObject{
     double getArea();
     double getPerimeter();
}
class Circlee implements GeometricObject{
    private double radius;
    public Circlee(double radius){
        this.radius=radius;
    }
    @Override
   public double getArea() {
        return radius*radius*3.14;
    }
    @Override
   public double getPerimeter() {
        return (radius+radius)*2;
    }

    @Override
    public String toString() {
        return "Cirele[radius =  " +radius+" ]";

    }
}
class Rectanglee implements GeometricObject{
    private double width;
    private double length;
    public Rectanglee(double width, double length){
        this.width=width;
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
   public double getArea() {
        return width*length;
    }

    @Override
   public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectanglee[width =  " +width+ "length = " +length+" ]";
    }
}
class inil {
    public static void main(String[] args) {
        GeometricObject[] of = new GeometricObject[2];
        of[0] = new Circlee(3) {};
        System.out.println(of[0]);
        of[1] = new Rectanglee(2,4) {};
        System.out.println(of[1]);

    }
}
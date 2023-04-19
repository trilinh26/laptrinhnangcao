package baitapbuoi2;

public class bai1 {

}
abstract class Shape{
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color="red";
        this.filled=true;
    }
    public Shape(String color , boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape [color = "+color+"filled = "+filled+"]";
    }
}
 class Circle extends Shape{
    protected double radius;
    public Circle (){
        super();
        this.radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius*radius*3.14;
    }
    @Override
    public double getPerimeter(){
        return (radius+radius)/2;
    }

    @Override
    public String toString() {
        return "Circle [Shape[color = "+getColor()+", filled = "+isFilled()+"]"+",radius = "+radius+"]";
    }
}
class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double width , double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width , double length,String color,boolean filled){
      super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
@Override
  public   double getArea() {
        return width*length;
    }
@Override
public  double getPerimeter() {
        return width+length;
    }

    @Override
    public String toString() {
        return "[ Rectangle[Shape[color = "+getColor()+", filled = "+isFilled()+"]"+",width = "+width+",length = "+length+"]]";
    }
}
class Square  extends Rectangle{
   private double size;
public Square(){
    super();

}
public Square(double size){
    super();
    this.size=size;
    }
    public Square(double size,String color,boolean filled){
       setColor(color);
       setFilled(filled);
        this.size=size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

@Override
    public void setLength(double size) {
        setLength(size);
    }
@Override
    public void setWidth(double size) {
        setWidth(size);
    }

    @Override
    public String toString() {
        return "Sqare[Rectangle[Shape[color = "+", filled = "+isFilled()+"]"+",width = "+getWidth()+",length = "+getLength()+"]]";
    }
}
class inii{
    public static void main(String[] args) {
        Shape[] of = new Shape[3];
            of[0]=new Circle() {};
        System.out.println(of[0]);
of[1]=new Rectangle(){};
        System.out.println(of[1]);
        of[2]=new Square() {};
        System.out.println(of[2]);

    }
}
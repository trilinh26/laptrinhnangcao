package baitapbuoi2;

public class bai3 {
}
interface Movaable{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movaable {
private int x;
private int y;
private int xSpeed;
private int ySpeed;
public MovablePoint(int x , int y , int xSpeed , int ySpeed){
    this.x=x;
    this.y=y;
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
}
@Override
public  void moveUp(){
     y -=ySpeed;
}
@Override
    public void moveDown() {
     y+=ySpeed;
    }
    @Override
    public void moveLeft() {
        x-=xSpeed;
    }
    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override
    public String toString() {
        return "("+x+","+y+") speed = ("+x+","+y+")";
    }
}
class inn{
    public static void main(String[] args) {
        MovablePoint o =new MovablePoint(2,3,3,5);
        System.out.println(o);
    }
}
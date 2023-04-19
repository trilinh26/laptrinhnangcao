package baitapbuoi2;

public class bai4 {

}
// Khai báo interface
interface Movaablee{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePointt implements Movaablee{
    // khai báo thuộc tính
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    //khai báo phương thức đầy đủ tham số
    public MovablePointt(int x , int y , int xSpeed , int ySpeed){
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
        return "("+x+","+y+") speed = ("+xSpeed+","+ySpeed+")";
    }
}
class MovableCircle  implements Movaablee{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x , int y , int xSpeed , int ySpeed,int radius){
     center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
    @Override
    public  void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public String toString() {
        return "(X ,y speed = (x,y )"+",radius"+radius;
    }
}

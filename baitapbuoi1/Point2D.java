package buoi1;

public class Point2D { // lớp cha
    // thuộc tính
        private float x;
        private float y;
    public Point2D() { // ptkt ko tham số có thuộc tính
        this.x = 0.0f;
        this.y = 0.0f;
    }
        public Point2D(float x, float y) { // ptkt đầy đủ thuộc tính
            this.x = x;
            this.y = y;
        }
// getter setter
        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float[] getXY() {
            return new float[]{x, y};
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
// lớp con
    class Point3D extends Point2D {
        private float z;// thộc tính
        public Point3D() {
            super(); // gọi dến ptkt
            this.z = 0.0f;
        }
        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public float[] getXYZ() {
            return new float[]{getX(), getY(), z};
        }

        public void setXYZ(float x, float y, float z) {
            setXY(x, y);
            this.z = z;
        }

        @Override
        public String toString() { // pt ghi đè
            return "(" + getX() + "," + getY() + "," + z + ")";
        }
    }
//class inra {
//    public static void main(String[] args) {
//        Point2D oo = new Point2D();
//        System.out.println(oo);
//        Point3D ooo= new Point3D();
//        System.out.println(ooo);
//    }
//}
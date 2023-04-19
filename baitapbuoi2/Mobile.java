package baitapbuoi2;

 abstract class Mobile {
     public void downloadApp() {

     }
 }
class Iphone extends Mobile{
     @Override
     public void downloadApp(){
         System.out.println("downloadApp iphone");
     }
}
class Nokia extends Mobile{
    @Override
    public void downloadApp(){
        System.out.println("downloadApp Nokia");
    }
}
class in{
    public static void main(String[] args) {
        Iphone ip = new Iphone();
        Nokia no = new Nokia();
        ip.downloadApp();
        no.downloadApp();
    }
}
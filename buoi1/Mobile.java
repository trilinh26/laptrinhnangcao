package buoi1;

    public abstract class Mobile {
        public void downloadApp() {};
    }

     class IPhone extends Mobile {
        public void downloadApp() {
            System.out.println("Download from Appstore");
        };

    }

    class Nokia extends Mobile {
        public void downloadApp() {
            System.out.println("Download from CHPlay");
        };

    }

 class AndroidTest {
    public static void main(String[] args) {
        Nokia Nokia = new Nokia();
        Nokia.downloadApp();
        IPhone oob = new IPhone();
        oob.downloadApp();
    }
}

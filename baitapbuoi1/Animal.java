package buoi1;

public class Animal { // lơp cha
    // thuộc tính
        private double weight;
        private double height;

        public Animal() { // ptkt ko tham số
            this.weight = 0.0;
            this.weight = 0.0;
        }

        public Animal(double weight, double height) { // đầy đủ tam số
            this.weight = weight;
            this.height = height;
        }
// getter,setter
        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public String toString() { // pt ghi đè
            return "Một con vật có trọng lượng: " + getWeight() + " và chiều cao " + getHeight();
        }
    }
//     class AnimalTest {
//         public static void main(String[] args) {
//             Animal animal = new Animal();
//             System.out.println(animal);
//
//             Animal animal1 = new Animal(5, 6);
//             System.out.println(animal1);
//
//             Animal animal2 = new Animal();
//             animal2.setHeight(1);
//             animal2.setWeight(10);
//             System.out.println(animal2);
//         }
//     }
// lóp con từ lớp cha
class Cat extends Animal {
    private double age;

    public Cat() {
        super();
        this.age = 1.0;
    }

    public Cat(double age) {
        super();
        this.age = age;
    }

    public Cat(double weight, double height, double age) {
        super(weight, height);//gọi dến ptkt 2 tham số từ lop cha
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String sound() {
        return "Meo meo.....";
    }

    public String eat() {
        return "Chuột!!!";
    }

    public String toString() {
        return "Một con mèo với tuổi: " + getAge() + ", đó là một lớp con của " + super.toString();
    }
}
// class CatTest {
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println(cat);
//
//        cat = new Cat(3.5);
//        System.out.println(cat);
//
//        cat = new Cat(3.5, 5, 10);
//        System.out.println(cat);
//    }
//}
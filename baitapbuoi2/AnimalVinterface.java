package baitapbuoi2;

public class AnimalVinterface {
}
 abstract class animall {
    abstract String makeSound();
}
class Tiger extends animall{
    @Override
    public String makeSound(){
        return "tiger ";
    }
}
class Chicken extends animall{
    @Override
    public String makeSound(){
        return "chicken 1";
    }
}
interface Ediblee {
    String howToEat();
}
class chicken extends animall implements Ediblee {
    @Override
    public String makeSound() {
        return "Chicken: 2";
    }
    @Override
    public String howToEat() {
        return "gà ăn";
    }
}
abstract class Fruit implements Ediblee { }
class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple ăn";
    }
}
class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange ăn";
    }
}
class test {
    public static void main(String[] args) {
        animall[] animals = new animall[2];
        animals[0] = new Tiger();
        animals[1] = new chicken();
        for (animall animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof chicken) {
                Ediblee edibler = (chicken) animal;
                System.out.println(edibler.howToEat());
            }
            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Orange();
            fruits[1] = new Apple();
            for (Fruit fruit : fruits) {
                System.out.println(fruit.howToEat());
            }
        }
    }
}

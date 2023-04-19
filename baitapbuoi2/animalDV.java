package baitapbuoi2;
public abstract class animalDV {
    public abstract String makeSound();
}

 class Cat extends animalDV {
    @Override
    public String makeSound() {
        return "Cat: meow meow!";
    }
}
 interface Edible {
     String howToEat();
 }
     class cat extends animalDV implements Edible {
         @Override
         public String makeSound() {
             return "Cat: meow meow!";
         }

         @Override
         public String howToEat() {
             return "mouth";
         }
     }

 class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        animalDV[] animals = new animalDV[1];
        animals[0] = new cat();
        for (animalDV animal : animals) {
            System.out.println(animal.makeSound());

//           Edible e = new Edible.Cat();
//                System.out.println(e.howToEat());
            if (animal instanceof cat) {
                Edible edibler =  (cat) animal;
                System.out.println(edibler.howToEat());
            }

           }
        }
    }









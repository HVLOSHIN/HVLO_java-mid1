package generic.test.ex4;

import generic.animal.*;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("반달이", 100);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.checkup(dog); // 타입추론 적용됨
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("까미", 110);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger : " + bigger);
    }
}

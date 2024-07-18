package generic.test.ex4;

import generic.animal.*;

public class ComplexBoxMain {
    public static void main(String[] args) {
        Dog dog = new Dog("반달이",100);
        Cat cat = new Cat("야옹이", 100);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);
        hospital.printAndReturn(dog);

        hospital.printAndReturn(cat);
    }
}

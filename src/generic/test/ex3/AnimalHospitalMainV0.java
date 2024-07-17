package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("반달이",100);
        Cat cat = new Cat("야옹이",300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 : 개 병원에 고양이 전달
        //dogHospital.set(cat);  //불가능

        // 문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("까미", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}

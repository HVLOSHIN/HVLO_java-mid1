package generic.test.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    public void checkup(){
        // T의 타입을 아직 못정해서 메서드를 불러올수가 없다.

       /* System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();*/
    }

    /*public T bigger (T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }*/
}

package hashcode;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object ob = new Object();
        int hCode;
        hCode= ob.hashCode();
        System.out.println(hCode);
Animal human= new Animal();
        System.out.println(human.hashCode());
        human.age = 5;
        human.type = "разумный";
        human.say();
    }
}
class Animal{
    int age;
    String type ;
    void say(){
        System.out.println("different sounds");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return ((this.age-3)*7);
    }
}

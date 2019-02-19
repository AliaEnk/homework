package objectCasting;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        double y = 3.77;

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        a1=d;
        a2 =c;
boolean b = a1 instanceof  Dog;
if (b){
    Dog d2 = (Dog)a1;
}else {
    System.out.println("pam");
}

        System.out.println(b);
    }
}
class Animal{
    int weight =10;

}class Cat extends Animal{
    String breed = "Pers";
}
class Dog extends Animal{
    String nane = " Ada";
}

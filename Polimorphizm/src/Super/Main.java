package Super;

public class Main {
    public static void main(String[] args) {
  Dog d = new Dog(133,  54);
  d.show();
    }
}
class Animal{
    private int age;

    public int getAge() {
        return age;
    }

    Animal(int age){
        this.age= age;

    }
}
class Dog extends Animal{
    private int price;

    Dog(int price, int age) {
        super(age);
        this.price= price;
    }
    void show(){
        System.out.println("age в суперклассе: " + super.getAge());
        System.out.println("price в подклассе: " + this.price);

    }
}
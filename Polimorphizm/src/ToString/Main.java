package ToString;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Nayda", "Colly", 87);
        System.out.println( d.toString());
    }
}
class Dog{
    String name;
    String breed;
    int age;
    public Dog( String name, String breed, int age){
        this.age = age;
        this.breed = breed;
        this.name= name;
    }

   @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
              ", breed='" + breed + '\'' +
                ", age=" + age +
              '}';
   }
}
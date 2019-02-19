package Практическая_работа;

public class Main {
    public static void main(String[] args) {
  Entity h1 = new Human(34, " Benny", "Human");
  Entity h2 = new Entity();
  Human d = new Human();
        boolean b = h2 instanceof  Human;
        if (b){
            Human d2 = (Human) h1;
        }else {
            System.out.println("ou");
        }

        System.out.println(b);
        System.out.println(h1.toString());

    }
}

class Entity {
int age;
String name, breed;
public Entity Create(Object a){
    return (HigherIntelligence) a;
}

    @Override
    public String toString() {
        return "Entity{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

}
class Human extends Entity{
    public Human() {
    }

    public Human(int age, String name, String breed) {
    this.age = age;
    this.name = name;
    this.breed = breed;

}

public  Human h(){
    return new Human(18, "Victoria", " Human ");
}
public Human h4 (){
        return new Human();
}


}
class HigherIntelligence extends Entity{
    public HigherIntelligence(int age, String name, String breed){
        this.age=age;
        this.name = name;
        this.breed = breed;

 }
}

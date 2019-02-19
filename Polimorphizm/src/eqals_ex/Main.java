package eqals_ex;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("Aliona");
        String s2=new String("HuanitaMadlenKarla");
        String s3=new String( "Aliona");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        Dog d1 = new Dog("Малыш", "Хаски", 11);
        Dog d2 = new Dog("Найда","Дворняга", 8);
        Dog d3 = new Dog("Малыш","Хаски", 11);
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
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
        return "Cобака{" +
               "имя='" + name;
}
    public boolean equals(Dog d) {
        boolean result = this.age==((Dog)d).age&&
                this.breed.equals(((Dog)d).breed)&&
                this.name.equals(((Dog)d).name);
        return result;
    }
}


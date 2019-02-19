package Final;

public class Main {
    public static void main(String[] args) {
Sweet s = new Sweet();
//int x = 14;
//x++; complite eror
        //System.out.println(x);
        Demon Baltazar = new Demon(752);
        final int x = randomNumber();
        System.out.println(x);
    }
    static int randomNumber(){
        return (int)(Math.random()*100);
    }
}
 class Sweet{
void say(){
    System.out.println("Shurkh");
}
}
class Marmalade extends Sweet{
   @Override
    void say(){
       System.out.println("Shlyavk");
    }

}
class Demon{
    final int birthday;
    String surname;

    public Demon(int birthday) {
        this.birthday = birthday;
    }
}

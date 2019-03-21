package Homework_practice;

public class Main {
    public static void main(String[] args) {
        Sanatorium sa1 = new Sanatorium();
        Sanatorium sa2 = new Sanatorium();
        Resort r1 = new Resort();
        Resort r2 = new Resort();
        Resort r3 = new Resort();
        Clinic c1 = new Clinic();
        Clinic c2 = new Clinic();
        Clinic c3 = new Clinic();
        Clinic []c = {c1,c2,c3, sa1, sa2};
        for (Clinic temp:c) {
            temp.whoWasWhere();}
        Resort[]re = {r1,r2, r3, sa1.makeResort(),sa2.makeResort()};
        for (Resort temp:re) {
            temp.whoWasWhere();

        }

    }
}
class Sanatorium extends Clinic{
    @Override
    void whoWasWhere(){
        System.out.println("I rested in the sanatorium");
    }
    Resort makeResort(){
        return new Resort() {
            @Override
            void whoWasWhere() {
                System.out.println("I rested in the sanatorium");
            }
        };

    }

}
class Clinic{
    void whoWasWhere(){
        System.out.println("Examination in the clinic");
    }
}
class Resort{
    void whoWasWhere(){
        System.out.println("I rested at the resort");
    }
}

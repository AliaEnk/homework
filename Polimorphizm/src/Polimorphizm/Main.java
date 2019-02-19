package Polimorphizm;

public class Main {
    public static void main(String[] args) {
  Bird ostrich = new Ostrich();
  Bird owl  = new Owl();
  Bird pinguin = new Pinguin();
  Bird[]b ={ostrich,owl,pinguin};
  for (Bird temp:b){
      temp.move();
  }
  Ostrich ost1 = new Ostrich();
  Ostrich ost2 =(Ostrich) ost1.createBird();
    }
}
class Bird{
    void move(){
        System.out.println("Teleport using magic called...");
    }
    Bird createBird(){
            return new Bird();
    }
}
class Ostrich extends Bird{
    @Override
    void move() {
        System.out.println("Ostrich: Moves his head in the sand...");
    }
    @Override
    Bird createBird(){
        return new Ostrich();
    }
}
class Owl extends Bird{
    @Override
    void move() {
        System.out.println("Owl: Flies wherever you want... ");
    }
}
class Pinguin extends Bird{
    @Override
    void move() {
        System.out.println("Pinguin: Slip magic...");
    }
}


package abstrackt;

public class Main {
    public static void main(String[] args) {
SolarSystem  ss =new EarthPlanet();
ss.spin();
    }
}
 abstract class SolarSystem{
     abstract void spin();
     //{
       //  System.out.println();
     SolarSystem(){
         System.out.println("Solar");
     }
}
class EarthPlanet extends SolarSystem{
    @Override
    void spin(){
        System.out.println("around Sun, 3rd");
    }

}
class MarsPlanet extends SolarSystem{
   @Override
    void spin(){
        System.out.println("around Sun");
}}
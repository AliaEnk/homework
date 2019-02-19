package object;

public class Dispetcher {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Mazda";
        myCar.move();

        Account a1 = new Account();
        a1.name = "Alia";
        a1.UAH = 58488383.0;
        Account.courseUSDtoUAH =28.5;
        System.out.println("$"+a1.UAH/Account.courseUSDtoUAH);
    }
}

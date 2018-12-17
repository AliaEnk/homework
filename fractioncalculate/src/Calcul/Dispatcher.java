package Calcul;

public class Dispatcher {
    public static void main(String[] args) {
        Fraction f1 = new Fraction (3,9);
        Fraction f2 = new Fraction (6,1);
        Fraction summa = Controller.add(f1,f2);
        Fraction umn = Controller.muitiply(f1,f2);
        Fraction razn = Controller.substract(f1,f2);
        Fraction del = Controller.dividy(f1,f2);
        View.display(summa);
        View.display(umn);
        View.display(razn);
        View.display(del);

    }

}

package Calcul;

public class Controller {
    static Fraction add (Fraction a, Fraction b) {
        Fraction result = new Fraction();
        result.denominator = a.denominator * b.denominator;
        result.numerator = a.numerator*b.denominator + a.denominator*b.numerator;
        return result;

    }

    static Fraction muitiply (Fraction a, Fraction b) {
        Fraction result = new Fraction();
        result.numerator = a.numerator*b.numerator;
        result.denominator = a.denominator * b.denominator;
        return result;
    }

    static Fraction substract (Fraction a, Fraction b) {
        Fraction result = new Fraction();
        result.denominator = a.denominator * b.denominator;
        result.numerator = a.numerator*b.denominator - a.denominator*b.numerator;
        return result;
    }

    static Fraction dividy (Fraction a, Fraction b) {
        Fraction result = new Fraction();
        result.numerator = a.numerator*b.denominator;
        result.denominator = a.denominator * b.numerator;
        return result;
    }

 }
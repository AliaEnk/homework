package Pr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Geometricfigures[] c ={

         new Geometricfigures ("circle" ,0,3480,"круг"),
         new Geometricfigures("trapezium ",4,4767878,"трапеция"),
         new Geometricfigures("quadrangle ",4,556235,"четырехугольник"),
         new Geometricfigures ("oval ",0,3480,"овал"),
         new Geometricfigures("triangle",3,357663,"треугольник"),
         new Geometricfigures("parallelogram",4,3553235,"параллелограмм "),
         new Geometricfigures ("polygon",999,353,"многоугольник"),
         new Geometricfigures ("parallelogram",4,3553235,"параллелограмм "),
         new Geometricfigures("polygon",489,1,"многоугольник"),
         new Geometricfigures("polygon",407,17,"многоугольник")};

         Arrays.sort(c);
        for (Geometricfigures temp : c){
            System.out.println(temp.toString());


            }
        }
    }

class Geometricfigures implements Comparable{

    String type;
    int corners;
    int S;
    String name;

    Geometricfigures(String type, int corners, int S, String name) {
        this.type = type;
        this.corners = corners;
        this.S = S;
        this.name = name;
    }

    public String toString() {
        return "Car{" +
                "speed=" + type +
                ", price=" +
                corners +
                ", model='" + S + '\'' +
                ", color='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int a = this.type.compareTo(((Geometricfigures) o).type);
        if (a == 0) {
            a = this.corners - ((Geometricfigures) o).corners;
        }
        if (a == 0) {
            a = this.S - ((Geometricfigures) o).S;
        }
        if (a == 0) {
            a = this.name.compareTo(((Geometricfigures) o).name);
        }
        return a;
    }}





class  ComparatorByCorners implements Comparator{

    @Override
    public  int compare(Object o1, Object o2){
        return ((Geometricfigures)o1).corners - ((Geometricfigures)o2).corners;
    }}
    class  ComparatorByS implements Comparator {
        @Override
        public  int compare(Object o1, Object o2){
            return ((Geometricfigures)o1).S - ((Geometricfigures)o2).S;
}}
class  ComparatorByType implements Comparator {
    @Override
    public  int compare(Object o1, Object o2){
        return ((Geometricfigures) o1).compareTo(((Geometricfigures) o2).type);
    }}
class  ComparatorByN implements Comparator {
    @Override
    public  int compare(Object o1, Object o2){
        return ((Geometricfigures) o2).compareTo(((Geometricfigures) o2).name);
    }}

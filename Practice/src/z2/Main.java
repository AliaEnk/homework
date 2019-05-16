package z2;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/z1/data.ser")))
        {
            Student p = new Student("Sam", "Stud", 178, true);
            oos.writeObject(p);
            Student s = new Student("Sam", "Stud", 178, true);
            oos.writeObject(s);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/z1/data.ser")))
        {
            Student p=(Student) ois.readObject();
            System.out.printf( p.getSubject(), p.getSurname(), p.getMark());
            Student s=(Student) ois.readObject();
            System.out.printf( s.getSubject(), s.getSurname(), s.getMark());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }
}

class Student implements Serializable {
    String surname;
    String subject;
    int mark;
    transient boolean isPassed;

    public Student(String  surname, String subject, int mark, boolean isPassed){
        this.isPassed = isPassed;
        this.mark = mark;
        this. surname= surname;
        this.subject= subject;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }
}

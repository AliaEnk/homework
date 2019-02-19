package practice;


import java.util.Date;

public class Main2 {
    public static void main(String[] args) {
        User u1 = new User("Алекс", new Date(2000, 03, 11));
        User u2 = new User("Сэмми", new Date(2001, 10, 17));
        if (u1.date.after(u2.date)) {
            System.out.println(u1.name+ " младше " + u2.name);
        }
        if (u1.date.before(u2.date)) {
            System.out.println(u1.name+ " старше " + u2.name);
        }
        if (u1.date.equals(u2.date)) {
            System.out.println(u1.name+ " и " + u2.name+ " одного возраста");
        }
    }
}
class User{
    String name;
    Date date;

    public User(String name, Date date){
        this.name=name;
        this.date = date;
    }
}

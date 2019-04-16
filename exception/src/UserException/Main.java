package UserException;

public class Main {
    void doIt()throws WrongDayException{
        int dayOfWeek= (new java.util.Date()).getDay();
        if (dayOfWeek != 2 && dayOfWeek!=4){
            throw  new WrongDayException("вторник или четверг");}else {
            System.out.println("Все ок");
        }
    }
    public static void main(String[] args) {
        try {
            (new Main()).doIt();}catch (WrongDayException e){
            System.out.println("Звиняйте это можно сделать только в "+ e.getMessage());
        }

    }
}
class WrongDayException extends Exception {
    public WrongDayException() {
    }



    public WrongDayException(String msg) {
        super(msg);
    }
}

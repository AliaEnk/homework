package z1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
            Date d = new Date();
            SimpleDateFormat format5;
        SimpleDateFormat format6;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/z1/data.ser")))
        {
            format5 = new SimpleDateFormat(
                    "hh:mm:ss  dd.MMMM.yyyy ");
            oos.writeObject(format5);
            System.out.println(
                    format5.format(d));
            }catch (Exception e ){

        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/z1/data.ser")))
        {
            format5 =(SimpleDateFormat) ois.readObject();
            System.out.print( format5.toString());
            format6 = new SimpleDateFormat(
                    "hh:mm:ss  dd.MMMM.yyyy ");
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
          //  cal1.setTime(format5);
           // cal2.setTime(format6);

            if(cal1.after(cal2)){
                System.out.println("Date1 is after Date2");
            }

            if(cal1.before(cal2)){
                System.out.println("Date1 is before Date2");
            }

            if(cal1.equals(cal2)){
                System.out.println("Date1 is equal Date2");
            }

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        }
    }


package inputOutexception;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("src/input/OutputExeption/f1");
        try{f1.createNewFile();}catch (IOException e){
            System.out.println("coud not create file");
        }
        System.out.println(f1.length());
    }
}

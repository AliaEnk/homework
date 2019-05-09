package pr;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    File f = new File ("src/pr/Sample.txt");
    try {f.createNewFile();}catch (IOException e){}

        BufferedReader bf= new BufferedReader(new FileReader("src/pr/Sample.txt"));
        String line=bf.readLine();
        while(line!=null)
    {
        String[] simbol=line.split("k");
        System.out.println("this text contains " +simbol.length+ " characters <d>");
        line=bf.readLine();
    }
    }
}

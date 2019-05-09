package pr1_2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream("src/pr1_2/one.txt"));
        BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream("src/pr1_2/two.txt"));

        int b1 = 0, b2 = 0, pos = 1;
        while (b1 != -1 && b2 != -1) {
            if (b1 != b2) {
                System.out.println("Файлы отличаются в позиции " + pos);
            }
            pos++;
            b1 = fis1.read();
            b2 = fis2.read();
        }
        if (b1 != b2) {
            System.out.println("они имеют разный размер");
        } else {
            System.out.println("файлы одинаковые");
        }
        fis1.close();
        fis2.close();

    }
}

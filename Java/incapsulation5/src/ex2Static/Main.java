package ex2Static;

public class Main {
    static int y;
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        Main m = new Main();
        m.y =4;
        System.out.println(m.y);
    }
}

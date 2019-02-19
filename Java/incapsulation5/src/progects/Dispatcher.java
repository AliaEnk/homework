package progects;

public class Dispatcher {
    public static void main(String[] args) {
          Model m1 = new Model();
          m1.g =4;
          Controller c =new Controller();
          m1.l = c.convert(m1.g);
          View w =new View();
          w.display(m1.l, m1.g);
    }
}

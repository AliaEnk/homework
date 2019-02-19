package calculate;

public class Dispatcher {
    public static void main(String[] args) {
        Model m = new Model();
        m.x = 6;
        m.y = -3;
        //Controller c = new Controller();//
        int sum = Controller.add(m.x ,m.y);
       int sub =Controller.subtract(m.x,m.y);
        int mul = Controller.multyplay(m.x ,m.y);
        int di =Controller.div(m.x,m.y);

       View v = new View();
       v.display(sum,sub,mul,di);
    }
}

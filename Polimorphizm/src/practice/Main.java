package practice;

public class Main {
    public static void main(String[] args) {
        Check d = new Check("Валентина Ласточникова", 500, 7);
        System.out.println( d.toString());
     }
    }
        class Check {
            String name;
            int c;
            int p;
            public Check(String name,int c, int p){
                this.c =c;
                this.p = p;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Чек" + '\n' +
                        "Заказчик: " + name + '\n' +
                        "Количество порций " + p +'\n'+
                        "Цена заказа " + c + " грн"
                        ;
            }
        }






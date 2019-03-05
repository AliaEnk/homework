package Array;


    import java.util.ArrayList;
import java.util.ListIterator;
    class TestArrayList {
        private ArrayList<String> a1;
        public static void main(String[] args) {
            TestArrayList test = new TestArrayList();
            test.create();
            test.getData();
            test.iterateData();
        }
        void create() {
            //створюємо і наповнюємо ArrayList
            a1 = new ArrayList<String>();
            a1.add("Привіт");
            a1.add("тобі");
            a1.add("божевільний");
            a1.add("світе!");
        }
        //читаємо дані по індексу
        void getData() {
            for (int i = 0; i < a1.size(); i++) {
                System.out.print(a1.get(i) + " ");
            }
        }
        //Читаємо вміст ArrayList з допомогою ітератора
        void iterateData() {
            ListIterator<String> it = a1.listIterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }
    }


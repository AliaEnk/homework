package l3;

public class Main3 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 3, -1, 2, 5, 19, 7, 6, 9, -7 };
       int s=0;
        for(int i=0; i<a.length; i++){
            s=s + a[i];
        }
        int r=s/10;
        System.out.println(r);
        int k = r;
        int d =0;
        for (int j = 0; j < a.length; j++) {
            if (a[j]>k){
                k = a[j];
                d++;
            }
        }
        System.out.println(d);
    }
}

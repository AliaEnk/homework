package l2;

public class z2 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 3, -1, 2, 1, 19, 7, 6, 9, -7 };
        for(int i=0; i<a.length; i++){
            int k = a[i];
            int p = i;
            for (int j =i+1; j < a.length; j++){
            if(a[j]== k){
                p=j+1;
                System.out.println(a[i]+ "," + p);
            }
    }

}}}

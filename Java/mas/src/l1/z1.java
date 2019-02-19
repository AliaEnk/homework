package l1;

public class z1 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 3, -1, 2, 5, 19, 7, 6, 9, -7 };
        int max=0;
        int min =0;
        for(int i=0; i<a.length; i++)
            if(a[i]>max){
                max=a[i];
            }
            else{
                if(a[i]<min){
                    min=a[i];
                }
            }
        System.out.println(max);
        System.out.println(min);
    }
}

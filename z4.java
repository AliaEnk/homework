package l4;

public class Main4 {
    public static void main(String[] args) {
        int[] a = {3,2,81};
        int[] b = {7,5,2,7,67,72,10};
        int[] ab = new int[a.length+b.length];
        for (int i=0;i<ab.length;i++){
            if(i<a.length){
                ab[i]=a[i];
            }else{
                ab[i]=b[i-a.length];
            }
        }
        for (int temp:ab){
            System.out.print(temp+" ");
    }
}}

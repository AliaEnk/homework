package l6;

public class z6 {
    public static void main(String[] args) {
        int a[] = new int[]{1, 3, -1, 2, 5, 19, 7, 6, 9, -7};
        int max =(int)Double.NEGATIVE_INFINITY;
        int min =(int)Double.POSITIVE_INFINITY;
        int indexMin = a.length-1;
        int indexMax =indexMin;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                indexMax = i;
            }

            if (a[i] < min) {
                min = a[i];
                indexMin = i;
            }
        }
        int count = 0;
        for (int temp : a) {
            if (temp == max || temp == min) {
                count++;
            }
            }
            int[] res = new int[a.length - count+2];
            int j=0;
            for(int i=0;i<a.length;i++){
                if (a[i]!=min&&a[i]!=max){
                    res[j++]=a[i];
                }else{
                    if(i==indexMax||i==indexMin){
                        res[j++]=a[i];
                    }
                }
            }
        for(int temp :res){
                System.out.print(temp+" ");
            }
        }
    }


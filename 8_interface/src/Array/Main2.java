package Array;


    import java.util.*;
     class Details  {
        public static void main(String args[]){
            ArrayList<String> listofcountries = new ArrayList<String>();
            listofcountries.add("India");
            listofcountries.add("US");
            listofcountries.add("China");
            listofcountries.add("Denmark");

            /*Несортований List*/
            System.out.println("Before Sorting:");
            for(String counter: listofcountries){
                System.out.println(counter);
            }

            /* Сортування*/
            Collections.sort(listofcountries);

            /* Sorted List*/
            System.out.println("After Sorting:");
            for(String counter: listofcountries){
                System.out.println(counter);
            }
        }
    }

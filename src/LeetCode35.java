import javax.swing.plaf.basic.BasicListUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class LeetCode35 {


    public static void main(String[] args) {
        //,11,17,  ,28,44
         //our model will first try to compare if it is less than the first number in the
        // row , in this case "is 21 less than 11 ?"
        // if the answer is yes then it will be placed in the very starting of the row
        //

        ArrayList<Integer> numbers=new ArrayList<>(asList(44,22,1,66,14,90));

        Collections.sort(numbers);
        int h=0;
       Scanner scanner=new Scanner(System.in);
       int g=scanner.nextInt();


       boolean flag=true;

       for(int k:numbers)

       {
           if(g==k)
           {
               h=numbers.indexOf(k);
               break;
           }

           if(g<k)
           {
               h=numbers.indexOf(k);
               break;
           }


       }

        System.out.println("the given number should be inserted in "+h+" position");




    }


}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;
//this program detects when the size of the array becomes one,
//More importantly it don't need any loop variable like:int i=0
public class BreakScopedemo {

    public static void main(String[] args) {
            int flag=4;
            int counter=0;
       while(flag==4)
       {
           System.out.println("my name is hredoy");

           counter++;
           if(counter==6)
           {flag=1;}

       }
    }
}

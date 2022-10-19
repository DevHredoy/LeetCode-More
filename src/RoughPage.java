
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RoughPage{



 static  int findFebonacciNumber(int nth)
 {
     if(nth<2)
     {
         return nth;
     }

     return findFebonacciNumber(nth-1)+findFebonacciNumber(nth-2);
 }

    public static void main(String[] args) {


        System.out.println(findFebonacciNumber(7));


}
}

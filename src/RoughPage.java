
import java.lang.reflect.Array;
import java.util.Arrays;

public class RoughPage{

    public static int counttotaldigit(int number)
    {  int counter=0;

        while(true)
        {
            System.out.println("i am in");
            number=number/10;
            counter=counter+1;
            if(number==0)
            {break;}


        }
        return counter;  }
    public static boolean isboolean(int num)
    {

        if(num%2==0)
            return true;
        else
            return false;

    }


      public static  int  findTotalCorrectNum(int[] arr)
      {int evens=0;

          for(int n:arr)
          {
             if( isboolean(counttotaldigit(n))==true)
             {
                 evens=evens+1;
             }

          }
          return evens;}

    public static void main(String[] args) {

        int[] list=new int[]{22,44,1,32,2,10,43,121};
        System.out.println("total ammount of even digited numbers are :"+findTotalCorrectNum(list));

    }
}

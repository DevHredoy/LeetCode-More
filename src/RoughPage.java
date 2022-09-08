
import java.lang.reflect.Array;
import java.util.Arrays;

public class RoughPage{

    public static int[] nonRepeatingArray(int[] ar)
    {
        Arrays.sort(ar);
       int lastIndex= ar.length-1;

       // this while loop shall place zero where any repeatation takes place
       while(true)
       {
           if(ar[lastIndex]==ar[lastIndex-1])
           {ar[lastIndex]=0;
               lastIndex--;
           }
           else{
               lastIndex--;
           }

       if(lastIndex<=0)
       {break;}}
        Arrays.sort(ar);


       //
       boolean swapflag;
       while(true)
       {    // by the below for loop swapping shall take place traversing
           //onetime from the end of the array to the beginning
                swapflag=false;
           for(int j=ar.length-1;j>0;j--)
           {
               // if the element is 0 then no swap shall take place
               if(ar[j]==0)
                    {
                        System.out.println("I am doing nothing because I have en" +
                                "countered zeros on a row ");
                    }
                      else {
                            if(ar[j-1]==0)
                                {
                                   int temp= ar[j-1];
                                   ar[j-1]=ar[j];
                                   ar[j]=temp;
                                    swapflag=true;
                                }
               }

           }

           // end line of the for loop}
           if(swapflag==false)
           {break;}

       }

       return ar;}

    public static void main(String[] args) {
        int[] messedArray;
        messedArray=new int[]{2,3,2,5,1,22,9,3,4};

        Arrays.sort(messedArray);
        System.out.println(Arrays.toString(messedArray));

        System.out.println(Arrays.toString(nonRepeatingArray(messedArray)));




    }
}

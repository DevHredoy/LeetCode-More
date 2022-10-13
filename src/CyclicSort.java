import java.util.Arrays;

public class CyclicSort {
    // lets say the given array is 2,5,1,3,4
    // we have to sort it using cyclic sort as it is :  1 to n
    // interestingly we shall only use one loop and when we can reach to the end of the array
    // the loop will break assuming the whole array has been sorted

    public static int[] cycleSort(int[] array)
    {  int index=0;
        while(true)
        {

            if(index==array.length-1 && array[index]==index+1)
            {break;}
         else  if(index!=array[index]-1)
            {
               int temp=array[array[index]-1];
               array[array[index]-1]=array[index];
               array[index]=temp;

            }
           else if(array[index]==index+1)
            {
                index=index+1;
            }

        }


        return array;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{8,2,11,10,3,7,1,6,12,9,4,5};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }


}

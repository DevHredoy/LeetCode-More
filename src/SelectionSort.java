import java.util.Arrays;

public class SelectionSort {

//we shall first go to the end of the list , take the member and swap with the
    // real owner of that place.
    // 2 then we shall move back to the last next element
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] list=new int[]{3,14,6,10,11,18,7};
        System.out.println(Arrays.toString(selectionSort(list)));
 }

   public static int[] selectionSort(int[] array)


   {
       for(int j=array.length-1;j>0 ;j--)

       {
           System.out.println("in the first for loop");
           int biggest=array[j];
           for(int i=j-1;i>=0;i--)

           {
               System.out.println("in the second for loop");
               if(biggest<array[i])
               {   int temp=biggest;
                   biggest=array[i];
                array[i]=temp;

               }
           }
                  array[j]=biggest;

       }

       return array;
   }




}

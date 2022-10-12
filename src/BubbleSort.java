import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] newArray=new int[]{12,3,13,5,8,11,18,20};
        System.out.println(Arrays.toString(bubbleSort(newArray)));

    }

    // in bubble sort in each step  iteration of outer for loop the comparison
    // be decreased by one in the last end because in every step the largest number is tailed in
    // in the ending tail
    // if there is no swap then the while loop will break
    public static int[] bubbleSort(int[] array) {

    /*at first we shall be in the most inner loop

        if ther is not 2,5 order then this
        for(i<lengthof array-2)
        for(length of array-i)
        if(j element<j+1 element)
               { swap}*/

        for(int i=0;i<array.length-2;i++)
        {  boolean flag=false;
            for(int j=0;j<(array.length-1)-i;j++)
            {if(array[j]>array[j+1])
            {
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                flag=true;
            }

            }
            if(flag==false)
            {break;}
        }



   return array; }
}
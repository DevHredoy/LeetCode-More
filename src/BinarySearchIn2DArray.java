import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchIn2DArray {



    public static int[] search(int[][] array,int target)
    {
        int row=0;
        int column=array[row].length-1;
        int[] index=new int[2];

        while(column>=0 && row<array.length)
        {
            System.out.println("rr");

            if(array[row][column]==target)
            {
                index=new int[]{row,column};

                return index;

            }
            else if(array[row][column]<target)
            {
                row= row+1;
            }
            else if(array[row][column]>target)
            {
                column=column-1;
            }






            }

     return index=new int[]{-1,-1};  }





    public static void main(String[] args) {


        //the array shall start traversing from row 0 and column=length-1
        // if the target is greater than the

  int[][] array=new int[][]{
          {5,10,12,15},
          {7,11,13,16},
          {9,12,17,19},
          {10,13,19,21},
          {12,15,20,25}

  };

        System.out.println(Arrays.toString(search(array,20)));





    }
}

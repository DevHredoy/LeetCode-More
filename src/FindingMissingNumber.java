import java.util.Arrays;

public class FindingMissingNumber {
// in this program we shall try to find the missing number where numbers are : 0 to n
    //  we shall use cyclic sort in this regard
// (    this program faces index out of bound when it process 11 as input  , In more detailed
// the else part is not supposed to be executed as per general programming principles and laws)

  public static int  findMissingNumber(int[] array)
  {
    // the cases will be :1.the first number will be missing
                                 //2.any number in the middle could be missing
                                  //in this case the position of the last number will be updated
                                 // and at the end we shall determine the postion of the last number(as it is displaced
                               //  from its index and there is no such index in the array )

      // 3.the last number of the continuous list could be missing
      // if we see that the last number in the index is at it's respective position


    int index=0;
    int s=-1;
    while(true)
    {

      if (index == array.length - 1 && array[index] == index) {
        break;
      } else if (array[index]<array.length && index != array[index]) {
        if (array[index] > array.length - 1)//if the element's corresponding index out of bound
        {s = index;
          index = index + 1;
        }
        else {
          int temp = array[array[index]];
          array[array[index]] = array[index];
          array[index] = temp;
        }
      } else if (array[index] == index) {
        index = index + 1;


      }

    }


    if(s==-1)
    {
      s=array.length;
    }

    return s;





  }

// I should keep the length (+1 )
  public static void main(String[] args) {
    int[] arr=new int[]{9,6,4,2,3,5,7,0,1};
    System.out.println(findMissingNumber(arr));

  }

}

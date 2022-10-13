public class FindingMissingNumber {
// in this program we shall try to find the missing number where numbers are : 0 to n
    //  we shall use cyclic sort in this regard


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

      if(index==array.length-1 && array[index]==index)
      {break;}
      else  if(index!=array[index])
      {
        if(//the element's corresponding index is out of bound then
        array[index]>array.length-1)
        {
          s=index;
          index=index+1;
        }
        else
        {

          int temp=array[array[index]];
          array[array[index]]=array[index];
          array[index]=temp;
        }
      }
      else if(array[index]==index)
      {
        index=index+1;


      }

    }


    if(s==-1)
    {
      s=0;
    }

    return s;





  }

}

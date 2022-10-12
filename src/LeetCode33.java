public class LeetCode33 {// lets write the algorithm for finding the position of pivot
// 13,20,16,20,21,23,8,12,//

    public static void main(String[] args) {//  ahnafja
                      int[] arrayy=new int[]{11,12,16,19,20,24,1,2,3,5,7,8};
        System.out.println(findPeakPosition(arrayy));
        System.out.println(searchTarget(arrayy,19));


        // now we shall call a function "searchTarget"

    }


    public static int searchTarget(int[] array,int target)
    {   int peakIndexValu=findPeakPosition(array);
        int peakValu = array[findPeakPosition(array)];
        int targetIndexValue=-1;
        if(target==peakValu)
        {return peakIndexValu;}
      /*apply binary search in the left side of the peak*/

        int start=0;
        int end=peakIndexValu-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(array[mid]==target)
                {
                    targetIndexValue=mid;
                    break;
                }
                else if(array[mid]<target)
                {

                    start=mid+1;

                }
                else if(array[mid]>target)
                {

                    end=mid-1;
                }

            }


// applying binary search in the right side of the peak

        int    newstart=peakIndexValu+1;
          int  newend=array.length-1;

            while(newstart<=newend)
            {
                int mid=newstart+(newend-newstart)/2;

                if(array[mid]==target)
                {
                    targetIndexValue=mid;
                    break;

                }
                else if(array[mid]<target)
                {
                      newstart=mid+1;
                }
                else if(array[mid]>target)
                {newend=mid-1;}
            }



        return targetIndexValue;

    }
// now we have to create a method which will divide the array in terms the position of peak
    // then shall search the element in both sides just using the binary search algorithm
    //in the first binary the start will be 0 and end will be peak
    // in the second binary search start will be peak+1 and end=array length-1
    //we shall use two if conditional like: if(target<peak)..........else{we shall search in the right hand side
// of the array.}
    public static int findPeakPosition(int[] arr) {
        int start=0;
        int end=arr.length-1;
while(true)
{
              int mid=start+(end-start)/2;

    // condition o1 || when the peak is detected
    if(arr[mid]>arr[mid+1])
    {

        return mid;

    }

    else if(arr[mid-1]>arr[mid])
    {

       return mid-1;
    }
    else if(arr[mid]<arr[0])
    {// that means the right side of the mid index are not useful
        end=mid-1;

    }   // 13,20,21,23,8,12

    //when the loop while will terminate??
    // when the peak will found the loop will be terminated
    else if(arr[mid]>arr[mid-1])
    {   //that means the left side of the mid doesn't contain the peak

       // hence the starting will be
            start=mid+1;


    }

    //what other conditions are also available

}
    }

    }

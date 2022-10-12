public class LeetCode852 {

    //find the peak of a bitonic array
  // |||||||||||||||||||||| bruteforce search |||||||||||||||||||||||
/*    //3,4,10,13,15,17,19,20,24,|28|,33,30,29,,,,,,,,,,,,,,,,
    public static void main(String[] args) {
        int[] arr=new int[]{12,34,56,78,90,123,150,153,140,130,120,100};
        System.out.println("the peak is "+findPeak(arr));
    }
    public static int findPeak(int[] array)
    {int i=0;
        int desiredIndex=0;
        while(true)
        {
            if(array[i]>array[i+1])
            {
                desiredIndex=i;
                break;
            }
            i=i+1;
        }

        return array[desiredIndex];
    }*/


     //////_______________
    // ||||||||||||||||||||||||||| optimized code |||||||||||||||/


    public static void main(String[] args) {
        int[] arr=new int[]{12,34,56,78,90,123,150,153,140,130,120,100};
        System.out.println("the peak is "+searchPeak(arr));
    }
    public static int searchPeak(int[] array)
    {  int start=0;
        int end=array.length-1;
        int theIndex=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;



            if(array[mid]>array[mid+1])
            {
                theIndex=mid;
                break;
            }
           //when the spot is in the right of the mid
            else if (array[mid]<array[mid+1]) {
                start=mid+1;
            }

            // when the spot is in the left of the mid
            else if(array[mid]>array[mid+1]&& array[mid-1]>array[mid])
            {
                end=mid-1;
            }

        }


        return theIndex;}

}

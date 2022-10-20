public class BinarySearchDemo {

  public static  void binarySearchTarget(int[] arr,int target,int lowerBound,int upperBound)

  {
      //if there is no element matching between the upperbound and lowerbound that means
      //upperbound is the next value to the lower bound
      if(arr[lowerBound+1]==arr[upperBound])
            {
                System.out.println("target not found in the array");
                return ;
            }// at f

          int mid=(lowerBound+upperBound)/2;//the mid point is counted at first
     //cases in the below

      if(target==arr[mid])
         {
             System.out.println("the target is in the array");
             return ;//i want to break the recursion once i find the expected result
         }else if(target==arr[upperBound])
             {
                 System.out.println("target is within the array ");
                 return;
             }
      else if (target==arr[lowerBound])
      {
          System.out.println("the target is within the array");
          return;
      }
          else if(target<arr[mid])
      {
          binarySearchTarget(arr,target,lowerBound,mid);
      }
          else if(target>arr[mid])
      {
          binarySearchTarget(arr,target,mid,upperBound);

      }


  }



    public static void main(String[] args) {

        int[] array=new int[]{2,4,12,16,18,21,23,27,30};

        binarySearchTarget(array,20,0,array.length-1);

    }
}

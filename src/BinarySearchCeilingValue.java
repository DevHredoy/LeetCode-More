public class BinarySearchCeilingValue {
    // In this code there will be an array.If the user give one target input in the method "binarySearchTarget(..target..)"
    //the output shall show the closest equal or greater value in the array.
    //this code is very same like the BinarySearchDemo program except line 10
    public static  boolean binarySearchTarget(int[] arr,int target,int lowerBound,int upperBound)

    {
        if(arr[lowerBound+1]==arr[upperBound])
        {
            System.out.println("the most closest equal or greater value is "+arr[upperBound]);
            return true;
        }
        int mid=(lowerBound+upperBound)/2;
        if(target==arr[mid])
        {
            System.out.println("the target is in the array");
            return true;
        }else if(target==arr[upperBound])
        {
            System.out.println("target is within the array ");
           return true;
        }
        else if (target==arr[lowerBound])
        {
            System.out.println("the target is within the array");
            return true;
        }
        else if(target<arr[mid])
        {
            binarySearchTarget(arr,target,lowerBound,mid);
        }
        else if(target>arr[mid])
        {
            binarySearchTarget(arr,target,mid,upperBound);

        }


  return false;  }



    public static void main(String[] args) {

        int[] array=new int[]{2,4,12,16,18,21,23,27,30};
        binarySearchTarget(array,11,0,array.length-1);

    }
}

public class BinarySearchCeilingValue {
    //this code is very same like the BinarySearchDemo program except line 10
    public static  void binarySearchTarget(int[] arr,int target,int lowerBound,int upperBound)

    {


        if(arr[lowerBound+1]==arr[upperBound])
        {
            System.out.println("the most closest equal or greater value is "+arr[upperBound]);
            return ;
        }
        int mid=(lowerBound+upperBound)/2;
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
        int upperbound=array.length-1;
        binarySearchTarget(array,13,0,upperbound);

    }
}

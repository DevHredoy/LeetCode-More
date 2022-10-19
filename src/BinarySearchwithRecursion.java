public class BinarySearchwithRecursion {
  //  making the recurrence method
     static  int   binarySearch(int target,int[] array,int startIndex,int endingIndex)
     {
//checking if the s and e is meeting the limit or not if the mid is in range then case :1
         // in case 2 this will return -1 which shows the target has not been found in the array
         if(startIndex>endingIndex)
         {
             return -1;
         }
         else {
             //   making the mid value
             int mid=startIndex+(endingIndex-startIndex)/2;
              //there will be three decisions for an element
             // 1,the element could be just like the target
             if(array[mid]==target)
             {return mid;}
             // 2 the element could be greater than the target
             else if(array[mid]>target)
             {
                 endingIndex=mid-1;
             }
             //3 the element could be less than the target
             else if(array[mid]<target)
             {startIndex=mid+1;}
         }
         return binarySearch(target,array,startIndex,endingIndex);
     }
     public static void main(String[] args) {
        int[] arr=new int[]{2,5,7,11,13,15,17,20};
        System.out.println(binarySearch(156,arr,0,arr.length-1));
    }

}

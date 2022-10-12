public class LeetCode744 {
// if (ar[lowerbound+1]==ar[upperbound]||  arr[lowerbound]<target<arr[upperbound]
    //Integer.ToString(valueOf(char))

    public static char findDesiredChar(char[] arr,char target,int lowerbound,int upperbound)
        {   /* if(lowerbound==arr.length-1)
                   {
                       return arr[0];
                   }*/
            if(lowerbound>upperbound)
            {
                return arr[0];
            }
            //the case below is applied when the character is not present in the array but in the middle
            //between two other exiting characters
            if(arr[lowerbound+1]==arr[upperbound]&& Character.getNumericValue(target)>Character.getNumericValue(arr[lowerbound]) && Character.getNumericValue(target)<Character.getNumericValue(arr[upperbound]) )
                       //
            {


              return arr[upperbound];

            }
            int mid=(lowerbound+upperbound)/2;

            if(target==arr[mid])
            {
                return arr[mid+1];
            }
            else if(Character.getNumericValue(target)<Character.getNumericValue(arr[mid])){
                     return findDesiredChar(arr,target,lowerbound,mid-1);

                     }
            else if(Character.getNumericValue(target)>Character.getNumericValue(arr[mid]))
            {
                return findDesiredChar(arr,target,mid+1,upperbound);
                //

            }



                 return 'w';

        }






        public static void main (String[]args){

        char[] array = new char[]{'a','b','c','e','f','g','i','j'};
        int upperbound = array.length - 1;
            System.out.println(findDesiredChar(array,'h', 0, upperbound));

    }
    }


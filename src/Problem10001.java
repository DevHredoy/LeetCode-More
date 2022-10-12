public class Problem10001 {


              /*

                                                         Problem :
                                In this problem we are given a sorted array which is infinite,in
                           otherwords while solving the problem we will not able to use
          array.length method while solving the problem.The code shall check whether a given
     target number is present in the array or not  */


    public static void main(String[] args) {

            int[] arr={3,22,13,19,100,143,154,160,166,170};
            int target=100;
        System.out.println(ans(arr,target));

    }


    static int ans(int[] arr,int target)

                {
                 int start=0;
                 int end=1;
                 //condition for the target to lie out of the range
                    while(target>arr[end])
                    {int temp=end+1;
                    end=end+(end-start+1)*2;
                    start=temp;


                    }

                    return searchTarget(arr,target,start,end);
                }

    public static int searchTarget(int[] array, int target, int start, int end) {
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                //ANSWER FOUND
                return mid;

                     }

        }
              return -1;
          }

    }

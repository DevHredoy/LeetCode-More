// Marked as unripe
public class LeetCode34 {


    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check of the first occurance of the target is found in the array


        int start=search(nums,target,true);
        int end=search(nums,target,false);


          ans[0] = start;
          ans[1] =end;
    return ans;

    }
    // this function just return the index value of target

    int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //we shall check the middle element here to see
            // whether it matches with the target or not
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //when potential answer is found
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid - 1;
                }


            }


        }

        return ans;
    }

}
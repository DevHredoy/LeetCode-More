/*

1. Two Sum
        Easy

        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]



        Constraints:

        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.


        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/




// we have to make a arraylist and we have to check the pair

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class LeetCode{
    public static void main(String[] args) {

        // there will be two loops , if one match found those two elements will be removed from the
        //list

        int target=20;// this is the sum of those expected pairs
        ArrayList<Integer> numberStream = new ArrayList<>(Arrays.asList(8,7,56,412,6,15,5));
        List<Integer> totalelementsOfPair=new ArrayList<>();//this array is to save all members of expected pairs

            int flag;
            int whileflag=5;
        while(whileflag==5)// if
        {     flag=0;


            for(int j=0;j<numberStream.size()-1;j++)//the first member of the arraylist will be taken to be compared with all members in the right
            {

                for(int l=j+1;l<numberStream.size();l++)
                {

                    if(numberStream.get(j)+numberStream.get(l)==target)
                    {   totalelementsOfPair.add(numberStream.get(j));
                        System.out.println(numberStream.get(j));
                        totalelementsOfPair.add(numberStream.get(l));
                        System.out.println(numberStream.get(l));
                        System.out.println("we got a pair ");
                        System.out.println("now l is "+l+"before removing ");
                        numberStream.remove(l);
                        System.out.println("now j is"+j+"before removing ");
                        numberStream.remove(j);


                       flag=1;
                        break;






                    }

                    if(l==numberStream.size()-1){
                        numberStream.remove(j);

                                 flag=1;
                    }

                }
                if(flag==1)
                {break;}


            }
                //everytime we want to see the members of arraylist
            System.out.println("now the arraylist is from here ");
            for(int b:numberStream)
            {

                System.out.println(b);
            }
            System.out.println("untill here ");
            if(numberStream.size()<=1)//when there will be only one member in the array while loop will be broken
            {
                whileflag=9;
            }
        }
            for(int h:totalelementsOfPair)
            {
                System.out.println(h);
            }

    }
}


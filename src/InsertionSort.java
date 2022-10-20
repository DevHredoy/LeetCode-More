public class InsertionSort {

    // in insertion sort a pointer shall traverse through the array
    // lets say the array is : |12,34,22,4,11,33,17,8
                             /*   12|,34,22,4,11,33,17,8
                                        12,34|,22,4,11,33,17,8
                                        12,22,34|,4,11,33,17,8
                                        4,12,22,34|,11,33,17,8*/
                                       // and like the above picture the left part of the pointer will be sorted
    //


    // first step is making a method for implementing the inserting sort
    static int[] insertionSort(int[] arraytobeSorted)
    {


       //lets say the array is like this: 12|,34,22,4,11,33,17,8
        // the pointer will compare the pointer element with the elements left of the pointer and place it in the
        // array

        // lets first create the outer loop which shall control the pointer
        for(int outerCursor=1;outerCursor<arraytobeSorted.length;outerCursor++)//the cursor shall start from 1 index as
            //the 0th index can't compared with anything
        {
            //this cursor will only move when the pointer left side is sorted

            for(int j=0;j<outerCursor;j++)
            {
                if(arraytobeSorted[outerCursor]<arraytobeSorted[j])
                {
                    // arraytobeSorted[outercursor] will be placed at index of arraytobeSorted[j] index and arraytobeSorted[j]
                    // element shall shift to right untill the arraytobeSorted[outercursor] index
                    //

                }



            }

        }




  return arraytobeSorted;  }






    {

    }


}

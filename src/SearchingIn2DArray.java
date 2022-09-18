public class SearchingIn2DArray {

 public static  int findMaxValue(int[][] numbers)
 {
     int maxvalue=0;
     for(int[] ar:numbers)
     {for(int element:ar)
     {if(element>maxvalue)
     {maxvalue=element;}}}

     return maxvalue;
 }


    public static void main(String[] args) {
        int arr[][] ={{3,5,3},{5,117,90}};


        int chkvar=88;

        for(int i=0;i< arr.length;i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == chkvar) {
                    System.out.println("yes");
                    return;
                }


            }

        }

        System.out.println(findMaxValue(arr));


 }}
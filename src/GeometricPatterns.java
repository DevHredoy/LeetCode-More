public class GeometricPatterns {


//1
    static void createPatternOne(int rows) {
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

//2
    static void createPatternTwo(int lines) {

        for (int i = 1; i <= lines; i++) {
            for (int column = 1; column <= i; column++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }



//3
    static void createPatternThree(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = lines - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    //4
    static void createPatternFour(int lines)
    {


        for (int i = 1; i <= lines; i++) {
            for (int column = 1; column <= i; column++) {
                System.out.print(column+" ");

            }
            System.out.println();
        }


    }

//5
    static void createPatternFive(int lines)
    {
        /*this pattern will combine pattern 2 and pattern 3
            from the starting till mid it shall go accending and
            from mid+1 to last it shall go descending.
        */
int midOfTheLine=lines/2;
int nextOfMidOfTheLine=midOfTheLine+1;

//the first loop will go untill midoftheline;
        //and this will go with ascending order

        for (int i = 1; i <= midOfTheLine; i++) {
            for (int column = 1; column <= i; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = nextOfMidOfTheLine; i <=lines; i++) {
            for (int j = lines - i; j >=0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

   static void createPattern28(int starINTheCenter)
   {
// some fault still remaining

           for(int row=0;row<2*starINTheCenter-1;row++)
           {

              //this segment below is below the region n
               if(row>starINTheCenter-1)
               {

                   for(int f=1;f<=row-starINTheCenter+1;f++)
                   {
                       System.out.print(" ");
                   }
                   System.out.print("");
                   for(int i=2*starINTheCenter-row;i>1;i--)
                 {
                     System.out.print("* ");
                 }
                   System.out.println();
                   System.out.print("");
               }
                   //this segment below is above  n

               else{
                   for(int h=0;h<starINTheCenter-row;h++)
                   {
                       System.out.print(" ");
                   }

                   for(int j=1;j<row;j++)
                   {
                       System.out.print("* ");
                   }
                   System.out.println();
                   System.out.print(" ");
               }



           }



   }



    public static void main(String[] args) {
        //createPatternTwo(4);
        //createPatternOne(4);
        //createPatternThree(4);


        createPattern28(5);
    }


}

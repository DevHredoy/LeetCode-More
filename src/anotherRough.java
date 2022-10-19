import java.util.ArrayList;
import java.util.Arrays;

/*     *
       **
       ***
       ****        */



public class anotherRough {

        public static void main(String[] args) {

         // we shall make one 2d array
           // the next rows index will be one more

            int a=5;
            char[][] starBuilder=new char[a][5];


            for(int i=0;i<a;i++)
            {
                for(int j=0;j<=i;j++)
                {

                    starBuilder[i][j]='*';

                }

            }


            for(int row=0;row<starBuilder.length;row++)
            {
                for(int column=0;column<starBuilder[row].length;column++)
                {
                    System.out.print(starBuilder[row][column]);

                }
                System.out.println("");
            }

                   }
               }





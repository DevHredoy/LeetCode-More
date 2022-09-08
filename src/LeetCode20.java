import javax.swing.plaf.basic.BasicListUI;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode20 {

    public static void main(String[] args) {
        boolean flag=true;
        ArrayList<Character> listOfChars=new ArrayList<>(Arrays.asList(')'));
        int indexTobeChecked=0;
        while(true)
        {

            /*if(listOfChars.size()==1) {
            flag=false;
            break;
                        }*/
            //in the if statement below we want to check if the index is going to be out of range
            if(indexTobeChecked+1>=listOfChars.size())
            {break;}
            if(listOfChars.get(indexTobeChecked)=='(')
            {
                if(listOfChars.get(indexTobeChecked+1)==')')
                {
                    if(indexTobeChecked+2>=listOfChars.size())
                    {
                        break;
                    }
                    else{indexTobeChecked=indexTobeChecked+2;}

                }
                else{
                    System.out.println("came to seg 1");
                   flag=false;
                    break;}
            }

            if(listOfChars.get(indexTobeChecked)=='{')
            {
                if(listOfChars.get(indexTobeChecked+1)=='}')
                {
                    if(indexTobeChecked+2>=listOfChars.size())
                    {
                        break;
                    }
                    else{indexTobeChecked=indexTobeChecked+2;}
                }
                else{
                    System.out.println("came to this seg 2");
                   flag=false;
                    break;}
            }

            if(listOfChars.get(indexTobeChecked)=='[')
            {
                if(listOfChars.get(indexTobeChecked+1)==']')
                {   if(indexTobeChecked+2>=listOfChars.size())
                        {
                            break;
                        }
                    else{indexTobeChecked=indexTobeChecked+2;}

                }
                else{
                    System.out.println("came to seg 3");
                   flag=false;
                    break;}
            }

            else{
                flag=false;
                break;

            }

        }
        System.out.println(flag);


    }
}

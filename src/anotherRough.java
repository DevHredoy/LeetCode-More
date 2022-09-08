import java.util.ArrayList;
import java.util.Arrays;

public class anotherRough {

        public static void main(String[] args) {
            ArrayList<Character> listOfChars=new ArrayList<>(Arrays.asList('(',')','{','}','{','}'));

            int indexTobeChecked=0;
            while(true)
            {
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
                        System.out.println("false");
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
                        System.out.println("false");
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
                        System.out.println("false");
                        break;}
                }

                else{
                    System.out.println("false");
                    break;

                }




            }
        }
    }





public class LeetCode1295 {
// this program shall determine in the list of integers how many integers
    // have even digits for example 12234-has uneven digits,
    //33445566-this number has even number of digits
public static int counttotaldigit(int number)
{  int counter=0;

    while(true)
    {
        System.out.println("i am in");
        number=number/10;
        counter=counter+1;
        if(number==0)
        {break;}


    }
    return counter;  }
    public static boolean isboolean(int num)
    {

        if(num%2==0)
            return true;
        else
            return false;

    }


    public static  int  findTotalCorrectNum(int[] arr)
    {int evens=0;

        for(int n:arr)
        {
            if( isboolean(counttotaldigit(n))==true)
            {
                evens=evens+1;
            }

        }
        return evens;}

    public static void main(String[] args) {

        int[] list=new int[]{22,44,1,32,2,10,43,121};
        System.out.println("total amount of even digited numbers are :"+findTotalCorrectNum(list));

    }

}

public class RecursiveCallDemo {

//1 2 3 4 5
    public static void main(String[] args) {
        //printnumbers(5);
        //System.out.println(factorial(5));
        // System.out.println(determinDigProd(840));
        //reverseNumber(7765);

        System.out.println( returnReverseNumber(88890,0));
    }



    // given a number 3411 , determining 3+4+1+1
static int determineDigitSum(int number)
{
    if(number<=9)
    {
        return number;
    }

    int brokenPart=number%10;
    int bigChunk=number/10;


    return brokenPart+determineDigitSum(bigChunk);
}


// given number 3456 determining 3*4*5*6
static int determinDigProd(int number)
       {

           if(number<=9)
           {
               return number;
           }

           int brokenPart=number%10;
           int bigChunk=number/10;


           return brokenPart*determinDigProd(bigChunk);

       }



    //determining the factorial of a number using simple recursion
    static int factorial(int n)
   {if(n==1)
   {return 1;}

     int m=n-1;
       return n*factorial(m);
   }



// print untill 1to n number
    static void printnumbers(int n)
   { if(n==0)
   {return;}

       // if we want to print in 5 4 3 2 1  order
       System.out.println(n);
       printnumbers(n-1);

       // if want to print in 1 2 3 4 5 order
      // System.out.println(n);
   }


   // reverse a given number
    static void reverseNumber(int number)
    {

        if(number<=9)
        {
            System.out.print(number);
            return;
        }

        int brokenPart=number%10;//this number will be multiplied with 10 and
        int bigChunk=number/10;
        System.out.print(brokenPart);
        reverseNumber(bigChunk);



    }


   // important concept about recursion
    static void fun(int n)
    {
        if(n==0)
        {return;}
        System.out.println(n);


    }


    // reversing a number
    static int returnReverseNumber(int number,int sum)
    {


        if(number<=9)
        {
            return number+sum;
        }

        int brokenPart=number%10;//this number will be multiplied with 10 and
        sum=sum+brokenPart;
        int bigChunk=number/10;

       sum=sum*10;
   return returnReverseNumber(bigChunk,sum);


    }
}


// if palindrome or not
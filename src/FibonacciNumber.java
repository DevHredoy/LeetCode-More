public class FibonacciNumber {

    public static void main(String[] args) {

        //in this program we have to input a number
       // then we have to find the sum of this number through fibonacchi
           //     sequence

        findFibonacchi(11);


    }

static void findFibonacchi(int seq)
{

    findFibonacchiInternally(0,1,0,seq);

}
static void findFibonacchiInternally(int n,int m,int f,int limit)
    {
        if(f==limit-1)
        {
            System.out.println(m);
            return;}
        f=f+1;

        int e;
        e=n+m;
        // System.out.println(e);
        findFibonacchiInternally(m,e,f,limit);


    }

}

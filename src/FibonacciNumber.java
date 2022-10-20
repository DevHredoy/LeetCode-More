public class FibonacciNumber {

    //the program is  less optimized .
    //before learning the
//n = 	0 	1 	2 	3 	4 	5 	6 	7 	8 	9 	10 	11 	12 	13 	14 	...
//xn = 	0 	1 	1 	2 	3 	5 	8 	13 	21 	34 	55 	89 	144 233 377 	...
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
// the problem is we have to print the nth fibonacchi number
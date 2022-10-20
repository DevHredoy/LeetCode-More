public class RecursiveCallDemo {


    public static void main(String[] args) {
        printnumbers(5);
    }
   static void printnumbers(int n)
   { if(n==0)
   {return;}
       printnumbers(n-1);
       System.out.println(n);
   }
}

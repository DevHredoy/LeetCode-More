public class RecursionDemo {
// this program shall roughly demonstrate how recursion works
    public static void main(String[] args) {

        print1(2);

    }


    public static void print1(int h)
    {    if(h==5)
        {
            return;
        }
        System.out.println("the number to be printed is :"+h);

        print1(h+1);

    }

    /*static void print1()
    {
        System.out.println("print");
        print2();
    }

    static void print2()
    {
        System.out.println("print");
        print3();
    }
    static void print3()
    {
        System.out.println("print");
        print4();
    }
    static void print4()
    {
        System.out.println("print");
        print5();
    }
    static void print5()
    {
        System.out.println("print");

    }*/
}

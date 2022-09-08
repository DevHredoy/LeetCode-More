import java.util.Arrays;

public class ArrayTesting {
  static  String[]names;
  static int initialIndex=-1;
    public static boolean stuffingArray(String x)
    {
            names[++initialIndex]=x;



        return true;}
    public static void main(String[] args) {

        names=new String[5];
        stuffingArray("reza");
        stuffingArray("pran");

        System.out.println(Arrays.toString(names));




    }
}

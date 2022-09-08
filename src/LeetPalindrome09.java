import java.util.Scanner;

class LeetPalindrome09{
    public static boolean isPalindrome(int x) {
        String numberHolder = Integer.toString(x);

        StringBuilder stringbuilder = new StringBuilder(numberHolder);
        stringbuilder = stringbuilder.reverse();

        if (numberHolder.equals(stringbuilder.toString())) {
            return true;
        } else {

            return false;
        }

    }

    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        int testCaseNum ;
        System.out.println("please give an integer ");
        testCaseNum=scanner.nextInt();
        boolean result=isPalindrome(testCaseNum);
        System.out.println(result);

    }
}
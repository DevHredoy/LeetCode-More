public class LeetCode1672{

    public static int returnTheRichest(int[][] accounts)
    {  int highestAmount=0;

        for(int[] arr:accounts)
        {int balancePerAccount=0;
            for(int account:arr)
            {
                balancePerAccount=account+balancePerAccount;


            }
            if(highestAmount<balancePerAccount)
            {highestAmount=balancePerAccount;}
        }


        return highestAmount;
    }

    public static void main(String[] args) {

        int[][] richmenAccounts=new int[][]{{1,10,3},{2,2,14},{3,2,4}};
        System.out.println(returnTheRichest(richmenAccounts));

    }


}

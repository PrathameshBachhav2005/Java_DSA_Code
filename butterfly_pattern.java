public class butterfly_pattern
{
    public static void main(String[] args)
    {
        int n=4;
        //Upper part
        for(int i=1;i<=n;i++)
        {

             // 1nd star print

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            // space print

            int space=2*(n-i);

            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            // 2nd star print
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println(" ");

        }

        // lower part
        for(int i=n;i>=1;i--)
        {
            // 1nd star print

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            // space print

            int space=2*(n-i);

            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            
            // 2nd star print

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
        
        
    }
    
}

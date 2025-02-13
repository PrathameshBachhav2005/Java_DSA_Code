import java.util.*; 
public class half_pyramid_no
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No:-");
        n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println("");
        }
    }
    
}

import java.util.*;
public class sum_of_oddNo 
{
    public static void sum_of_oddNo()
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No:-");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        { 
            if(i%2==0)
           {

           }
           else
           {
                 sum =sum+i;
           }

        }
        System.out.println("Sum:-"+sum);

    }
    public static void main(String[] args) {
        sum_of_oddNo();
    }
}

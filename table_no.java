import java.util.*;
public class table_no 
{
    void display()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a table no is ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    public static void main(String[] args)
    {
        table_no t1=new table_no();
        t1.display();
    }
    
}

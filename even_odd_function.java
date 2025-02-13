import java.util.Scanner;

public class even_odd_function 
{
    public static void even_odd_fun()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No:-");
        int n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even no is "+n);
        }
        else
        {
            System.out.println("Odd no is "+n);
        }
        
    }
    public static void main(String[] args) 
    {
        even_odd_function.even_odd_fun();
    }
    
}

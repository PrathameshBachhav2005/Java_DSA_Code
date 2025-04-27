import java.util.*;
class base extends Thread
{
    Scanner s=new Scanner(System.in);
    public void run()
    {
        System.out.println("Enter a Number repat loop in time e.g 3:-");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even_no is "+i);
                Thread.sleep(1000);
            }
            else
            {
                System.out.println("Odd_no is "+i);

            }
        }

    }

}
class thread1
{
    public static void main(String[] args) 
    {
        base b1=new base();
        b1.start();
    }
}

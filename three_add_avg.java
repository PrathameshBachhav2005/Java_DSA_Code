import java.util.*;
public class three_add_avg 
{
    public static void addition_avg()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three no:-");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();

        int total=a1+a2+a3;
        float avg=total/3;
        System.out.println("Total is "+total);
        System.out.println("Avg is "+avg);
    }
    public static void main(String[] args) 
    {

       addition_avg(); 
    }
    
}

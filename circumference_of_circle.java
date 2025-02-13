import java.util.*;
public class circumference_of_circle 
{
    public static double circumference()
    {
        double pi=3.14,c;
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a radius:-");
        double r=s.nextDouble();
        c=2*pi*r;
        return c;
    }
    public static void main(String[] args) 
    {
        double c=circumference();
        System.out.println("Circumference of circle is "+c);

    }
    
        
}

import java.util.*;
import java.lang.*;
public class search_element_in_array 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a serach element:-");
        int serach=s.nextInt();
        int[] a=new int[5];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter a no :-");
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(serach==a[i])
            {
                System.out.println("search elment is "+serach+" Found!! at the index is "+i);
            }
            
        }  
         
    }
    
}

import java.util.*;
import java.lang.*;
public class stringbuilder 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name:-");
        String s1=sc.next();
        StringBuilder ss1=new StringBuilder(s1);
        for(int i=0;i<ss1.length();i++)
        {
            System.out.print(""+ss1.charAt(i));
        }
        System.out.println("");
        
        for(int j=ss1.length()-1;j>=0;j--)
        {
            System.out.print(""+ss1.charAt(j));
        }

    }
}

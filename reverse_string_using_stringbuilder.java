
import java.util.*;
import java.lang.*;
public class reverse_string_using_stringbuilder 
{
   
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a name is ");
        String ss=s.nextLine();
        StringBuilder a=new StringBuilder(ss);
        for(int i=0;i<ss.length();i++)
        {
            System.out.print(ss.charAt(i));
        }
        System.out.println("");
        for(int j=ss.length()-1;j>=0;j--)
        {
            System.out.print(ss.charAt(j));

        }
         
    }
    
}

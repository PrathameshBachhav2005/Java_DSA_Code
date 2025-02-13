import java.util.*;
public class age_eligible_vote 
{
    void eligible_age(int age)
    {
        if(age>18)
        {
            System.out.println("Are you eligible for voting");
        }
        else
        {
            System.out.println("You are not eligible for voting");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :-");
        int age=sc.nextInt();
        age_eligible_vote s=new age_eligible_vote();

        s.eligible_age(age);
    }
    
}

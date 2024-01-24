import java.util.*;
public class WorkSchedule {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        boolean b = sc.nextBoolean();

        boolean condition1 = (day == 1 || day == 2 || day == 3 || day == 4 || day == 5);
        boolean condition2 = (day == 5 || day == 6);
        boolean condition3 = (b == true);
        boolean condition4 = (b == false);

        if(condition1 && condition4)
        {
            System.out.println("Wake up at 7:00 am and get ready for the work");
        }
        else if(condition1 && condition3)
        {
            System.out.println("No Work");
        }
        else if(condition2 && condition4)
        {
            System.out.println("Its weekend no work");
        }
        else
        {
            System.out.println("No Work");
        }
        

    }
    
}

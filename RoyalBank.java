import java.util.*;
public class RoyalBank {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("********ROYAL BANK OF INDIA************");
        System.out.println("Are you here to get mortgage?(yes or no)");
        String choice = sc.next();
        if(choice.equals("yes"))
        {
            System.out.println("\nGreat! In one line" +
                   "\nHow much money do you have in your savings?" +
                   "\nAnd, how much do you owe in credit card debt?");
            double savings = sc.nextDouble();
            double creditDebt = sc.nextDouble();
            System.out.println("How many years have you worked for: ");
            double years = sc.nextInt();
            System.out.println("What is your name: ");
            sc.nextLine();
            String name = sc.nextLine();
            if(savings >= 10000 && creditDebt<5000 && years>=2)
            {
                System.out.println("Congratulations " + name + " you have beeen approved for loan");
            }
            else{
                System.out.println("Sorry you are not eligible for a mortgage");
            }


        }
        else{
            System.out.println("Have a nice day");
        }
    }
}

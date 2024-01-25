import java.util.*;

public class TipTheWaiter {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();

        tipTheWaiter(bill);
    }

    public static void tipTheWaiter(double bill)
    {
        double tip = ((double)15/100)*bill;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        System.out.println("Your service was wonderful! Please, accept this tip: " + tip);
    }
    
}

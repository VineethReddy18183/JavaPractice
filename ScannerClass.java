import java.util.*;
public class ScannerClass {
    public static void main(String args[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        count++;

        System.out.println("Your name is " + name);
        count++;

        System.out.println("Enter your age: ");

        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        count++;

        System.out.println("Enter your weight");

        double weight = sc.nextDouble();

        System.out.println("Your weight is " + weight);
        count++;

        if(count == 4)
        {
            System.out.println("Thanks for answering all the questions");
        }
    }
    
}

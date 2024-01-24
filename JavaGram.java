
import java.util.*;
public class JavaGram {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int age = sc.nextInt();

        
        sc.nextLine();
        

        String username = sc.nextLine();
        System.out.println("Your user name is : " + username);
        System.out.println("Your first name is: " + firstName);
        System.out.println("Your last name is: " + lastName);
        System.out.println("Your age is: " + age );
    }
}

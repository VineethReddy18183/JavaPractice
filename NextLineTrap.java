
import java.util.*;
public class NextLineTrap {

    public static void main(String args[])
    {
        System.out.println("Enter your name,age and gender: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);

        System.out.println("Your name : " + name);
        System.out.println("Your age: "+age );
        System.out.println("Your gender: "+gender);
        sc.nextLine();

        System.out.println("Tell something about yourself");
        String description = sc.nextLine();
        System.out.println(description);
    }
    
}

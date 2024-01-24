/*Condition 1: num1 is equal to num2 - [true/false]
Condition 2: num1 is not equal to num2 - [true/false]
Condition 3: num1 is greater than num2 - [true/false]
Condition 4: num1 is less than num2 - [true/false]
Condition 5: num1 is greater than or equal to num2 - [true/false]
Condition 6: num1 is less than or equal to num2 - [true/false]
 */



import java.util.*;
public class Comparision {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2)
        {
            System.out.println("num1 and num2 are equal");
        }
        else if(num1>num2)
        {
            System.out.println("num1 is greater than num2");
        }
        else if(num1<num2)
        {
            System.out.println("num2 is greater than num1");
        }
        else
        {
            System.out.println("Please provide right inputs");
        }
    }
    
}

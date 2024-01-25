import java.util.*;
public class Quiz {
    public static void main(String args[])

    {
        int score = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Where was Olympics 2020 held?");
        System.out.println("        a.) India");
        System.out.println("        b.) America");
        System.out.println("        c.) Australia");
        System.out.println("        d.) RIO");

        char option1 = sc.next().charAt(0);
        if(option1 == 'd')
        {
            score = score + 4;
        }
        else{
            score = score - 1;
        }
        count++;
        System.out.println("2.Who won CWC 2011?");
        System.out.println("        a.) India");
        System.out.println("        b.) New Zealand");
        System.out.println("        c.) Australia");
        System.out.println("        d.) Sri Lanka");

        char option2 = sc.next().charAt(0);
        if(option2 == 'a')
        {
            score = score + 4;
        }
        else{
            score = score - 1;
        }
        count++;
        System.out.println("3.Youngest Person to win Bharat Ratna?");
        System.out.println("        a.) Virat Kohli");
        System.out.println("        b.) Rahul Gandhi");
        System.out.println("        c.) Narendra Modi");
        System.out.println("        d.) Sachin Tendulkar");

        char option3 = sc.next().charAt(0);
        if(option3 == 'd')
        {
            score = score + 4;
        }
        else{
            score = score - 1;
        }
        count++;
        if(count == 3)
        {
            System.out.println("Thats the end of quiz");
            System.out.println("Your final score is: " + score);
        }








    }
    
}

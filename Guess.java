import java.util.*;
public class Guess {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random()*10 + 1);
        System.out.println(randomNumber);
        while(true)
        {
            System.out.println("Guess any number between 1 and 10");
            int guessNumber = sc.nextInt();
            if(randomNumber == guessNumber)
            {
                System.out.println("You got it right");
                break;
            }
        }
        

    }
    
}

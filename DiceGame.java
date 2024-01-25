import java.util.*;
public class DiceGame {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int roll1 = dice();
        int roll2 = dice();
        int roll3 = dice();
        System.out.println("The random numbers are : " + roll1 + " " + roll2 + " " + roll3);

        int sumRoll = roll1 + roll2 + roll3;

        System.out.println("Please enter the input numbers between 1 and 6 (both included): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sumNum = num1 + num2 + num3;

        if(!(checkLessThanOne(num1, num2, num3)) && !(checkGreaterThanSix(num1, num2, num3)))
        {
            WinOrNot(sumRoll,sumNum);
        }




    }

    public static int dice()
    {
        int randomNumber = (int) (Math.random()*6 + 1 );
        return randomNumber;

    }

    public static boolean checkLessThanOne (int num1,int num2,int num3)
    {
        if(num1<1 || num2<1 || num3<1)
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static boolean checkGreaterThanSix(int num1,int num2,int num3)
    {
        if(num1>6 || num2>6 || num3>6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void WinOrNot(int sumRoll,int sumNum)
    {
        if(sumNum>sumRoll && (sumNum - sumRoll)<3)
        {
            System.out.println("Congratulations you won the game");
        }
        else{
            System.out.println("Sorry you lost the game");
        }


    }
    
}

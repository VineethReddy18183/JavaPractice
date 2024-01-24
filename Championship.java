import java.util.*;
public class Championship {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = a - b;
        if(diff >=300)
        {
            System.out.println("Gryfinder takes the houseCup");
        }
        else if(diff>=0)
        {
            System.out.println("Gryfinder takes the second place");

        }
        else if(diff>=-100)
        {
            System.out.println("In third place,Gryfinder");
        }
        else{
            System.out.println("In fourth place,Gryfinder");
        }
    }
    
}

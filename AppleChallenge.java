public class AppleChallenge {
    public static void main(String args[])
    {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        numOfApples+=500;
        double price = 0.40;;
        numOfCustomers+=1;
        numOfApples-=4;
        profit+=4*price;

        numOfApples-=20;
        numOfCustomers+=1;
        profit+=20*price;

        numOfApples-=200;
        numOfCustomers+=1;
        profit+=200*price;

        System.out.println("Wow! So far, you made: " + profit);
        System.out.println(numOfCustomers + " customers love our apples");
        System.out.println("You have " + numOfApples + " apples left.");








    }
    
}

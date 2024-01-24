public class JavaMart {
    public static void main(String args[])
    {
        double money = 12000;
        int priceOfShoes = 1000;
        System.out.println("Java Can I buy Shoes? ");
        if(money>=priceOfShoes)
        {
            System.out.println("Sure");
            money = money - priceOfShoes;
        }

        int phonePrice = 50000;
        System.out.println("Java Can I Buy phone?");
        if(phonePrice<money)
        {
            System.out.println("Sure");
            
        }
        else{
            System.out.println("Sorry you have only " + money + " left");
        }

    }
}

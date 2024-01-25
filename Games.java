import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"Rock", "Paper", "Scissor"};

        for (int i = 0; i < 3; i++) {
            int randomIndex = (int) (Math.random() * 3);
            System.out.println("You say: ");
            String userInput = sc.next();

            System.out.println("Computer says: " + arr[randomIndex]);

            if (userInput.equals(arr[randomIndex])) {
                System.out.println("Match Tied");
            } else if (userInput.equals("Rock") && arr[randomIndex].equals("Scissor")) {
                System.out.println("You win ");
            } else if (userInput.equals("Paper") && arr[randomIndex].equals("Scissor")) {
                System.out.println("Computer wins");
            } else if (userInput.equals("Scissor") && arr[randomIndex].equals("Rock")) {
                System.out.println("Computer wins");
            } else if (userInput.equals("Scissor") && arr[randomIndex].equals("Paper")) {
                System.out.println("You win");
            } else if (userInput.equals("Rock") && arr[randomIndex].equals("Paper")) {
                System.out.println("Computer wins");
            } else if (userInput.equals("Paper") && arr[randomIndex].equals("Rock")) {
                System.out.println("You win");
            }
        }
    }
}



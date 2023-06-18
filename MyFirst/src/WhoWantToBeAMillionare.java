import java.util.Scanner;

public class WhoWantToBeAMillionare
{
        public static void main(String[] args)
        {
            System.out.println("Who is named as the inventor of the light bulb?");
            System.out.println("Enter your Answer: ");
            Scanner input = new Scanner(System.in);
            String answer = input.next();
            boolean match = answer.equals("edison") || answer.equals("thomas") ;

            if (match==true){
                System.out.println("You were right. You won $1. Its was  " +answer);
            } else {
                System.out.println("Sorry, the right answer is Tomas Edison. Thanks you for coming.");
            }
        }
}

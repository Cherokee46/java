import java.util.Scanner;

public class ATMApp 
{

    public static void main(String[] args)
        {
            System.out.println("Enter a Number:  \n");
            Scanner scan0= new Scanner(System.in);
            int Number= scan0.nextInt();
            int AccountMoney=1000;
            System.out.println("1: Display Amount of Money in BANK ");
            System.out.println("2: Put Money into BANK ");
            System.out.println("3: Withdraw Money from BANK ");
            System.out.println("4: Exit from ATM System ");
            int choice= scan0.nextInt();
                
            
            switch (choice){
                    case 1:
                        System.out.println("Money in your Acoount is " + AccountMoney);
                        break;
                    case 2:
                        {
                        System.out.println("How much Money to put your Acoount: " );
                        Scanner scan1 = new Scanner(System.in);    
                        int putMoney = scan1.nextInt();                      // Put Money into BANK
                        AccountMoney += putMoney;
                        System.out.println("Now, You have in your Account: " + AccountMoney);
                        }
                        break;
                    case 3:
                        {
                            System.out.println("How much Money to withdraw from your Acoount: " );
                            Scanner scan2 = new Scanner(System.in);    
                            int WithDrawMoney = scan2.nextInt();                 // Take Money from BANK
                            if(WithDrawMoney <= AccountMoney){
                            AccountMoney -= WithDrawMoney;
                            System.out.println("Now, You have in your Account: " + AccountMoney );
                        }
                         else 
                         {
                           System.out.println("Now, No Enough Money in BANK ");
                          }
                        }
                        break;
                    case 4:
                        System.out.println("No Valid Action__System Out ... See You again. \n");
                        break;
                }
    }
}

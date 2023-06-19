import java.util.Scanner;

public class ATMApp 
{

    public static void main(String[] args)
        {
            System.out.println("Enter a Number:  \n");
            Scanner scan= new Scanner(System.in);
            int Number= scan.nextInt();
            int AccountMoney=1000;
            System.out.println("1: Display Amount of Money in BANK \n");
            System.out.println("2: Put Money into BANK \n");
            System.out.println("3: Withdraw Money from BANK \n");
            System.out.println("4: Exit from ATM System \n");
            int choice= scan.nextInt();
            switch (choice){
                    case 1:
                        System.out.println("Money in your Acoount is " + FirstMoney + TL);
                        break;
                    case 2:
                        System.out.println("How much Money to put your Acoount: " );
                        int putMoney;                                   // Put Money into BANK
                        Scanner putMoney = new Scanner(System.in);
                        AccountMoney += putMoney;
                        System.out.println("Now, You have in your Account: " + AccountMoney + TL );
                        break;
                    case 3:
                        System.out.println("How much Money to withdraw from your Acoount: " );
                        int WithDrawMoney;                              // Take Money from BANK
                        Scanner WithDrawMoney = new Scanner(System.in);
                        if(WithDrawMoney <= AccountMoney){
                            AccountMoney -= WithDrawMoney;
                            System.out.println("Now, You have in your Account: " + AccountMoney + TL);
                            }
                        else 
                        {
                         System.out.println("Now, No Enough Money in BANK ");
                        }
                        break;
                    case 4:
                        System.out.println("No Valid Action__System Out ... See You again. \n");
                        break;
                }
    }
}

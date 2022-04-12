package Bank;
import java.util.Scanner;

public class Main {
	
	private static  Scanner sc = new Scanner(System.in);
	
	private static Account account=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginmenu();
	}
	
	private static void loginmenu() 
	{
		do {
			System.out.println("Select Approprite action from menu below");
			System.out.println("1) Login  2) New Account");
			int input = sc.nextInt();

			switch(input) 
			{
			case 1:
				System.out.println("Enter your Account pin ");
				
				int pin = sc.nextInt();
				
				account = AccountRepository.AuthenticateAccount(pin);
				
				if(account != null) 
				{
					mainmenu();
				}else 
				{
					System.out.println("Account Not Fount ");
				}
				break;
				
			case 2:
				AccountRepository.NewAccount();
				break;
				default:
					System.out.println("Invalid Input ");

					break;
			}
			
			
		}while(true);
		
	}
	
	private static void mainmenu() 
	{
		System.out.println("**********************************************");
		System.out.println("              Welcome to Z Bank               ");
		System.out.println("**********************************************");
		
		do 
		
		{
			System.out.println("**********************************************");
			System.out.println("Choose from menu Below");
			System.out.println("**********************************************");
			System.out.println();
			System.out.println("1) Deposit");
			System.out.println("2) Withdraw");
			System.out.println("3) Balance");
			System.out.println("4) logout");
			System.out.println("**********************************************");
			int choice = sc.nextInt();
			switch(choice) 
			{	
			case 1:
				AccountRepository.accDeposit( account);
				break;
			case 2:
				AccountRepository.accwithDraw( account);

				break;
			case 3:
				AccountRepository.accBalance( account);
				break;
			case 4:
				loginmenu();
				break;
			default:
				System.out.println("Enter choice from the menu");
				break;
			}
			
		}while(true);
	}
	
}

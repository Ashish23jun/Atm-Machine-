import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int Balance = 100000, Withdraw, Deposit;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Automated Teller Machine");
			System.out.println("choose 1 for Withdraw");
			System.out.println("choose 2 for Deposit");
			System.out.println("choose 3  for check Balance");
			System.out.println("choose 4 for exit");
			  System.out.print("Choose the operation you want to perform:");

			int Choice = sc.nextInt();
			switch (Choice) {
			case 1:
				System.out.println("Enter your money to Withdraw:");
				Withdraw = sc.nextInt();
				if (Balance >= Withdraw) {
					Balance = Balance - Withdraw;
					System.out.println("Please collect your money");
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.println("Enter your money to be Deposited:");
				Deposit = sc.nextInt();
				Balance = Balance + Deposit;
				System.out.println("");
				break;
			case 3:
				System.out.println("Balance :"+Balance);
				System.out.println(" ");
                break;
			case 4:
				System.exit(0);
			}
		}
	}
}
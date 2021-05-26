package walletPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeWalletApp {
	static int userNumber = 0;
	static int counter = 0;

	public static void main(String args[]) {
		System.out.println("Please enter the number of users");
		Scanner sc1 = new Scanner(System.in);
		ArrayList<Account> accounts = new ArrayList<>();
		int n = sc1.nextInt();
		System.out.println("Please enter the balance for " + n + " users' wallet");

		for (int i = 0; i < n; i++)

		{
			accounts.add(new Account(new Wallet(sc1.nextInt(), userNumber++)));
		}
		int q = 1;
		while (q != 0) {
			System.out.println(
					"please enter \n 1 -> create a transaction, \n 2 -> to create a user, \n 3 -> to fetch user's transactions, \n 0 to exit the program, ");
			int p = sc1.nextInt();
			if (p == 1) {			
				System.out.println("Please enter  the sender userID,Reciever userID and amount to be sent");
				Account a1 = accounts.get(sc1.nextInt());
				Account a2 = accounts.get(sc1.nextInt());
				Transaction t = new Transaction(a1.w, a2.w, sc1.nextInt(), ++counter);
				a1.al.add(t);
				a2.al.add(t);

			} else if (p == 2) {
				System.out.println("Please enter the balance to be added for new user's wallet");
				int am=sc1.nextInt();
				accounts.add(new Account(new Wallet(am, userNumber++)));
				System.out.println("User has been created with a Balance: "+sc1.nextInt());
			} else if (p == 3) {
				System.out.println("Please enter the user id to get the transaction details");

				ArrayList<Transaction> trans = accounts.get(sc1.nextInt()).al;
				System.out.println("transaction details: ");
				for (Transaction t : trans) {
					System.out.println("id:" + t.transactionID + ", sender:" + t.sender + ", rec: " + t.reciever
							+ ", amount:" + t.amount);
				}
			} else {
				q = 0;
			}
		}
		sc1.close();

	}

}

package walletPractice;

public class Transaction {

	int amount;
	int transactionID;
	int sender;
	int reciever;

	Transaction(Wallet S, Wallet R, int am, int id) {
		sender = S.getUserID();
		reciever = R.getUserID();
		amount = am;
		transactionID = id;
		if (S.getBalance() < am) {
			System.out.println("Insufficient balance to carry out this transaction");
		} else {
			S.deductMoney(am);
			R.addMoney(am);
			System.out.println("Transaction successful id:" + transactionID);
		}
	}

}
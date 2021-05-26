package walletPractice;

public class Wallet {
	int balance;
	int userID;

	Wallet(int b, int id) {
		balance = b;
		userID = id;

	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	void deductMoney(int money) {
		balance -= money;
		System.out.println(
				money + " rupees has been deudcted from user:" + userID + "\n remaining balance is :" + balance);
	}

	void addMoney(int money) {
		balance += money;
		System.out
				.println(money + " rupees has been credited to user:" + userID + "\n remaining balance is :" + balance);

	}

}

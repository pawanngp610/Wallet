package walletPractice;

import java.util.ArrayList;

public class Account {

	Wallet w;
	ArrayList<Transaction> al;
	Account(Wallet w)
	{
		this.w=w;
		al= new ArrayList<>();
	}
	
	
}

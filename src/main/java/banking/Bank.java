package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		// complete the function
		accounts = new LinkedHashMap<Long, Account>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long acc = Long.valueOf(company.getIdNumber());
		acc = Long.valueOf(accounts.size()+1);
		Account temp = new CommercialAccount(company, acc, pin, startingDeposit);
		if(temp != null) {
			accounts.put(acc, temp );
			return acc;
		} else
			return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Long acc = Long.valueOf(person.getIdNumber());
		acc = Long.valueOf(accounts.size()+1);
		Account temp = new ConsumerAccount(person, acc, pin, startingDeposit);
		if(temp != null) {
			accounts.put(acc, temp );
			return acc;
		} else
			return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		//if(accountNumber > 1)
		return accounts.get(accountNumber).getBalance();
		//return -1;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		//if(accountNumber > 1)
		System.out.println("Credit function: "+accountNumber);
		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return accounts.get(accountNumber).debitAccount(amount);

	}
}

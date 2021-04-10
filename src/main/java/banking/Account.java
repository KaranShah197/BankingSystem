package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		if(this.pin != attemptedPin)
			return false;
        return true;
	}

	public double getBalance() {
		// complete the function
		System.out.println("Get bal: "+this.balance);

		return this.balance;
		//return -1;
	}

	public Long getAccountNumber() {
		// complete the function
		if(this.accountNumber > 0)
			return this.accountNumber;
        return -1L;
	}

	public void creditAccount(double amount) {
		// complete the function
		//if(accountNumber > 1)
		System.out.println("balance: "+this.balance+ " new Credit: "+amount);
		this.balance += amount;
	}

	public boolean debitAccount(double amount) {
		// complete the function
		if(this.balance < amount || balance < 0)
			return false;
		this.balance -= amount;
        return true;
	}
}

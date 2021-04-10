package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function

		boolean authUser = bank.authenticateUser(accountNumber, attemptedPin);
		if(!authUser)
			throw new Exception("Account validation failed.");
		else {
			this.accountNumber = accountNumber;
			this.bank = bank;
		}

	}

	public double getBalance() {
		// complete the function
		return bank.getBalance(this.accountNumber);
	}

	public void credit(double amount) {
		// complete the function
		this.bank.credit(this.accountNumber, amount);
	}

	public boolean debit(double amount) {
		// complete the function
		return  this.bank.debit(accountNumber, amount);
	}
}

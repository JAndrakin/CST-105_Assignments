
public class CheckingAccount extends Account {
//11.3 Subclasses of account
	
	protected double OVERDRAFT_LIMIT = -100;
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if (mBalance - amount >= OVERDRAFT_LIMIT) {
			super.withdraw(amount);
		}
	}
	
	@Override
	public String toString() {
		return "CheckingAccount{" +
	"mBalance=" + mBalance + '}';
	
	}
	
	
}

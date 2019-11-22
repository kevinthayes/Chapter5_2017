

public interface atm
{
	//returns the balance if the password is correct, if pass incorrect returns -1
	public double query (int pass);

	//returns the data as a String, or "NA" if pass incorrect
	public String statement ( int pass);

	//adds amount to the balance
	public double deposit(double amount);

	//subtracts amount & fee from balance
	public double withdraw (double amount, double fee);

	//subtracts amount from obj and add to this account
	public void transfer (Account obj, double amount);

}
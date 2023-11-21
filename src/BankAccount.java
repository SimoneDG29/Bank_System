
public class BankAccount {
	int faro = 5;
	protected String IBAN;
	protected double Saldo=0.0d;
	private Owner Owner;
	private DebitCardAccount pin[]=new DebitCardAccount[4];
	private DebitCardAccount nums_card[]=new DebitCardAccount[15];
	
	public BankAccount(String ib, Owner ow) {
		IBAN=ib;
		Owner=ow;
	}
	
	
	boolean Preleva(double Amount) {
		if(Amount<=Saldo) {
			Saldo=Saldo-Amount;
			System.out.println("Prelievo Effettuato");
			return true;
		}
		else
		{
			System.out.println("Saldo Insufficiente");
			return false;	
		}


	}

	public void PrintDetails()
	{
		System.out.print("Il Conto "+IBAN+" ha saldo "+Saldo);
	}
}


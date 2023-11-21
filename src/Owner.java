import java.time.LocalDate;

//Crea Proprietario
public class Owner {
	
	private String Nome;
	String Cognome;
	LocalDate DataNascita;
	String CodiceFiscale;
	private BankAccount ElencoConti[]=new BankAccount[5];

	
	// COSTRUTTORI
	public Owner(String nome, String cognome, LocalDate dataNascita, String codiceFiscale) {
		super();
		Nome = nome;
		Cognome = cognome;
		DataNascita = dataNascita;
		CodiceFiscale = codiceFiscale;
	}
	
	
	//METODI
	//Aggiunge Conto corrente al proprietario
	public boolean addBankAccount(BankAccount ba) {
		for(int i=0;i<ElencoConti.length; i++)
		{
			if(ElencoConti[i]==null) {
				ElencoConti[i]=ba;
				return true;
			}
		}
		return false;
	}

}

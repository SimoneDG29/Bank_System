import java.time.LocalDate;

public class Starter {

	public static void main(String[] args) {

		Owner o1 = new Owner("Antonio", "Esposito", LocalDate.of(2000, 2, 20), "NTNSPS3456");
		System.out.println(o1);

		BankAccount b1 = new BankAccount("IT01234567", o1);
		o1.addBankAccount(b1);

		DebitCardAccount b2 = new DebitCardAccount("IT03456789", o1, "1234-5678-1234-5678", "12/25", 123, 4568);
		o1.addBankAccount(b2);

		LoanAccount b3 = new LoanAccount("IT05678901", o1, 500.50, 0.10);
		o1.addBankAccount(b3);

		double interessi = b3.calcolaInteressi();
		System.out.println("Interessi maturati sul prestito: " + interessi + " Euro");
	}

}

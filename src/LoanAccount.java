public class LoanAccount extends BankAccount {
    private double LoanAmount;
    private double interestRatio;

    public LoanAccount(String ib, Owner ow, double loan_am, double it_ratio) {
        super(ib, ow);
        LoanAmount = loan_am;
        interestRatio = it_ratio;
    }

    public double calcolaInteressi() {
        double interessiMaturati = LoanAmount * interestRatio;
        //Ho "preso spunto" per capire come rappresentare l'importo dovuto con massimo due cifre.
        interessiMaturati = Math.round(interessiMaturati * 100.0) / 100.0; // Stampa due cifre decimali
        return interessiMaturati;
    }

}

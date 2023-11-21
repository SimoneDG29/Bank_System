import java.time.LocalDate;

public class DebitCardAccount extends BankAccount {
    private String CardNumber;
    private String CardExpirationDate;
    private int CardSecurityCode;
    private DebitCardAccount pin[]=new DebitCardAccount[3];

    private double plafond = 2000.00; // Per esempio;

    public DebitCardAccount(String ib, Owner ow, String card_num, String exp_Date, int cvv, int pin) {
        super(ib, ow);
        CardNumber = card_num;
        CardExpirationDate = exp_Date;
        CardSecurityCode = cvv;
        pin = pin;
    }

    @Override
    public boolean Preleva(double Amount) {
        if (Amount <= Saldo) {
            Saldo -= Amount;
            System.out.println("Prelievo Effettuato");
            return true;
        } else if (plafond >= (Amount - Saldo)) {
            Saldo -= Amount;
            plafond += Amount;
            System.out.println("Credito concesso, saldo attuale: " + Saldo);
            LocalDate DataConcessioneCredito = LocalDate.now(); // Data odierna
            return true;
        } else {
            System.out.println("Saldo Insufficiente, credito non concesso");
            return false;
        }
    }
    public boolean Deposita(double Amount) {
        if (pin.length  ){
            Saldo+=Amount;
        }
     return true;
    }
}

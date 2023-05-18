package class31;

public class BankMain {
    public static void main(String[] args) {

        ChaseBank chiragCB = new ChaseBank();
        CitiBank chiragCiti = new CitiBank();

        PayPal chiragPaypal = new PayPal();

        chiragPaypal.displayRateOfInterest(chiragCB);
        chiragPaypal.displayRateOfInterest(chiragCiti);
    }
}

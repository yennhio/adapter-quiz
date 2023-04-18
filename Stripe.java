public class Stripe implements Payment {

    private double paymentAmount;
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;

    public Stripe(double paymentAmount, String cardholderName, String cardNumber, String expirationDate) {
        this.paymentAmount = paymentAmount;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }
    @Override
    public void processPayment() {
        System.out.println("Paid using Stripe: $" + paymentAmount);
        System.out.println("Processing cardholder name... " + cardholderName.charAt(0) + "-----");
        System.out.println("Processing exp date... " + expirationDate.charAt(0) + "----");
    }
    
}

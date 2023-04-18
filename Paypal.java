public class Paypal implements Payment {

    private double paymentAmount;
    private String userEmail;

    public Paypal(double paymentAmount, String userEmail) {
        this.paymentAmount = paymentAmount;
        this.userEmail = userEmail;
    }

    @Override
    public void process() {
        System.out.println("Paid using Paypal: $" + paymentAmount);
    }
    
}

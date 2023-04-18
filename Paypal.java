public class Paypal implements Payment {

    private double paymentAmount;
    private String userEmail;

    public Paypal(double paymentAmount, String userEmail) {
        this.paymentAmount = paymentAmount;
        this.userEmail = userEmail;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid using Paypal: $" + paymentAmount);
        System.out.println("Processing email..." + userEmail.charAt(0) + "----------");
    }


}

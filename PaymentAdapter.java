public class PaymentAdapter implements Payment {
    Payment paymentApp;

    public PaymentAdapter(Payment paymentApp) {
        this.paymentApp = paymentApp;
    }

    @Override
    public void processPayment() {
        paymentApp.processPayment();
    }

}
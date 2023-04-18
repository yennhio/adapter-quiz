public class PaymentApp {
    public static void main (String[] args) {

        Payment paypalPayment = new PaymentAdapter(new Paypal(500.75, "hello@gmail.com"));
        Payment stripePayment = new PaymentAdapter(new Stripe(1900.89, "John Doe", "98593593939", "11/26"));
        Payment squarePayment = new PaymentAdapter(new Square(8994.25, "NVD"));

        paypalPayment.processPayment();
        stripePayment.processPayment();
        squarePayment.processPayment();

    }
}

public class PaymentApp {
    public static void main (String[] args) {

        Payment paypalPayment = new Adapter(new Paypal(500.75, "hello@gmail.com"));
        Payment stripePayment = new Adapter(new Stripe(1900.89, "John Doe", "98593593939", "11/26"));
        Payment squarePayment = new Adapter(new Square(8994.25, "NVD"));

        paypalPayment.process();
        stripePayment.process();
        squarePayment.process();

    }
}

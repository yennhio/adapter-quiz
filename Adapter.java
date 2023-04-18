public class Adapter implements Payment {
    Payment paymentApp;
    public Adapter(Payment paymentApp) {
        this.paymentApp = paymentApp;
    }

    @Override
    public void process() {
        paymentApp.process();
    }
    
}

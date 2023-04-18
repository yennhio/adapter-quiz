public class Square implements Payment {

    private double paymentAmount;
    private String locationID;

    public Square(double paymentAmount, String locationID) {
        this.paymentAmount = paymentAmount;
        this.locationID = locationID;
    }

    @Override
    public void process() {
        System.out.println("Paid using Square: $" + paymentAmount);
    }
    
}

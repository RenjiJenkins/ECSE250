public class TruckDelivery extends DeliveryMethod{
    private double pricePerKilometer;

    public TruckDelivery(int distance) {
        super(distance);
    }

    @Override
    public double calculateCost(){
        return getDistance() * pricePerKilometer;
    }
}
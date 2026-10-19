public class DroneDelivery extends DeliveryMethod{
    private double pricePerKilometer;

    public DroneDelivery(int distance) {
        super(distance);
    }

    @Override
    public double calculateCost(){
        return getDistance() * pricePerKilometer;
    }
}
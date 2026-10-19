public abstract class DeliveryMethod{
    private int distance;



    public DeliveryMethod(int distance){
        this.distance = distance;
    }

    public int getDistance(){
        return this.distance;
    }

    
    abstract double calculateCost();
}
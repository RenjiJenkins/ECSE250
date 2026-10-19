public class ShapeDashboard{
    public static double totalArea(Shape[] shapes){
        double sum=0;
        for(int i=0; i < shapes.length; i++){
            sum = sum + shapes[i].getArea();
        }
    }
}
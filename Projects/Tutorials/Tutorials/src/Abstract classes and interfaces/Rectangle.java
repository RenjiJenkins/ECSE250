public class Rectangle extends Shape{
    
    
    public Rectangle(String color){
        super(color);
    }

    public double getArea(double base, double height){
        return base * height;
    }
    public double getPerimeter(double base, double height){
        return 2*base+2*height;
    }
}
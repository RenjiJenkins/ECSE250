public class Circle extends Shape{
    public Circle(String color){
        super(color);
    }

    public double getArea(int radius){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(int radius){
        return 2* radius *Math.PI;
    }
}
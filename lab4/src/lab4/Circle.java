package lab4;

public class Circle {
    Point center;
    double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double diamater(){
        return 2 * radius;
    } 

    public double perimeter(){
        return this.diamater() * Math.PI;
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public boolean isOnCircle(Point x){
        return center.distance(x) <= radius;
    }


}

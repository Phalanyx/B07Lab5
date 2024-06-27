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

    public boolean isOnCirlce(Point x){
        return center.distance(x) <= radius;
    }

    @Override
    public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (center != other.center)
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}


}

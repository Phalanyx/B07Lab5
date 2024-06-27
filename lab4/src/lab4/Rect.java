package lab4;
public class Rect {
    Point A;
    Point B;
    Point C;
    Point D;

    public Rect(){
        A = new Point(0,0);
        B = new Point(0,1);
        C = new Point(1,1);
        D = new Point(1,0);
    }
    private boolean illegalRect(Point A, Point B, Point C, Point D) {
        if(A.equals(B) || A.equals(C) || A.equals(D) || B.equals(C) || B.equals(D) || C.equals(D))
            return true;
        if (A.distance(B) != C.distance(D) || A.distance(D) != B.distance(C))
            return true;
        return false;
    }
    public Rect(Point A, Point B, Point C, Point D) {
        if (illegalRect(A, B, C, D)) {
            return;
        }
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    public boolean isSquare() {
        double AB = A.distance(B);
        double BC = B.distance(C);
        double CD = C.distance(D);
        double DA = D.distance(A);
        if(AB==BC && BC==CD && CD==DA)
            return true;
        return false;
    }

    public double area() {
        double AB = A.distance(B);
        double BC = B.distance(C);
        return AB*BC;
    }
}

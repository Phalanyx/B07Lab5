package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testDiameter() {
        Point p = new Point(0, 0);
        Circle c = new Circle(p, 5);
        assertEquals(c.diamater(), 10);
    }

    @Test
    void testPerimeter() {
        Point p = new Point(1, 2);
        Circle c = new Circle(p, 5);
        assertEquals(c.perimeter(), 31.41593, 1e-5);
    }

    @Test
    void testArea() {
        Point p = new Point(3, 4);
        Circle c = new Circle(p, 5);
        assertEquals(c.area(), 78.53982, 1e-5);
    }

    @Test
    void testIsOnCircle1() {
        Point p = new Point(0, 0);
        Circle c = new Circle(p, 10);
        Point p1 = new Point(0, 10);
        assertTrue(c.isOnCircle(p1));
    }

    @Test
    void testIsOnCircle2() {
        Point p = new Point(1, 1);
        Circle c = new Circle(p, 10);
        Point p1 = new Point(1, 5);
        assertFalse(c.isOnCircle(p1));
    }

    @Test
    void testIsEquals1() {
        Point p = new Point(1, 1);
        Circle c1 = new Circle(p, 10);
        Circle c2 = new Circle(p, 10);
        assertTrue(c1.equals(c2));
    }

    @Test
    void testIsEquals2() {
        Point p = new Point(1, 1);
        Circle c1 = new Circle(p, 10);
        Circle c2 = new Circle(p, 5);
        assertFalse(c1.equals(c2));
    }

}
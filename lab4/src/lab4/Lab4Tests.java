package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab4Tests {

	@Test
	void testHashCode() {
		Point p1 = new Point(1.0,1.0);
		Point p2 = new Point(1.0, 2.0);
		assertNotEquals(p1.hashCode(),p2.hashCode());
		
	}
	@Test 
	void testHashCodeDiff() {
		Point p1 = new Point(1.25, 1.255);
		Point p2 = new Point (1.26, 9.2);
		assertNotEquals(p1.hashCode(), p2.hashCode());
		
	}
	@Test
	void testHashCodeZero() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,0);
		assertEquals(p1.hashCode(), p2.hashCode());
	}
	@Test
	void testHashCodeNonZero() {
		Point p1 = new Point(3.75, 3.75);
		Point p2 = new Point(3.75, 3.75);
		assertEquals(p1.hashCode(), p2.hashCode());
	}
	@Test
	void testPerimeter() {
		Point p1 = new Point(1.0,1.0);
		Point p2 = new Point(2,1);
		Point p3 = new Point(0,1);
		Triangle t1 = new Triangle(p1,p2,p3);
		assertEquals(t1.perimeter(), 4);
		
	}
	@Test
	void testLine() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,2);
		Point p3 = new Point(4,0);
		Triangle t1 = new Triangle(p1,p2,p3);
		assertNotEquals(t1.perimeter(), 0);
	}
	@Test 
	void testUnevenTriangle() {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(0, 1);
        Triangle t1 = new Triangle(p1, p2, p3);
        assertEquals(4.0, t1.perimeter(), 2);
	}
	@Test
	void testEquals() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(1,1);
		assertEquals(p1.equals(p2), true);
	}
	@Test
	void testSame() {
		Point p1 = new Point(1,2);
		assertEquals(p1.equals(p1), true);
	}
	@Test
	void testDiffY() {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,4);
		assertEquals(p1.equals(p2), false);
	}
	@Test
	void testNotEquals() {
		Point p1 = new Point(1,1);
		Point p3 = new Point(0,0);
		assertNotEquals(p1.equals(p3), true);
	}
	@Test
	void testNotEqualsAgain() {
		Point p1 = new Point(1,1);
		Point p4 = new Point(3,2);
		assertEquals(p4.equals(p1), false);	
	}
	@Test
	void triangleTest() {
		Point p1 = new Point(1,1);
		Point p2 = new Point(1,1);
		Point p3 = new Point(0,0);
		Triangle t1 = new Triangle(p1, p2,p3);
		Point p6 = new Point(2,7);
		assertEquals(p6.equals(t1), false);

	}
	@Test
	void testNull() {
		Point p3 = new Point(0,0);
		assertEquals(p3.equals(null), false);

	}
	
	@Test
	void testEquilateral() {
	Point p1 = new Point(0,0);
	Point p2 = new Point(Math.sqrt(5),0);
	Point p3 = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
	Triangle t1 = new Triangle(p1,p2,p3);
	assertEquals(t1.isEquilateral(), true);
	}
	@Test
	void notEquil() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(Math.sqrt(5),0);
		Point p4 = new Point(0,2);
		Triangle t1 = new Triangle(p1,p2,p4);
		assertEquals(t1.isEquilateral(), false);
	}
	
	
	

}

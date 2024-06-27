package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectTests {

	Point a = new Point(0, 0);
	Point b = new Point(0, 1);
	Point c = new Point(1, 1);
	Point d = new Point(1, 0);
	
	@Test 
	void testEmptyConstructor() {
		Rect rect = new Rect();
		assertEquals(rect.A, new Point(0, 0));
		assertEquals(rect.B, new Point(0, 1));
		assertEquals(rect.C, new Point(1, 1));
		assertEquals(rect.D, new Point(1, 0));
	}
	
	@Test
	void testIllegalRect() {
		
		// Duplicate Points case
		assertTrue(Rect.illegalRect(a, a, b, c));
		
		// AB != CD AND AD != BC
		assertTrue(Rect.illegalRect(a, new Point(0, 2), c, d)); // AB = 2 CD = 1
		
		// Valid unit rectangle
		assertFalse(Rect.illegalRect(a, b, c, d));
	}
	
	@Test
	void testConstructor() {
		
		Rect invalidRect = new Rect(new Point(10, 10), b, c, d);
		assertEquals(invalidRect.A, new Point(0, 0));
		assertEquals(invalidRect.B, new Point(0, 1));
		assertEquals(invalidRect.C, new Point(1, 1));
		assertEquals(invalidRect.D, new Point(1, 0));
		
		Rect rect = new Rect(a, b, c, d);
		assertEquals(rect.A, a);
		assertEquals(rect.B, b);
		assertEquals(rect.C, c);
		assertEquals(rect.D, d);
		assertNotNull(rect);
	
	}

	
	@Test
	void testPerimeter() {
		assertEquals(new Rect(a, b, c, d).perimeter(), 4.0);
		
	}
	
	@Test
	void testIsSquare() {
		
		// All sides equal
		assertTrue(new Rect().isSquare());
		
		// AB != BC
		assertFalse(new Rect(a, new Point(0, 10), new Point(1, 10), d).isSquare());
		
	}
	
	@Test
	void testArea() {
		assertEquals(new Rect().area(), 1);
	}
}

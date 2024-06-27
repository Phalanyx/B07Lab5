package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParallelogramTest {
    
    @Test
    void testPerimeter1() {
        Point A = new Point(0,0);
        Point B = new Point(0,1);
        Point C = new Point(1,1);
        Point D = new Point(1,0);
        Parallelogram ABCD = new Parallelogram(A,B,C,D);
        assertEquals(ABCD.perimeter(), 4.0);
    }
    
    @Test
    void testPerimeter2() {
        Point A = new Point(0,0);
        Point B = new Point(0,2);
        Point C = new Point(1,1);
        Point D = new Point(1,0);
        Parallelogram ABCD = new Parallelogram(A,B,C,D);
        assertEquals(ABCD.perimeter(), 2 + Math.sqrt(2) + 2);
    }
    
    @Test
    void testIsRhombusTrue() {
        Point A = new Point(0,0);
        Point B = new Point(0,1);
        Point C = new Point(1,1);
        Point D = new Point(1,0);
        Parallelogram ABCD = new Parallelogram(A,B,C,D);
        assertTrue(ABCD.isRhombus());
    }
    
    @Test
    void testIsRhombusFalse() {
        Point A = new Point(0,0);
        Point B = new Point(0,2);
        Point C = new Point(1,1);
        Point D = new Point(1,0);
        Parallelogram ABCD = new Parallelogram(A,B,C,D);
        assertFalse(ABCD.isRhombus());
    }

}
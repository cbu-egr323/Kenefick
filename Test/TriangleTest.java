import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void isEquilateral() {
        Triangle triangle = new Triangle(3,2,1);
        assertFalse(triangle.isEquilateral());
    }

    @Test
    public void isScalene() {
        Triangle triangle = new Triangle(3,2,1);
        assertTrue(triangle.isScalene());
    }

    @Test
    public void isIsosceles() {
    Triangle triangle = new Triangle(2,2,1);
    assertTrue(triangle.isIsosceles());
    }
    @Test

    public void invalidTri () {
        Triangle triangle = new Triangle(1,0,0);
        assertTrue(triangle.invalidTri());
    }
}
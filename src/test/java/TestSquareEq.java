import org.junit.Test;
import org.junit.Assert;

public class TestSquareEq extends Assert {
    private static final double DELTA = 0.000000001;

    @Test
    public void testDiscrimLessThanZero() {
        double a = 5.0;
        double b = 6.0;
        double c = 2.0;

        assertEquals(1, SolveSquareEq.solve(a, b, c).length);

    }

    @Test
    public void testOneDecision() {
        assertEquals(1, SolveSquareEq.solve(2, 4, 2).length, DELTA);
        assertEquals(-1, SolveSquareEq.solve(2, 4, 2)[0], DELTA);
    }

    @Test
    public void testTwoDecisions() {
        assertEquals(2, SolveSquareEq.solve(2, 6, 3).length, DELTA);
        assertEquals((-6 + Math.sqrt(Math.pow(6,2)-4*2*3))/(2*2),SolveSquareEq.solve(2, 6, 3)[0], DELTA);
        assertEquals((-6 - Math.sqrt(Math.pow(6,2)-4*2*3))/(2*2),SolveSquareEq.solve(2, 6, 3)[1], DELTA);
    }

    @Test
    public void testAEqualsZero() {
        double a = 0.0;
        double b = 5.0;
        double c = 2.0;

        assertEquals(1, SolveSquareEq.solve(a, b, c).length, DELTA);
        assertEquals(-c/b, SolveSquareEq.solve(a, b, c)[0], DELTA);
    }

    @Test
    public void testAAndBEqualZero() {
        double a = 0.0;
        double b = 0.0;
        double c = 9;

        assertEquals(0,SolveSquareEq.solve(a, b, c).length,DELTA);

    }

    @Test
    public void test() {

    }
}
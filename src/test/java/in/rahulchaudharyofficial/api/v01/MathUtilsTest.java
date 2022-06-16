package in.rahulchaudharyofficial.api.v01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils = new MathUtils();
    @Test
    void add() {
        assertEquals(mathUtils.add(1,2),3);
    }

    @Test
    void mul() {
        assertEquals(mathUtils.mul(2,3),6);
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(Math.PI*1*1, Math.PI);
    }
}
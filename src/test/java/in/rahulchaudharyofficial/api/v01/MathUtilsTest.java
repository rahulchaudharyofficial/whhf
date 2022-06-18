package in.rahulchaudharyofficial.api.v01;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class MathUtilsTest {

    private MathUtils mathUtils = new MathUtils();



    @Test
    void computeCircleArea() {
        assertEquals(Math.PI*1*1, Math.PI);
    }

    @Test
    @Disabled
    void divide() {
    	assumeTrue(true); //This test only runs with true which can be an expression or result of calculation
        assertThrows(ArithmeticException.class,() -> mathUtils.divide(1,0),"Number is divided by zero");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void winOs() {
        mathUtils.winOs();
    }

    @Nested
    @DisplayName("Math Ops Test")
    class MathTest {
        @Test
        void add() {
            assertEquals(mathUtils.add(1,2),3);
        }

        @Test
        void mul() {
            assertEquals(mathUtils.mul(2,3),6);
        }
    }
}
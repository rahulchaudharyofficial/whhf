package in.rahulchaudharyofficial.api.v01;

public class MathUtils {

    public int add(int a, int b) {
        return a+b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double computeCircleArea(int radios) {
         return  Math.PI * radios * radios;
    }

    public double divide(double a, double b) {
        return a/b;
    }

    public void winOs() {
        System.out.println("My OS is "+ System.getProperty("os.version"));
    }
}

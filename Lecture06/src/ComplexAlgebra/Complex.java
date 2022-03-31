package ComplexAlgebra;

// Be careful about the difference between access modifier `default` vs `protected`
/* Default members cannot e used from other packages,
* but Protected members can be used from other packages when inherited. */
public class Complex {
    protected double real ;
    double imag ;
    public Complex(double real, double imag){
        this.real = real ;
        this.imag = imag ;
    }
    protected Complex add(Complex op2){
        return new Complex(real + op2.real, imag + op2.imag);
    }
    protected Complex multiply(Complex op2){
        return new Complex(real * op2.real - imag * op2.imag, imag * op2.real + real * op2.imag) ;
    }
    double angle() {
        return Math.atan2(imag, real);
    }
    double radius() {
        return Math.sqrt(real*real + imag*imag) ;
    }
    @Override
    public String toString() {
        return imag != 0 ?  String.format("%.2f + %.2fi", real, imag) :  Double.toString(real) ;
    }
}

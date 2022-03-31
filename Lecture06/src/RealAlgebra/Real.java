package RealAlgebra;
import ComplexAlgebra.Complex ;

public class Real extends Complex{
    public Real(double value){
        super(value, 0) ;
    }

    @Override
    public String toString() {
        return Double.toString(real); // static method of Double class
    }
}

package ComplexAlgebra;
import RealAlgebra.* ;

public class Main {
    public static void main(String[] args) {
        Complex comp1 = new Complex(2, 3);
        Complex comp2 = new Complex(1, -1);
        System.out.println("C1 = "+ comp1);
        System.out.println("C2 = "+ comp2);
        System.out.println("C1+C2 = "+ comp1.add(comp2));
        System.out.println("C1*C2 = "+ comp1.multiply(comp2));
        System.out.println("angle of C1 : " +comp1.angle());
        System.out.println("radius of C1 : " +comp1.radius());

        Real real1 = new Real(5) ;
        Real real2 = new Real(-2) ;
        System.out.println("R1 = " + real1);
        System.out.println("R2 = " + real2);

        /* If `add` method is default instead of protected,
        then the first one still works but the second one brings out error. */
        // Why this happens given protected is replaced by default?
        /* The first one works since C1 is a member of Complex class and
        R1 is a member of Real class which is a subclass of Complex class*/
        /* The second one brings out error since R1, which is a member of Real class, cannot call
        add method because it is defined in complex class lying in different package */
        System.out.println("C1 + R1 = " + comp1.add(real1));
        System.out.println("R1 + C1 = " + real1.add(comp1));

        System.out.println("R1 + R2 = " + real1.add(real2));

        // System.out.println("radius of R1" + real1.radius());
        // --> Error occurs since `radius` method of Complex class is default , not protected.
        Complex compReal1 = (Complex) real1 ;
        System.out.println(compReal1.radius());
        Complex real3 = new Real(7) ;
        System.out.println(real3.radius());



    }

}

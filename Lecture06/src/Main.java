import ComplexAlgebra.Complex ;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(3,-1) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p.getX() + ", " + p.getY()+ " )");
        p.move(2, 4) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p.getX() + ", " + p.getY()+ " )");
        Point3d p1 = new Point3d(2, -1, 1) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p1.getX() + ", " + p1.getY()+ ", "+ p1.getZ() + " )");
        p1.move(1, 2, 3) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p1.getX() + ", " + p1.getY()+ ", "+ p1.getZ() + " )");
        p1.move(-1,-2) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p1.getX() + ", " + p1.getY()+ ", "+ p1.getZ() + " )");

        // check "Is-a" Relationship in Java
        System.out.println("p is an instance of Point class ? --> " + (p instanceof Point));
        System.out.println("p is an instance of Point3d subclass ? --> " + (p instanceof Point3d));
        System.out.println("p1 is an instance of Point class ? --> " + (p1 instanceof Point));
        System.out.println("p1 is an instance of Point3d subclass ? --> " + (p1 instanceof Point3d));

        Point p2 = new SlowPoint() ;  // `Parent obj = new Child()` pattern : Intrinsic upcasting
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p2.getX() + ", " + p2.getY()+ " )");
        p2.move(32, -32);
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p2.getX() + ", " + p2.getY()+ " )");
        System.out.println("p2 is an instance of Point class ? --> " + (p2 instanceof Point));
        System.out.println("p2 is an instance of SlowPoint subclass ? --> " + (p2 instanceof SlowPoint));

        Greet hi = new MorningGreet() ;
        System.out.println(hi.greeting() + " , " + hi.name() );
        /* A static method `greeting()` is called based on type `Greet`
        while an instance method `name()` is called based on the actual instance type `MorningGreet` */
        MorningGreet hello = new MorningGreet() ;
        System.out.println(hello.greeting() + " , " + hello.name());
        Greet hihi = (Greet) hello ;
        System.out.println(hihi.greeting() + " , " + hihi.name());
        /* `hihi` still points to the instance of the subclass `MorningGreet`.
        Casting does not change the type of the instance itself.  */

        Parent parent = new Parent(25) ;
        Child child = new Child(500) ;
        /* Even without explicit superclass constructor call with `super()`,
        the default constructor of superclass `Parent` is implicitly invoked. */
        System.out.println(parent.var);
        System.out.println(child.var);
        System.out.println(child.getParentVar());
        child.printVar();
        child.printName();
        child.printParentName();
        child.accessTest();

        Complex c1 = new Complex(2,3) ;
        Complex c2 = new Complex(3,5) ;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        // System.out.println("c1+c2  = " + c1.add(c2));
        // --> Error : add(ComplexAlgebra.Complex) has protected access in ComplexAlgebra.Complex
        // System.out.println("radius of c1 : " + c1.radius());
        // --> Error : radius() is not public in ComplexAlgebra.Complex; cannot be accessed from outside package
        /* Difference in access modifier yields different behavior
        constructor of Complex class : public
        instance method `toString` of Complex class : public
        instance method `add` of Complex class : protected
        instance method `radius` of Complex class : default */

        Point o = Point.origin ;
        System.out.print("The origin is : " );
        System.out.println("( "+ o.getX() + ", " + o.getY()+ " )");

    }
}

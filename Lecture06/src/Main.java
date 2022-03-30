public class Main {
    public static void main(String[] args) {
        Point p = new Point() ;
        p.move(2, 4) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p.getX() + ", " + p.getY()+ " )");
        Point3d p1 = new Point3d() ;
        p1.move(1, 2, 3) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p1.getX() + ", " + p1.getY()+ ", "+ p1.getZ() + " )");
        p1.move(3,5) ;
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p1.getX() + ", " + p1.getY()+ ", "+ p1.getZ() + " )");

        // check "Is-a" Relationship in Java
        System.out.println("p is an instance of Point class ? --> " + (p instanceof Point));
        System.out.println("p is an instance of Point3d subclass ? --> " + (p instanceof Point3d));
        System.out.println("p1 is an instance of Point class ? --> " + (p1 instanceof Point));
        System.out.println("p1 is an instance of Point3d subclass ? --> " + (p1 instanceof Point3d));

        Point p2 = new SlowPoint() ;  // `Parent obj = new Child()` pattern : Intrinsic upcasting
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

        Parent parent = new Parent() ;
        Child child = new Child() ;
        System.out.println(parent.var);
        System.out.println(child.var);
        System.out.println(child.getParentVar());
        child.printVar();
        child.printName();
        child.printParentName();
        child.accessTest();



    }
}

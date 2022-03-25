// Inheritance
class Point{
    int x , y ;
    public void move(int dx, int dy) {
        x += dx; y+= dy;
    }
    public int getX(){
        return x ;
    }
    public int getY(){
        return y ;
    }

}

class Point3d extends Point{
    int z;
    public void move(int dx, int dy, int dz){
        x+= dx; y+= dy; z+= dz;
    }
    public int getZ(){
        return z ;
    }
}
// Overriding Example
class SlowPoint extends Point{
    int xLimit = 10, yLimit = 10 ;
    @Override public void move(int dx, int dy){
        super.move(limit(dx, xLimit), limit(dy, yLimit)) ;
    }
    static int limit(int d, int limit){
        return d > limit ? limit : d < -limit ? -limit : d ;
    }
}

public class Lecture6 {
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
        System.out.println(p instanceof Point);
        System.out.println(p instanceof Point3d);
        System.out.println(p1 instanceof Point);
        System.out.println(p1 instanceof Point3d);

        Point p2 = new SlowPoint() ;  // `Parent obj = new Child()` pattern
        p2.move(32, -32);
        System.out.print("Current location of the point is : " );
        System.out.println("( "+ p2.getX() + ", " + p2.getY()+ " )");


    }
}

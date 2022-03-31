// Inheritance
class Point{
    private int x , y ;
    Point(int x, int y){
        this.x = x ;
        this.y = y ;
    }
    Point() {
        x= 0; y=0 ;
    }
    public void move(int dx, int dy) {
        x += dx; y+= dy;
    }
    public int getX(){
        return x ;
    }
    public int getY(){
        return y ;
    }

    static final Point origin = new Point(0, 0) ;

}

class Point3d extends Point{
    private int z;
    Point3d(int x, int y , int z){
        // superclass constructor call
        super(x, y) ;
        this.z = z ;
    }
    Point3d() {
        /* Even without explicit superclass constructor call with `super()`,
        default constructor of the superclass is implicitly invoked */
        // super() ; --> does not matter whether this code exists or not
        z=0 ;
    }
    public void move(int dx, int dy, int dz){
        // Access private superclass fields x and y with an accessible superclass method `move`
        super.move(dx, dy);
        z+= dz;
    }
    public int getZ(){
        return z ;
    }
}

// Overriding Example
class SlowPoint extends Point{
    SlowPoint() {}
    SlowPoint(int x,int y){
        super(x,y) ;
    }
    int xLimit = 10, yLimit = 10 ;
    @Override public void move(int dx, int dy){
        super.move(limit(dx, xLimit), limit(dy, yLimit)) ;
    }
    static int limit(int d, int limit){
        return d > limit ? limit : Math.max(d, -limit);
    }
}
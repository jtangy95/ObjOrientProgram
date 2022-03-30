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
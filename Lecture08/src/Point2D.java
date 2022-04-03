class Point2D {
    int x =0 , y =0 ;
    void move(int dx, int dy){
        x += dx ;
        y += dy ;
    }
    int getX() {return x ;}
    int getY() {return y; }

    void show(){
        System.out.println("(" + x + " ," + y + ")");
    }
}

class RealPoint2D extends Point2D {
    double x =0, y=0 ; // hiding variables of superclass
    // Overriding instance method
    void move(int dx, int dy){
        move((double) dx, (double) dy) ;
    }
    // Overloading the `move` method right above
    void move(double dx, double dy){
        x += dx ;
        y += dy ;
    }
    // For overriding an instance method of superclass, return type must also be same
    int getX() {return (int) Math.floor(x) ;}
    int getY() {return (int) Math.floor(y) ;}

    /* If we don't have this code, then
    RealPoint2d p = new RealPoint2d()
    p.move(3.15, 4.16)
    p.show() --> result is (0, 0)
    since show() calls the instance method of superclass Point2d
    so that it prints x=0, y=0 of variable in superclass */
    void show(){
        System.out.println("(" + x + " ," + y + ")");
    }

}
class Point {
    private double x, y ;
    // Constructor Overloading : multiple constructors with different parameter formats
    // One constructor can call another constructor with `this()`
    Point(double x, double y){
        this.x = x ;
        this.y = y ;
    }
    Point(int x, int y){
        this( (double) x, (double) y ) ;
    }
    Point() {
        this(0, 0) ;
    }
    Point(double radius, double theta, boolean polarTrue){
        this.x = radius * Math.cos(theta) ;
        this.y = radius * Math.sin(theta) ;
    }

    // Overloading to handle the same task on different data types
    void move(int dx, int dy){
        x += dx ;
        y += dy ;
    }
    void move(double dx, double dy) {
        x += dx ;
        y += dy ;
    }
    public String toString() {
        return "(" + x + " , " + y + ")" ;
    }
}

class Car {
    static int num ;
    static int totalMile ;
    int speed ;
    String color = "unknown" ;
    int mile ;
    Car(int speed) {
        this.speed = speed ;
        num++ ;
    }
    Car(int speed, String color){
        this.speed = speed ; // LHS is attribute and RHS is argument (parameter)
        this.color = color ;
        num++ ;
    }
    void printInfo(){
        System.out.println(speed + "km/h  ,  " + color);
    }
    int getSpeed() {
        return speed ;
    }
    void changeSpeed(int speed) {
        this.speed = speed ;
    }
    void setMile(int mile) {
        this.mile = mile ;
        totalMile += mile;
    }
}
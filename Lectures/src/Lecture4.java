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

class IntHolder {
    int value;
    IntHolder(int value) {
        this.value = value;
    }
}


public class Lecture4 {

    static void badSwap(int a , int b) {
        // call by value ; when you pass a primitive type variable as an argument
        int temp;
        temp = a;
        a = b;
        b= temp;
    }

    static void goodSwap(IntHolder a, IntHolder b){
        // call by reference ; when you pass an object as an argument
        int temp = a.value;
        a.value = b.value ;
        b.value = temp;
    }

    public static void main(String[] args){

        Car myCar = new Car(120, "blue");
        System.out.println(myCar.getSpeed());
        myCar.printInfo() ;
        myCar.changeSpeed(150) ;
        myCar.printInfo() ;
        Car steveCar = new Car(100, "red");
        Car bobCar = new Car(90, "green");
        myCar.setMile(20);
        steveCar.setMile(30);
        bobCar.setMile(40);
        System.out.println("mileage of myCar is : " + myCar.mile);
        System.out.println("Total number of cars are : " + Car.num);
        System.out.println("Total mileage of cars are : " +  Car.totalMile);

        // How `==` works for Objects
        String str1 = new String("Hey");
        String str2 = new String("Hey");
        String str3 = str1 ;
        System.out.println("str1 and str2 : same address?  " + (str1 == str2));
        System.out.println("str1 and str3 : same address?  " + (str1 == str3));
        System.out.println("str1 and str2 : same content?  " + str1.equals(str2)); // str1.equals(str2) is a method for string to compare contents


        // Test for swap functions
        int a = 20, b = 30 ;
        badSwap(a, b);
        System.out.println("a is : " + a + " and b is : " + b );

        IntHolder aa = new IntHolder(20), bb = new IntHolder(30) ;
        goodSwap(aa, bb);
        System.out.println("aa contains : " + aa.value + " and bb contains : " + bb.value );


    }
}

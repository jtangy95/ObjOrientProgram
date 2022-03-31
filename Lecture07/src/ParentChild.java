class Parent {
    // static method
    static void printStatic() {
        System.out.println("Parent Print Static");
    }
    // instance method
    void printDynamic(){
        System.out.println("Parent Print Dynamic");
    }
}
class Child extends Parent {
    // static method
    static void printStatic() {
        System.out.println("Child Print Static");
    }
    // instance method
    @Override
    void printDynamic(){
        System.out.println("Child Print Dynamic");
    }
}
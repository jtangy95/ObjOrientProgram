// Abstract Class Example

abstract public class Person {
    String name ;
    private int age ;
    Person(String name, int age){
        this.name = name ;
        this.age = age ;
    }
    public void printName() {
        System.out.println(name);
    }
    public void ageOneYear() {
        System.out.printf("%s is now %d years old. \n", name, ++age);
    }
    abstract void work() ;
    abstract void play() ;
}

class BusinessMan extends Person{
    BusinessMan(String name, int age){
        super(name, age) ;
    }
    public void work() {
        System.out.println("Conference room in five minute");
    }
    public void play() {
        System.out.println("Party in the restaurant");
    }
}

class Professor extends Person{
    Professor(String name, int age){
        super(name, age) ;
    }
    public void work() {
        System.out.println("Seminar room in five minute");
    }
    public void play() {
        System.out.println("Turn on Netflix");
    }
}

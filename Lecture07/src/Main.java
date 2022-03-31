import java.util.List ;
import java.util.ArrayList ;
import java.util.Collections ;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child() ;
        obj.printStatic() ; // static binding
        obj.printDynamic() ; // dynamic binding

        Shape[] shapes = new Shape[5] ;
        for(int i=0 ; i < shapes.length ; i++){
            shapes[i] = Shape.randomShape() ;
            shapes[i].draw() ; // dynamic binding
            /* For each i, shapes[i] is equivalent to
            `Shape object = new Circle()` or `Shape object new Square()` */
        }

        Student student = new Student("Michael",  "Scott", 3010592) ;
        System.out.println(student);

        Shoes shoes1 = new Shoes("Nike", "AirMax", 265) ;
        Shoes shoes2 = new Shoes("Nike", "AirMax", 265) ;
        Shoes shoes3 = shoes1 ;
        DressShoes shoes4 = new DressShoes("DrMartin", "Black", 265, "Oxford") ;
        DressShoes shoes5 = new DressShoes("DrMartin", "Black", 265, "Oxford") ;
        Shoes shoes6 = new Shoes("Nike", "AirForce", 270) ;
        System.out.println("shoes1 and shoes2 --> same address ? :  " + (shoes1 == shoes2));
        System.out.println("shoes1 and shoes2 --> same content ? :  " + shoes1.equals(shoes2));
        System.out.println("shoes1 and shoes3 --> same address ? :  " + (shoes1 == shoes3));
        System.out.println("shoes1 and shoes3 --> same content ? :  " + shoes1.equals(shoes3));
        System.out.println("shoes4 and shoes5 --> same content ? :  " + shoes4.equals(shoes5));
        System.out.println("shoes4 and shoes1 --> same content ? :  " + shoes4.equals(shoes1));
        System.out.println("shoes2 and shoes5 --> same content ? :  " + shoes2.equals(shoes5));
        System.out.println("shoes1 and shoes6 --> same content ? : " + shoes1.equals(shoes6));
        System.out.println("shoes1 and student --> same content? : " + shoes1.equals(student));

        // List<E> Interface
        List<Integer> list = new ArrayList<>() ;
        list.add(10) ;
        list.add(20) ;
        list.add(30) ;
        list.remove(1) ;
        System.out.println("the length of this list is : " + list.size() );
        System.out.println(list);

        List<Undergraduate> undergraduatesList = new ArrayList<Undergraduate>() ;
        Undergraduate student1 = new Undergraduate("Bob", 4.0) ;
        Undergraduate student2 = new Undergraduate("Jim", 3.85) ;
        Undergraduate student3 = new Undergraduate("Dwight", 4.2) ;
        Undergraduate student4 = new Undergraduate("Pam", 3.5) ;

        undergraduatesList.add(student1) ;
        undergraduatesList.add(student2) ;
        undergraduatesList.add(student3) ;
        undergraduatesList.add(student4) ;

        System.out.println(undergraduatesList);
        Collections.sort(undergraduatesList) ;
        System.out.println(undergraduatesList);

        Person busyMan = new BusinessMan("Ryan", 32) ;
        Person smartMan = new Professor("Robert" , 51) ;

        busyMan.ageOneYear();
        smartMan.ageOneYear();

        busyMan.play();
        busyMan.work();
        smartMan.play();
        smartMan.work();

    }
}

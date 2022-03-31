class Parent {
    int var = 10 ;
    Parent(){
        System.out.println("Parent Class Constructor is called");
    }
    Parent(int var){
        this.var = var ;
        System.out.println("Parent Class Constructor is called");
    }
    void printName() {
        System.out.println("Parent Name");
    }
    String str() {
        return "Parent String" ;
    }
}

class Child extends Parent {
    // hiding variable
    int var = 100 ;
    Child(){
        System.out.println("Child Class Constructor is called");
    }
    Child(int var){
        this.var = var ;
        System.out.println("Child Class Constructor is called");
    }
    int getParentVar() {
        // use `super` to access parent class instance variable (even hidden one)
        return super.var ;
    }
    void printVar() {
        System.out.println(
                // type casting `((Parent)this).var` is another way to access a hidden instance variable
                // Note that overridden instance method cannot be accessed in the similar way, due to dynamic binding
                "child variable : " +  var + " & parent variable : " + ((Parent)this).var
        );
    }
    @Override
    void printName() {
        System.out.println("Child Name");
    }
    void printParentName() {
        super.printName();
    }

    String str() {
        return "Child String";
    }
    void accessTest(){
        System.out.println("str() --> " + str());
        System.out.println("super.str() --> " + super.str());
        System.out.println("((Parent)this).str() --> "+ ((Parent)this).str()); // result is "child"
        /* casting to a superclass type is not effective in attempting to access an overridden method since
        instance method calls are based on the actual type */
    }
}

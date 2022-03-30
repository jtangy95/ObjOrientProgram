class Parent {
    int var = 10 ;
    void printName() {
        System.out.println("Parent");
    }
    String str() {
        return "Parent" ;
    }
}

class Child extends Parent {
    // hiding variable
    int var = 100 ;
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
        System.out.println("Child");
    }
    void printParentName() {
        super.printName();
    }

    String str() {
        return "Child";
    }
    void accessTest(){
        System.out.println("str() --> " + str());
        System.out.println("super.str() --> " + super.str());
        System.out.println("((Parent)this).str() --> "+ ((Parent)this).str()); // result is "child"
        /* casting to a superclass type is not effective in attempting to access an overridden method since
        instance method calls are based on the actual type */
    }
}

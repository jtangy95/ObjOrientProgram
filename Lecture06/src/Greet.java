class Greet {
    static String greeting() {
        return "Hello" ;
    }
    String name() {
        return "Person" ;
    }
}

class MorningGreet extends Greet {
    // Hiding : on static methods
    static String greeting() {
        return "Good Morning" ;
    }
    // Overriding : on instance method
    String name() {
        return "Chris" ;
    }
}

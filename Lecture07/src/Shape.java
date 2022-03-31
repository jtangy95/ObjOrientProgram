class Shape {
    void draw() {
        System.out.println("Shape Default");
    }
    public static Shape randomShape() {
        switch((int)(Math.random() * 2 )){
            case 0 : return new Circle() ;
            case 1 : return new Square() ;
            default : return new Shape() ; // meaningless return to prevent error
        }
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle is drawn");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square is drawn");
    }
}

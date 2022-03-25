// Encapsulation
class AppleStore {
    private int balance = 10000 ;
    private int stock = 30 ;

    AppleStore() {

    }
    AppleStore(int balance, int stock){
        this.balance = balance ;
        this.stock = stock ;
    }
    private boolean inStock(int num){
        if(num > stock){
            return false;
        } else{
            return true ;
        }
    }
    boolean sell (int num) {
        if(inStock(num)){
            balance += 2000 * num ;
            stock -= num ;
            return true;
        } else{
            return false;
        }
    }
    int getBalance() {
        return this.balance ;
    }
    int getStock() {
        return this.stock ;
    }
}

// getter and setter
class Student {
    private String name ;
    public void setName(String name){
        if (name == null || name.equals("")){
            System.out.println("Name cannot be null or empty");
        } else{
            this.name = name;
        }
    }
    public String getName(){
        return name ;
    }
}

// trace accesses to private Variables
class VarChange{
    private int valueToBeWatched ;
    private int countOfChange ; // trace # of changes
    private int readHistory ; // trace # of reads

    public void setValue(int value) {
        valueToBeWatched = value ;
        countOfChange++ ;
        System.out.println("This is change #"+ countOfChange);
    }
    public int getValue(){
        readHistory++;
        return valueToBeWatched;
    }

    public int getReadHistory(){
        return readHistory ;
    }
}

// Inner Class
class Calculator {
    Adder adder ;
    Multiplier multiplier;
    int battery ;
    int price ;
    Calculator(int battery){
        this.battery = battery;
        adder = new Adder(battery);
        multiplier = new Multiplier(battery);
        price = adder.price + multiplier.price ;
    }
    int specialOp(int opd1, int opd2){
        if (battery > 0){
            System.out.println(--battery + " blocks of battery is left.");
            return adder.add(opd1, opd2) - multiplier.multiply(opd1, opd2) ;
        } else{
            System.out.println("The battery is dead! Please Charge. Zero value will be returned.");
            return 0 ;
        }
    }
    int getPrice(){
        return adder.price + multiplier.price;
    }
    private class Adder {
        int price ;
        Adder(int battery){
           price = 500 * battery ;
        }
        int add(int opd1, int opd2){
            price += 100 ;
            return opd1 + opd2 ;
        }
    }
    private class Multiplier{
        int price ;
        Multiplier(int battery){
            price = 1000* battery;
        }
        int multiply(int opd1, int opd2){
            price += 300 ;
            return opd1 * opd2 ;
        }
    }
}

public class Lecture5 {

    public static void main(String[] args){
        AppleStore store = new AppleStore() ;
        System.out.println("Initial balance and stock...");
        System.out.println(store.getBalance() + " , " + store.getStock());
        boolean success = store.sell(3) ;
        if (success) {
            System.out.println("After selling 3 apples...");
            System.out.println(store.getBalance() + " , " + store.getStock());
        } else{
            System.out.println("Not enough apples in stock");
        }

        if (store.sell(28)) {
            System.out.println("After selling 3 apples...");
            System.out.println(store.getBalance() + " , " + store.getStock());
        } else{
            System.out.println("Not enough apples in stock");
        }


        AppleStore newstore = new AppleStore(12000, 50) ;
        System.out.println("Initial balance and stock...");
        System.out.println(newstore.getBalance() + " , " + newstore.getStock());
        newstore.sell(5) ;
        System.out.println("After selling 3 apples...");
        System.out.println(newstore.getBalance() + " , " + newstore.getStock());

        // System.out.println(store.balance); --> triggers error : `balance` has private access in AppleStore

        Student student1 = new Student() ;
        student1.setName("Bob") ;
        System.out.println(student1.getName());

        VarChange var1 = new VarChange() ;
        System.out.print("First Read : "+ var1.getValue());
        System.out.println(" , read History : "+var1.getReadHistory());
        for(int i=0; i<2 ; i++){
            System.out.print("Setting stage " + (i+1) + " : ");
            var1.setValue(i+37) ;
        }
        System.out.print("Second Read : "+ var1.getValue());
        System.out.println(" , read History : "+var1.getReadHistory());

        // using class in a different package
        System.out.println("Welcome to SNU Mart");
        computer.Keyboard keyboardComputer = new computer.Keyboard(15521, "Gaming Keyboard") ;
        instrument.Keyboard digitalPiano = new instrument.Keyboard(13113, "Black and White Keyboard");
        keyboardComputer.printInfo();
        digitalPiano.printInfo();

        Calculator cal = new Calculator(3) ;
        System.out.println("\nEntering fee of this calculator is " + cal.getPrice() + "\n");
        for(int i=0 ; i<4 ; i++){
            System.out.print("result of "+ i + " and " + (i+1) + " : \n");
            System.out.println(cal.specialOp(i, i+1));
            System.out.println("current price is " + cal.getPrice() +"\n");
        }

    }
}



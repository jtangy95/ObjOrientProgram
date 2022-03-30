public class Main {

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
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
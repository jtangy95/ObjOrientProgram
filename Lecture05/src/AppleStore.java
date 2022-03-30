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
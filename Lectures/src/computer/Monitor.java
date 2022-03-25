package computer;

public class Monitor {
    private int id ;
    private String name ;

    public Monitor(int id, String name){
        this.id = id;
        this.name = name ;
    }

    public void printInfo(){
        if(id %10 ==1){
            System.out.println(name + " : Samsung device");
        } else if (id %10 ==2){
            System.out.println(name + " : LG device");
        } else{
            System.out.println(name + " : Apple device");
        }
    }
}

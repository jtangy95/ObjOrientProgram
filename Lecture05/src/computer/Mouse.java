package computer;

public class Mouse {
    private int id ;
    private String name ;

    public Mouse(int id, String name){
        this.id = id;
        this.name = name ;
    }

    public void printInfo(){
        if(id %10 ==1){
            System.out.println(name + " : Logitech device");
        } else if (id %10 ==2){
            System.out.println(name + " : Microsoft device");
        } else{
            System.out.println(name + " : Apple device");
        }
    }
}

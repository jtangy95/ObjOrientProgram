package computer ;

public class Keyboard {
    private int id ;
    private String name ;

    public Keyboard(int id, String name){
        this.id = id;
        this.name = name ;
    }

    public void printInfo(){
        if(id %10 ==1){
            System.out.println(name + " : Logitech device");
        } else if (id %10 ==2){
            System.out.println(name + " : Razer device");
        } else{
            System.out.println(name + " : Corsair device");
        }
    }
}

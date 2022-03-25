package instrument;

public class Keyboard {
    private int id ;
    private String name ;

    public Keyboard(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printInfo(){
        if(id %10 ==1){
            System.out.println(name + " : Casio device");
        } else if (id %10 ==2){
            System.out.println(name + " : Roland device");
        } else{
            System.out.println(name + " : Yamaha device");
        }
    }
}

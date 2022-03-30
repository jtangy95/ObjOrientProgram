package instrument;

public class Drum {
    private int id ;
    private String name ;

    public Drum(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printInfo(){
        if(id %10 ==1){
            System.out.println(name + " : Tama device");
        } else if (id %10 ==2){
            System.out.println(name + " : Pearl device");
        } else{
            System.out.println(name + " : DrumWorkshop device");
        }
    }
}

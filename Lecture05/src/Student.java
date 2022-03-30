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
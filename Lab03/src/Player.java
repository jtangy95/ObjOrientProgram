public class Player {
    String userId;
    private int health = 50 ;
    Player(String userId) {
        this.userId = userId;
    }
    public void setHealth(int health){
        this.health = health ;
    }
    public int getHealth(){
        return health;
    }
    public void attack(){
        int hit = (int) (Math.random() * 5) + 1 ;
        health = health < hit ? 0 : health - hit ;
    }
    public void heal(){
        int bless = (int) (Math.random() * 3) + 1 ;
        health = health + bless > 50 ? 50 : health + bless ;
    }
    public boolean alive(){
        return health>0 ;
    }
    public char getTactic(){
        char tactic = Math.random()<0.7 ? 'a' : 'h' ;
        return tactic ;
    }

}



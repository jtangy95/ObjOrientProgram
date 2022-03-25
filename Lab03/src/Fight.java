public class Fight {
    int timeLimit = 25;
    int currRound = 0;

    Player p1;
    Player p2;

    Fight(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void proceed() {

        if(p1.getTactic() == 'a') {
            p2.attack() ;
        } else if(p1.getTactic() == 'h'){
            p1.heal() ;
        }

        if(p2.alive()){
            if(p2.getTactic() == 'a') {
                p1.attack() ;
            } else if(p2.getTactic() == 'h'){
                p2.heal() ;
            }
        }

        currRound++ ;
        System.out.println("Round " + currRound);
        System.out.printf("%s health: %d\n", p1.userId, p1.getHealth());
        System.out.printf("%s health: %d\n", p2.userId, p2.getHealth());


    }
    public boolean isFinished(){
        boolean fin = (p1.getHealth()==0 || p2.getHealth()==0 || currRound == timeLimit ) ;
        return fin ;
    }
    public Player getWinner(){
        if(p1.getHealth() ==0 ){
            return p2 ;
        } else if(p2.getHealth()==0 ){
            return p1 ;
        } else if(p1.getHealth() > p2.getHealth()){
            return p1 ;
        } else{
            return p2;
        }
    }

}

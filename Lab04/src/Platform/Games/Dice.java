package Platform.Games;

public class Dice {
    public int playGame() {
        int user = (int) (100 * Math.random()) ;
        int oppo = (int) (100 * Math.random()) ;
        System.out.print(user + " ");
        System.out.println(oppo);
        return Integer.compare(user, oppo) ;
    }
}

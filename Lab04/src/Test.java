import Platform.Platform;

public class Test {
    public static void main(String[] args){
        System.out.println("Choose 0 for Dice, 1 for RockPaperScissors");
        Platform platform = new Platform();
        platform.setRounds(10);
        platform.setRounds(2);
        float winrate = platform.run();
        System.out.println("winrate of the user is " + winrate);
    }
}
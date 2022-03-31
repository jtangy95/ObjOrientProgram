package Platform;

//import Platform.Games.Dice;
//import Platform.Games.RockPaperScissors;

import Platform.Games.* ;

import java.util.Scanner ;

public class Platform {
    private int round = 1 ;
    private boolean firstAttempt = true ;
    public float run(){
        Scanner scanner = new Scanner(System.in) ;
        int game = scanner.nextInt() ;

        int win = 0 ;
        float winrate ;

        if(game == 0){
            Dice dice = new Dice();
            for(int i =0 ; i< round ; i++){
                int status = dice.playGame() ;
                if(status == 1){
                    win += 1;
                }
            }
            winrate = win / (float) round;
            return winrate;
        } else if(game == 1){
            RockPaperScissors rsp = new RockPaperScissors() ;
            for(int i =0 ; i< round ; i++){
                int status = rsp.playGame() ;
                if(status == 1){
                    win += 1;
                }
            }
            winrate = win / (float) round;
            return winrate ;

        }


        return -0.0f ; // 에러 방지용 리턴
    }
    public void setRounds(int num){
        if(firstAttempt){
            this.round = num ;
            firstAttempt = false ;
        }
    }
}

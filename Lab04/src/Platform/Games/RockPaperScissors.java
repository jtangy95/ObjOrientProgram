package Platform.Games;

import java.util.Scanner ;

public class RockPaperScissors {
    public int playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock Paper Scissor! (you must type in lower case) : ");
        String user = scanner.next() ;

        int oppoRand = (int) (Math.random() * 3) ;
        String oppo = " ";
        switch(oppoRand){
            case 0 :
                oppo = "scissor" ;
                break ;
            case 1 :
                oppo = "rock" ;
                break ;
            case 2 :
                oppo = "paper" ;
                break ;
        }

        System.out.print(user + " ");
        System.out.println(oppo);

        if(!(user.equals("scissor") || user.equals("rock") || user.equals("paper"))){
            return -1 ;
        }

        if(user.equals(oppo)){
            return 0 ;
        }

        if(user.equals("scissor")){
            return oppoRand == 1 ? -1 : 1 ;
        } else if(user.equals("rock")) {
            return oppoRand == 2 ? -1 : 1 ;
        } else if(user.equals("paper")){
            return oppoRand == 0 ? -1 : 1 ;
        }

        return -1 ; // error 방지용 return

    }

}

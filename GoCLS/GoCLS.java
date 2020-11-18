import java.io.File;
import java.util.Scanner;

public class GoCLS {
    //main method
    public static void main (String[] args){
    
       boolean gameBoardLogic[][] = gameSpace();

    
    
          cmdGameScreen(gameBoardLogic);
    
    }
    static boolean[][] gameSpace(){
        boolean gameBoardLogic[][] = { //sets DEFAULT 15*15 game table
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,true/*c*/,false,false,false,false,false,false,false},  //center
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false},
            {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false}
            //                                        center
            File custom = new File("gameGridSize/Custom");
            File Pre15x15 = new File("gameGridSize/Pre15x15");
            bool select = false; // selects either custom grid or defaults grid | true = custom || false = defaults |
            try {
            
                Scanner reader = new Scanner(Pre15x15)
                

                for (int i = 0; ; i++) {
                    
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

        return gameBoardLogic[][];
    }

    static void cmdGameScreen(boolean[][] gameBoardLogic){

        char gameScreenAscII[][] = {
            {'o',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','o'}
        };

        for( int r = 0; r < 15 ; r++ ){                 //traductor from bool to ascii 
                                                        // false means space
            for(int c = 0; c < 15; c++ ){               // true mean o
                                                        // this is used to output shapes
                if( gameBoardLogic[r][c] == true ){     //
                  gameScreenAscII[r][c] = ('o');        //
                }                                       //
                else{                                   //
                gameScreenAscII[r][c] = (' ');          //
                                                        //
                }                                       //
            }                                           //
        }                                               //
    
        for (int row = 0; row < gameScreenAscII.length; row++) {                    //this outputs the char gameScreenAscII
            for (int column = 0; column < gameScreenAscII[row].length; column++) {  // displays spaces or 'o'
                System.out.print(gameScreenAscII[row][column] + " ");               //
            }                                                                       //
           System.out.println();                                                    //
        }                                                                           //
    }


    
	

}
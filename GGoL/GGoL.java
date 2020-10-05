public class GGoL {

    public static void main (String[] args){
        boolean gameBoardLogic[][] = { //sets 15*15 game table
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

        }

        String gameScreenAscII[][] = {
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
        }

        for( int r = 0; r < 15 ; r++ ){
            for(int c = 0; r < 15; c++  ){
                if(gameBoardLogic[r][c] = true ){
                    gameScreenAscII[r][c] = ("o");

                }
                else{
                    gameScreenAscII[r][c] = (" ");
                }
            }

        }




    }

	

}
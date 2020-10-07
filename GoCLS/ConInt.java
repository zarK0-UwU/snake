public class ConInt {

    public static void main(String[] args){
        boolean a = true; // es solo para que no aparezca el error de que el metodo main esta vacio (me estaba poniendo de los nervios)    
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

        for( int r = 0; r < 15 ; r++ ){ 
            for(int c = 0; r < 15; c++ ){

                if( gameBoardLogic[r][c] = true ){ 
                  gameScreenAscII[r][c] = ('o');
                } 
                else{ 
                gameScreenAscII[r][c] = (' '); 
             
                }
            }
        }
    
        for (int row = 0; row < gameScreenAscII.length; row++) {
            for (int column = 0; column < gameScreenAscII[row].length; column++) {
                System.out.print(gameScreenAscII[row][column] + " ");
        }
           System.out.println();
       }
    }
}

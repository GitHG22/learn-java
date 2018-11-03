import java.util.Random;

class table {
    private char hori = '-'; /** the character which is printed as the horizontal lines*/
    private char verti = '|'; /** the character which is printed as the vertical lines*/
    private char values[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};


    public void printtable(){
        System.out.println(" " + values[0][0] + " " + verti + " " + values[0][1] + " " + verti + " " + values[0][2] + " ");
        for(int i = 0; i<11; i++){
            System.out.print(hori);
        }
        System.out.print('\n');

        System.out.println(" " + values[1][0] + " " + verti + " " + values[1][1] + " " + verti + " " + values[1][2] + " ");

        for(int i = 0; i<11; i++){
            System.out.print(hori);
        }
        System.out.print('\n');

        System.out.println(" " + values[2][0] + " " + verti + " " + values[2][1] + " " + verti + " " + values[2][2] + " ");
    }

    public void set(int r,int c, char player){
        values[r-1][c-1] = player;
    }

    public void init(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                values[i][j] = ' ';
            }
        }
    }

    // set() For single player
    public void set(){
        Random rand = new Random();
        values[rand.nextInt(3)][rand.nextInt(3)] = 'O';
    }

    public int checkwin(){
        int checkX = 0;
        int checkO = 0;
        int checkXverti = 0;
        int checkOverti = 0;
        int checkXcross1 = 0;
        int checkOcross1 = 0;
        int checkXcross2 = 0;
        int checkOcross2 = 0;

        // Check for win by running through the tables

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(values[i][j] == 'X'){
                    checkX+=1;
                }
                else if(values[i][j] == 'O'){
                    checkO+=1;
                }

                if(values[j][i] == 'X'){
                    checkXverti+=1;
                }
                else if(values[j][i] == 'O'){
                    checkOverti+=1;
                }
            }

            if(values[i][i] == 'X'){
                checkXcross1+=1;
            }
            else if(values[i][i] == 'O'){
                checkOcross1+=1;
            }

            if(values[i][2-i] == 'X'){
                checkXcross2+=1;
            }
            else if(values[i][2-i] == 'O'){
                checkOcross2+=1;
            }


            if(checkX==3 || checkXverti==3 || checkXcross1==3 || checkXcross2==3){
                return 1;
            }
            else if(checkO==3 || checkOverti==3 || checkOcross1==3 || checkOcross2==3){
                return 2;
            }

            checkX = 0;
            checkO = 0;
            checkXverti = 0;
            checkOverti = 0;

      }
        return 0;
    }



}


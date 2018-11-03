import java.util.Scanner;

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

    public int checkwin(){
        int checkX = 0;
        int checkO = 0;
        int checkXhori = 0;
        int checkOhori = 0;
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

                if(values[i][j] == 'X'){
                    checkXhori+=1;
                }
                else if(values[i][j] == 'O'){
                    checkOhori+=1;
                }
            }
            if(checkX==3){
                return 1;
            }
            else if(checkO==3){
                return 2;
            }
            if(checkXhori==3){
                return 1;
            }
            else if(checkOhori==3){
                return 2;
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
            checkX=0;
            checkO=0;

        if(checkXcross1==3){
            return 1;
        }
        else if(checkOcross1==3){
            return 2;
        }
        if(checkXcross2==3){
            return 1;
        }
        else if(checkOcross2==3){
            return 2;
        }

      }
        return 0;
    }



}

class match1{
    private String pname = new String();
    private Scanner read = new Scanner(System.in);
    private table m1;

    public void getname(){
        System.out.println("Please enter your name[X]: ");
        pname = read.nextLine();
    }

}


class match2{
    private String[] pname = new String[2];
    private Scanner read = new Scanner(System.in);
    private int chance = 1;
    private int row=1, col=1;
    private table m2 = new table();
    private char charplay;

    public void getname(){
        System.out.println("Enter your name Player 1[X]: ");
        pname[0] = read.nextLine();
        System.out.println("Enter your name Player 2[O]: ");
        pname[1] = read.nextLine();
    }

    public void play(){
        int winner;
        do{
          System.out.print("It is the turn of " + pname[chance]);
          if(chance==1){
              charplay = 'X';
              System.out.println("[X]");
              chance = 0;
          }
          else {
              charplay = 'O';
              System.out.println("[O]");
              chance = 1;
          }
          System.out.print("Enter the row: ");
          row = read.nextInt();
          System.out.print("Enter the column: ");
          col = read.nextInt();
          m2.set(row, col, charplay);
          winner = m2.checkwin();
          m2.printtable();
          if (winner == 1){
              System.out.print("Player 1 [" + charplay + "] " + pname + " won!");
              return;
          }
          else if (winner == 2){
              System.out.print("Player 2 [" + charplay + "] " + pname + " won!");
              return;
              }

        }while(winner==0);
    }

}

class zerokata{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        int opt;
        do {
            System.out.println("Choose the number of players :- " +
             "\n1. One Player" +
             "\n2. Two Players" +
             "\n0. Exit" +
             "\nChoose :-"
            );
            opt = read.nextInt();
            switch(opt){

                case 1:
                    match1 one = new match1();
                    one.getname();
                break;

                case 2:
                    match2 two = new match2();
                    two.getname();
                    two.play();
                break;

                default:
                    System.out.println("Okay, bye!");
                break;

            }
            }while(opt!=0);

        }
}

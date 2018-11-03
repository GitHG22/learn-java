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
    private int chance = 0;
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
          if(chance==0){
              charplay = 'X';
              System.out.println("[X]");
              chance = 1;
          }
          else {
              charplay = 'O';
              System.out.println("[O]");
              chance = 0;
          }
          System.out.print("Enter the row: ");
          row = read.nextInt();
          System.out.print("Enter the column: ");
          col = read.nextInt();
          m2.set(row, col, charplay);
          winner = m2.checkwin();
          m2.printtable();
          if (winner == 1){
              System.out.println("Player 1 [" + charplay + "] " + pname[winner-1] + " won!\n");
              return;
          }
          else if (winner == 2){
              System.out.println("Player 2 [" + charplay + "] " + pname[winner-1] + " won!\n");
              return;
              }

        }while(winner==0);
    }

}


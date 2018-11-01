import java.util.Scanner;


class zerokata{
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

            System.out.println(" " + values[2][0] + " " + verti + " " + values[2][1] + " " + verti + " " + values[1][2] + " ");
        }
    }

    class match1{
        private String pname = new String();
        private Scanner read = new Scanner(System.in);
        public void getname(){
            System.out.println("Please enter your name[X]: ");
            pname = read.nextLine();
        }
    }


    class match2{
        private String[] pname = new String[2];
        private Scanner read = new Scanner(System.in);
        private int chance = 1;
        private int row, col;
        public void getname(){
            System.out.println("Enter your name Player 1[X]: ");
            pname[0] = read.nextLine();
            System.out.println("Enter your name Player 2[O]: ");
            pname[1] = read.nextLine();
        }
        public void play(){
            System.out.print("It is the turn of " + pname[chance-1]);
            if(chance==1){
                System.out.println("[X]");
            }
            else {
                System.out.println("[O]");
            }
            System.out.print("Enter the row: ");
            row = read.nextInt();
            System.out.print("Enter the column: ");
            col = read.nextInt();
            set();
        }
        public void set(){
        
        }
        public void checkwin(){

        }
    }
    public static void main(String args[]){
        table first = new table();
        first.printtable();
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
                    break;
                default:
                    System.out.println("Okay, bye!");
                    break;
            }
            }while(opt!=0);

        }
}

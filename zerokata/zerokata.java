import java.util.Scanner;

class zerokata{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        match current = new match();
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
                    current.getname(1);
                    current.play();
                break;

                case 2:
                    current.getname(2);
                    current.play();
                break;

                default:
                    System.out.println("Okay, bye!");
                break;

            }
            current.cleanup();
            }while(opt!=0);

        }
}

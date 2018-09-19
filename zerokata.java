class table {
    private char hori = '-'; /** the character which is printed as the horizontal lines*/
    private char verti = '|'; /** the character which is printed as the vertical lines*/
    private char values[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    public void gentable(){
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

class zerokata{
    public static void main(String args[]){
        table first = new table();
        first.gentable();
    }
}

class table {
    private char hori = '-'; /** the character which is printed as the horizontal lines*/
    private char verti = '|'; /** the character which is printed as the vertical lines*/
    private char intrs = '+'; /** the character which is printed at intersections*/
    private char values[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    public void gentable(){
        System.out.printf(' ' + values[0][0]) + ' ' + verti);
        System.out.print(verti);
        System.out.print(values[0][1]+ verti + values[0][2]);
    }
}

class zerokata{
    public static void main(String args[]){
        table first = new table();
        first.gentable();
    }
}

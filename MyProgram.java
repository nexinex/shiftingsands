public class MyProgram
{
    public static void main(String[] args)
    {
        board thisBoard=new board();
        tile firstTile=new tile("f",2,3,5);
        tile secondTile=new tile("n",2,6,5);
        thisBoard.tiles=new tile[]{firstTile,secondTile};
        thisBoard.printBoard();
    }
}

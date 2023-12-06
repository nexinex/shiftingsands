public class tile {
    public String piece;
    public int direction;
    //0=towards player 1, 1==neutral clockwise, 2=towards player 2, 3=neutral clockwise from 2
    public int xPos;
    public int yPos;
    
    public tile(String inPiece, int inDirection,int inX,int inY)
    {
        piece=inPiece;
        direction=inDirection%4;
        xPos=inX-1;
        yPos=inY-1;
    }
    public int rotateClockwise()
    {
        direction=(direction+1)%4;
        return direction;
    }
    public int rotateCounterClockwise()
    {
        direction=(direction-1)%4;
        return direction;
    }
    public String[] getPrintout()
    {
        //Gives it out like this:
        //" • "
        //" F "
        //" - "
        
        
        String[] printout={"   "," "+piece+" ","   ",""};
        
        if(!piece.equals(" ")){
            switch(direction){
                case 0:
                    printout[0]=" • ";
                break;
                case 1:
                    printout[1]=" "+piece+"•";
                break;
                case 2:
                    printout[2]=" • ";
                break;
                case 3:
                    printout[1]="•"+piece+" ";
                break;
            }
        }
        return printout;
    }
}

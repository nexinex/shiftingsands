public class board {
    
    //construct the board one line at a time via the following method:
    //organize the board into 64 "tiles". Each one is a set of 4 strings, which have a 
    //   |
    //   |
    //   |
    //---+
    //don't do the | for right edge tiles, the - for bottom edge tile
    //after constructing itself, the tile adds itself to the massive array of strings.
    public tile[] tiles;
    public void printBoard(){
        String[] fullBoard=new String[32];
        for(int i=0;i<32;i++)
        {
            fullBoard[i]="";
        }
        //iterate through the whole board
        for(int y=0;y<8;y++)
        {
            for(int x=0;x<8;x++)
            {
                //make a blank tile. This will print out a completely empty 3x3 if it says this way
                //it's adding 1 to the x and y because tiles intake position is based on human coordinates
                tile curTile=new tile(" ",2,x+1,y+1);
                for(int i=0;i<tiles.length;i++)
                {
                    //find our tile by checking all tile's positions
                    //slow but who cares
                    if(tiles[i].xPos==x&&tiles[i].yPos==y)
                    {
                        curTile=tiles[i];
                        break;
                    }
                }
                //get that printout
                String[] printout=curTile.getPrintout();
                //wrap it in the apropriate border
                if(x<7)
                {
                    if(y<7)
                    {
                        printout[0]+="|";
                        printout[1]+="|";
                        printout[2]+="|";
                        printout[3]+="---+";
                    }
                    else
                    {
                        printout[0]+="|";
                        printout[1]+="|";
                        printout[2]+="|";
                        printout[3]+="   |";
                    }
                }
                else
                {
                    if(y<7)
                    {
                        printout[0]+=" ";
                        printout[1]+=" ";
                        printout[2]+=" ";
                        printout[3]+="----";
                    }
                    else
                    {
                        printout[0]+=" ";
                        printout[1]+=" ";
                        printout[2]+=" ";
                        printout[3]+="    ";
                    }
                }
                for(int i=0;i<4;i++)
                {
                    //we multiply y by 4 because each y value has 4 rows
                    fullBoard[i+(y*4)]+=printout[i];
                }
                
            }
            //printing out the rows we've got
            for(int i=0;i<4;i++)
                {
                    //we multiply y by 4 because each y value has 4 rows
                    System.out.println(fullBoard[i+(y*4)]);
                }
        }
    }
    
}

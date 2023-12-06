# shiftingsands
Inspired by the hint of a game in a random webcomic--a java simulating version of it to help me test and improve it.
Very WIP, will improve it later to something functional
Designed to simulate shifting sands. 
Provides a board(8x8 grid), status info (notifies that the game is won or lost), and how many more turns till board turn
each segment of the board is a 3x3 tile which contains:
    letter that is piece identity
    directional indicator to show who owns it (pieces can be neutral by facing neither player)

board is therefore 32 characters tall and wide, with every 4th row being - and every 4th column being |(intersections are +)

The pieces are as follows:

At no time may a piece: go atop another piece, leave the board, send another piece off the board, or capture a piece


F=fool
    Can swap with any piece it sees (orthogonal or diagonal)

N=Noble
    can move one space diagonally
    can also turn adjacent pieces 90 degrees in either direction

K=Knight
    can move like a rook
    The piece infront of it (opposite its indicator) cannot move (but can be moved by other pieces)

S=Scullary maid
    can move one space orthogonally
    can push any number of pieces this way

A=Ambassador
    can jump over adjacent pieces as long as there is an empty space on the other side
        doing so turns that piece 90 degrees counterclockwise
    can continue to jump, but they cannot jump back the way they just came (can't jump forward then back, but forward then right then diag left for example can let them end up the same spot)

M=Mage
    can "see" 2 tiles out, diagonal and orthogonal, can't see through pieces
    Can rotate itself 90 degrees around any piece it sees, being placed where that would put it. if they're looking orthognally at something two tiles right, they can rotate to being two tiles above or below
    can rotate other pieces about itself the same way

T=Thespian
    can move like a (chess)knight
    cannot move two turns in a row
    has two "conversions" that you can choose to spend, when it moves. You can spend them before or after
        each conversion can be spent seperately, but cannot be spent on the same thing
        each one turns it 90 degrees in the direction of your choosing
        it *must* move to do these conversions
        It's allowed to do this even when blocked by a knight, if it converts the knight away.
        it's not allowed to turn the knight to block its own movement before doing its jump

A player may move a fool they control for free at the start of their turn, or 
they may move one of their pieces one space towards an allied piece
they may also choose to do neither

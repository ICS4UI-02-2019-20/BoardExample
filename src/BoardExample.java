
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lamon
 */
public class BoardExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a board
        Board board = new Board(12, 12);
        // put a message at the bottom of the board
        board.displayMessage("Click me");
        // put down a peg row 2 column 5
        board.putPeg(Color.BLUE, 2, 5);

        // remove a peg
        board.removePeg(2, 5);

        while (true) {
            // wait for a click
            Coordinate click = board.getClick();
            // do something with the click
            int clickRow = click.getRow();
            int clickCol = click.getCol();
            board.putPeg(Color.yellow, clickRow, clickCol);
        }
    }

}

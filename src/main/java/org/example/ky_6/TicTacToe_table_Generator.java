package org.example.ky_6;

// https://www.codewars.com/kata/5b817c2a0ce070ace8002be0
public class TicTacToe_table_Generator {
    static public String displayBoard(final char[] board, int width) {
        StringBuilder sb = new StringBuilder();
        String sep = "-".repeat(4 * width - 1);
        for(int i=0; i< board.length/width; i++){
            sb.append(displayRow(board, i * width, width));
            if(i ==  board.length/width - 1)
                break;
            sb.append("\n" + sep + "\n");
        }
        return sb.toString();
    }

    private static String displayRow(final char[] board, int start, int width){
        StringBuilder sb = new StringBuilder();
        for(int i = start ; i < start + width; i++){
            sb.append(" "+board[i] + " |");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}

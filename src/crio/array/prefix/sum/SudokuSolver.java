package crio.array.prefix.sum;

import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
//                char r = board[i][j];
//                char c = board[j][i];
                if(board[i][j] != '.' && !hs.add("at r "+ i + "= " + board[i][j])) return false;
                if(board[j][i] != '.' && !hs.add("at c " +i + "= " + board[j][i])) return false;
                if(board[i][j] != '.' && !hs.add("at r =" +(i/3) + "c = " +(j/3) +"board =" + board[i][j]))return false;
//                System.out.print(board[j][i]+"  ");
            }
//            System.out.println();
        }
        return true;
    }
}
public class SudokuSolver {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
//        for(int i = 0; i < 9; i++){
//            for(int j = 0; j < 9; j++){
////                char r = board[i][j];
////                char c = board[j][i];
////                if(board[i][j] != '.' && !hsr.add("at r "+ i + "= " + board[i][j])) return false;
////                if(board[i][j] != '.' && !hsc.add("at c " +i + "= " + board[j][i])) return false;
//                System.out.print(board[i][j]+"  ");
//            }
//            System.out.println();
//        }
//        System.out.println("/nSecond/n");
        System.out.println(s.isValidSudoku(board));;
    }
}

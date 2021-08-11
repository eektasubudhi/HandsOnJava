package com.prac.dynamicProgramming;

public class WordSearch {
    int ROW = 0, COL = 0;

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};
        String word = "ABCCFS";
        WordSearch obj = new WordSearch();
        boolean res = obj.findWord(board, word);
        System.out.println(res);
    }
    public boolean findWord(char[][] board, String word){
        this.ROW = board.length;
        this.COL = board[0].length;
        boolean visited[][] = new boolean [board.length][board[0].length];
        for(int i = 0; i < ROW; i++){
            for (int j = 0; j < COL; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backTrack(board, visited, i, j, word, 0)) return true;
                }
            }
        }
        return false;
    }
    public boolean backTrack(char[][] board, boolean[][] visited, int row, int col, String word, int index){
        if(index >= word.length()) return true;
        if(row < 0 || row == this.ROW || col < 0 || col == this.COL
                || board[row][col] != word.charAt(index) || visited[row][col]){
            return false;
        }
        visited[row][col] = true;
        /*
        if (search(row-1, col,board, visited, word, currentLetterIndex+1) ||
        search(row, col-1,board, visited, word,currentLetterIndex+1) ||
        search(row+1, col,board, visited, word,currentLetterIndex+1) ||
        search(row, col+1,board, visited, word,currentLetterIndex+1)){
          return true;
        }
         */
        int[] rowOffset = {0, 1, 0, -1};
        int[] colOffset = {1, 0, -1, 0};

        for(int d = 0; d < 4; d++) {
            if (backTrack(board, visited, row + rowOffset[d], col + colOffset[d], word,index + 1)){
                return true;
            }
        }
        visited[row][col] = false;
        return false;
    }
}

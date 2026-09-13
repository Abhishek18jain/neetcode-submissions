class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <String> db = new HashSet<>();

        for(int i = 0; i<9; i++){
            for(int j =0; j<9;j++){
                char input = board[i][j];
                if(input != '.'){
                    if(!db.add(input + "at row" + i) || !db.add(input + "at col" + j) || !db.add(input + "at box" + i/3 + j /3)){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}

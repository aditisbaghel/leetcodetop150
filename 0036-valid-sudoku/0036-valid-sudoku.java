class Solution {
    public boolean isValidSudoku(char[][] board) {
  Set<String> hset =new HashSet<>();
       for(int i=0;i<9;i++){
             
        for(int j=0;j<9;j++){
            if(board[i][j]!='.'){
            char result = board[i][j];
            int ib = Integer.parseInt(i+"");
            int jb = Integer.parseInt(j+"");
            if(hset.contains(result+"_ROW_"+i)|| hset.contains(result+"_GRID_"+ib/3+"_"+jb/3)||hset.contains(result+"_COLUMN_"+j)){
                return false;
            }
             // Add the unique identifiers to the HashSet
                    hset.add(result+"_ROW_"+i);
                    hset.add(result+"_GRID_"+ib/3+"_"+jb/3);
                    hset.add(result+"_COLUMN_"+j);}
        }
       }
       return true;
    }
}
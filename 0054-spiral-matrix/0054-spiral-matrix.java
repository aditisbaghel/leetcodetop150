class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //direction 0 1 2 3
        int dir = 0; 
        //left pointer right pointer top bottom 
        int left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1;
        List<Integer> ls = new ArrayList<>();
        while(left<=right && top<=bottom){
            if(dir==0){
            for(int i=left;i<=right;i++){
               ls.add(matrix[top][i]);
            }
             top++;
           
            }
            if(dir==1){
                for(int i=top;i<=bottom;i++){
               ls.add(matrix[i][right]);
            }
                right--;
             
            }
            if(dir==2){
                for(int i=right;i>=left;i--){
                    
               ls.add(matrix[bottom][i]);
            }
                bottom--;
            }
            if(dir==3){
                for(int i=bottom;i>=top;i--){
               ls.add(matrix[i][left]);
            }
                left++;
                // dir++;
            }
            dir=(dir+1)%4;
        }
        return ls;
    }
}
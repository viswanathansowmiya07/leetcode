class Solution {
    public void setZeroes(int[][] matrix) {
        
       Map<Integer,Integer> row = new HashMap<>();
       Map<Integer,Integer> column = new HashMap<>();

       int rowLength = matrix.length;
       int columLength = matrix[0].length;

       for(int i=0;i<rowLength;i++){
        for(int j =0; j<columLength;j++){
            if(matrix[i][j]==0){
                row.put(i,1);
                column.put(j,1);
            }
        }
       }

       for(int i =0;i<rowLength;i++){
        for(int j=0;j<columLength;j++){
            if((row.containsKey(i))||(column.containsKey(j))){
                matrix[i][j]=0;
            }
        }
       }
    }
}  

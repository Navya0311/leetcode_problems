class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int columnLen =  matrix[0].length;
        int minColIndex = 0;
        int maxColIndex = columnLen - 1;
        //find row 
        int minRowPtr = 0;
        int maxRowPtr = rowLen -1;
        int requiredRow = 0;
        
        while (minRowPtr <= maxRowPtr ){
            int midRow = (minRowPtr + maxRowPtr) /2;
            //return if lies on ends
            if (matrix[midRow][minColIndex] == target || matrix[midRow][maxColIndex] == target ){
                return true;
            }
            //select row if element is present in this particular row
            if (matrix[midRow][minColIndex] < target && matrix[midRow][maxColIndex] > target  ){
                return binarySearchOnColumn(minColIndex,maxColIndex,midRow, matrix ,target );
            }
            if (target < matrix[midRow][minColIndex] ){
                maxRowPtr = midRow - 1;
            }

            if (target > matrix[midRow][maxColIndex] ){
                minRowPtr = midRow + 1;
            }
        }
        return false;
    }

    boolean binarySearchOnColumn(int minCol, int maxCol, int rowIdx, int[][] matrix, int target){

        int low = minCol ;
        int high = maxCol;
        while (low <= high){
            int mid = (low + high)/2;
            if (matrix[rowIdx][mid] == target ){
                return true;
            }
            if (matrix[rowIdx][mid] < target){
                low = mid + 1;
            }
            if (matrix[rowIdx][mid] > target ){
                high = mid - 1;
            }
        }

        return false;


    }
}
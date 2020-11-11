package com.learn.ds.examples;

public class MatrixPossiblePathExample1 {

    public static void main(String[] args) {
        System.out.println(possiblePath2(4, 4));
    }

    //Possible path solution with recursion
//    public static int possiblePath(int row, int col){
//        if(row ==1 || col == 1){
//            return 1;
//        }
//        return possiblePath(row-1,col) + possiblePath(row, col-1);
//    }

    //Possible path solution with memoization

    public static int possiblePath2(int row, int col) {
        int[][] count = new int[row][col];
        for (int i = 0; i < row; i++) {
            count[i][0] = 1;
        }

        for (int j = 0; j < col; j++) {
            count[0][j] = 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                count[i][j] = count[i - 1][j] + count[i][j - 1];
            }
        }

        return count[row - 1][col - 1];

    }


    //Possible path with obstacle
/*    public static int posstiblePathWithObstacle(int row, int col){
        int[][] count = new int[row][col];
        for(int i = 0; i < row; i++){
//            if(count[i][0] )
        }
    }
}*/

}

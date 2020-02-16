package kmin;

class Solution {
    public static void kthSmallest(int[][] matrix, int k) {
        int x=0, y=0, z=0;
        for(int i=0; i<k-1; i++){
            if(matrix[0][x] > matrix[1][y] && matrix[0][x] > matrix[2][z] && x<matrix[0].length - 1){
                x++;
            }else if(matrix[1][y] > matrix[0][x] && matrix[1][y] > matrix[2][z] && y<matrix[0].length - 1){
                y++;
            }else if(matrix[2][z] > matrix[0][x] && matrix[2][z] > matrix[1][y] && z<matrix[0].length - 1){
                z++;
            }
            System.out.println(x + " " + y + " " + z + " ");
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,  5,  9},{10, 11, 13},{12, 13, 15}};
        int k = 8;
        kthSmallest(matrix, k);
    }
}
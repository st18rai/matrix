import java.util.Arrays;

class Matrix {
    public static void main(String args[]){
        int [][] matr = createMatrix();
        printMatrix(matr);
        printMatrix(createMirror(matr));
    }
    public static int rnd(int min, int max)
	{
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}

    public static int matrixSize(){
        return rnd(3,9);
    }
    
    public static int matrixNumbers(){
        return rnd(10,99);
    }
    
    public static int[][] createMatrix(){
        int size = matrixSize(); 
        
        int[][] matrix = new int [size][size];
        
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - m; j++) {
                 matrix[i][j] = matrixNumbers();
            }
            m++;
        }
  
        return matrix;
    }
    
    public static void printMatrix(int matrix [][]){
        int[][] res = matrix;
     
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                if (res[i][j] != 0){
                    System.out.print(res[i][j] + " ");
                } else
                    System.out.print("   ");
            }
        System.out.println();
        }
    }
    
    public static int[][] createMirror(int matrix [][]){
        int[][] tempMatrix = matrix;
        int[][] mirror = new int[tempMatrix.length][tempMatrix.length];
        for (int i = 0; i < tempMatrix.length; i++) {
            for (int j = 0; j < tempMatrix.length; j++) {
                mirror[i][j] = tempMatrix[tempMatrix.length - j - 1][tempMatrix.length - i - 1];
            }
        }
        return mirror;
    }
   
}
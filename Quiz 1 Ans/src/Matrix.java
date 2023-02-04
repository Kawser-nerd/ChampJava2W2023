public class Matrix {
    private int [][] array2D;
    private int rows;
    private int cols;
    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
    }
    public void setter(int [][] Temparray2D){
        this.array2D = new int[this.rows][this.cols];
        for (int row = 0; row < array2D.length; row++){
            for(int col = 0; col < array2D[row].length; col++){
                this.array2D[row][col] = Temparray2D[row][col];
            }
        }
    }
    public int[][] getter(){
        return this.array2D;
    }
    public void printMatrix()
    {
        for(int row = 0; row < array2D.length; row++){
            for(int col = 0; col < array2D[row].length; col++){
                System.out.print(this.array2D[row][col]);
                System.out.print(" ");
            }
            System.out.print('\n');
        }
    }
}
import java.util.Random;

public class driver {
    public static void main(String []args){
        Random random = new Random();
        Matrix matrix = new Matrix(3,4);
        int[][] tempArray = new int[3][4];

        for(int row = 0; row < 3; row++){
            for (int col = 0; col < 4; col++){
                tempArray[row][col] = random.nextInt(9);
            }
        }

        matrix.setter(tempArray);
        matrix.printMatrix();
    }
}

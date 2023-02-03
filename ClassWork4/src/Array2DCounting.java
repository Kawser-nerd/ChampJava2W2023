import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array2DCounting {
    private int[][] numbers = new int[6][2];

    private int[][] initialization(){
        for(int i = 0; i < this.numbers.length; i++){
            for(int j = 0; j < this.numbers[i].length; j++){
                this.numbers[i][j] = -10;
            }
        }
        return this.numbers;
    }

    public int[][] readFile(String fileName){
        initialization();
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                int tempValue = Integer.parseInt(sc.next());
                for (int i = 0; i < this.numbers.length; i++){
                    if(this.numbers[i][0] == tempValue){
                        this.numbers[i][1]++;
                        break;
                    }
                    else if(this.numbers[i][0] == -10){
                        this.numbers[i][0] = tempValue;
                        this.numbers[i][1] = 1;
                        break;
                    }
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return this.numbers;
    }
    public void writeFile(String fileName){
        try {
            File file = new File(fileName);
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.println();
            for(int i = 0; i < this.numbers.length; i++){
                pw.println(this.numbers[i][0] + " -> " + this.numbers[i][1]);
            }
            pw.flush();
            pw.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

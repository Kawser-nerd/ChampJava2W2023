import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFile {
    private int noof10s = 0;
    private int noof12s = 0;
    private int noof14s = 0;
    private int noof16s = 0;
    private int[] numbers = new int[15];

    public int[] fileRead(String fileName){
        try {
            File file = new File(fileName); // This will open the file in read mode
            Scanner sc = new Scanner(file); // To Read the File, we need to pass them inside scannner constructor.
            int arrayCounter = 0;
            while (sc.hasNext()){
                this.numbers[arrayCounter] = Integer.parseInt(sc.next()); // We could use nextInt(), but this will got to new line. To solve that problem,
                                                                        // I used .next(), which will take only the contents in between two spaces in the text file.
            }
            sc.close();

        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return this.numbers;
    }

    public void numberAppearanceCounts(){
        for (int i = 0; i < this.numbers.length; i++){
            if(this.numbers[i] == 10)
                noof10s++;
            else if(this.numbers[i] == 12)
                noof12s++;
            else if(this.numbers[i] == 14)
                noof14s++;
            else if(this.numbers[i] == 16)
                noof16s++;
        }
    }

    public void writeInFile(String fileName){
        // I am going to open the same file from where I got the data. So, I am going to use it in Append mode to write back the data in the file
        File file = new File(fileName);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName, true)); // PrintWriter will write contents in the File. FileWriter will open the file in append mode if you pass true as parameter.
            pw.println();
            pw.println("10 -> " + this.noof10s);
            pw.println("12 -> " + this.noof12s);
            pw.println("14 -> " + this.noof14s);
            pw.println("16 -> " + this.noof16s);

            pw.flush();
            pw.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

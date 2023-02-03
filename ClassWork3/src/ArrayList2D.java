import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    private ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
    private boolean findNew = true;

    public ArrayList<ArrayList<Integer>> readFile(String fileName){
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                int value = Integer.parseInt(sc.next());
                for (int i=0; i < this.numbers.size(); i++){
                    if(this.numbers.get(i).contains(value)){
                        this.numbers.get(i).add(value);
                        this.findNew = false;
                    }
                }
                if(this.findNew){
                    this.numbers.add(new ArrayList<Integer>());
                    this.numbers.get(this.numbers.size() - 1).add(value);
                }
                this.findNew = true;
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return this.numbers;
    }

    public void writeFile(String fileName){
        try{
            File file = new File(fileName);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write("\n");
            for (int i = 0; i < this.numbers.size(); i++){
                bw.write(this.numbers.get(i).get(0).toString() + " -> " + this.numbers.get(i).size() + "\n");
            }
            bw.flush();
            bw.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

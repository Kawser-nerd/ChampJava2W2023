import java.io.*;
import java.util.ArrayList;

public class ArrayListNumCount {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private ArrayList<Integer> numOf10s = new ArrayList<Integer>();
    private ArrayList<Integer> numOf12s = new ArrayList<Integer>();
    private ArrayList<Integer> numOf14s = new ArrayList<Integer>();
    private ArrayList<Integer> numOf16s = new ArrayList<Integer>();

    public ArrayList<Integer> readFile(String fileName){
        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String lines;
            while ((lines = br.readLine())!=null){
                String []tempArrs = lines.split(" ");
                for (int i = 0; i < tempArrs.length; i++){
                    this.numbers.add(Integer.parseInt(tempArrs[i]));
                }
            }
            br.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return this.numbers;
    }

    public void numbersCount(){
        for (int i = 0; i < this.numbers.size(); i++){
            if(this.numbers.get(i) == 10)
                this.numOf10s.add(10);
            else if(this.numbers.get(i) == 12)
                this.numOf12s.add(12);
            else if(this.numbers.get(i) == 14)
                this.numOf14s.add(14);
            else if(this.numbers.get(i) == 16)
                this.numOf16s.add(16);
        }
    }

    public void writeFile(String fileName){
        try {
            File file = new File(fileName);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("\n");
            bw.write("10 -> "+ this.numOf10s.size() + "\n");
            bw.write("12 -> "+ this.numOf12s.size() + "\n");
            bw.write("14 -> "+ this.numOf14s.size() + "\n");
            bw.write("16 -> "+ this.numOf16s.size() + "\n");
            bw.flush();
            bw.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

public class Driver {
    public static void main(String []args){
        String fileName = "dataText.txt";
        Array2DCounting arc = new Array2DCounting();
        arc.readFile(fileName);
        arc.writeFile(fileName);
    }
}

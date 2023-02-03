public class Driver {
    public static void main(String []args){
        String fileName = "dataText.txt";
        ArrayList1D(fileName);
        fileName = "dataText2.txt";
        ArrayList2D(fileName);
    }
    private static void ArrayList1D(String fileName){
        ArrayListNumCount arnc = new ArrayListNumCount();
        arnc.readFile(fileName);
        arnc.numbersCount();
        arnc.writeFile(fileName);
    }

    private static void ArrayList2D(String fileName){
        ArrayList2D al2d = new ArrayList2D();
        al2d.readFile(fileName);
        al2d.writeFile(fileName);
    }
}

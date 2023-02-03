public class driver {
    public static void main(String []agrs)
    {
        TextFile tf = new TextFile();
        String fileName = "data.txt";
        tf.fileRead(fileName);
        tf.numberAppearanceCounts();
        tf.writeInFile(fileName);

    }
}

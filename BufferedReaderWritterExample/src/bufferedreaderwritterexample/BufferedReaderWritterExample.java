/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedreaderwritterexample;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author knafi
 */
public class BufferedReaderWritterExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // This step is done to create a file memory in your program
       //Inside the File() default constructor, we have to pass the filename with path
        String line;
       String arr[]; // Create an uninitalized array
       int[] number = new int[5];
       try{ 
       File file = new File("testing_numbers.txt");
       /*
       Here, to open/read a file in BufferedReader, you have to open the file in read
       mode with help of FileReader. FileReader class will open the file, define the 
       type of the file and then transfer it to Hexadecimal number.
       
       BufferedReader just read those Hexadecimal/machine readable number to the cache
       memory, or we can say, to buffer memory.
       */ 
       BufferedReader br = new BufferedReader(new FileReader(file));
       // Until this line, we are just opening the file in BufferedReader mode.
       // BufferedReader always read the file context in String
       // ReadLine() method always read the current line and then move to next line
       // To find the end of file, we need to look for null in the file. null means
       // nothing is present in that line, or empty line.
      
       // ReadLine method not only read the line in file but also it moves to the new
       // line. To hold back the previous line, we have to use a variable. Here, line
       // variable is holing the string/line it is reading from file.
       while((line = br.readLine())!= null){
           // ReadLine() methods reads everything from the text file as String
           // To get the numbers seperated, we have to split the input String to space
           // Space will seperate the input to different numbers.
           arr = line.split(" ");
           // In the following block, we are going to access each of the the index 
           // of our splitted array and going to write it back to our integer number
           // array. To convert each String array element to number, we have to use Integer.parseInt()
           // method. This will transfer the string to its realted number.
           for(int i = 0; i< arr.length; i++)
               number[i] = Integer.parseInt(arr[i]);
       }
       
       for(int i = 0; i < number.length; i++)
           System.out.println(number[i]);
       
       }
       catch(IOException ex){
           System.out.println(ex.getMessage());
           
       }
       
       
       // BufferedWritter //
       // We have to create the file//
       // We have to make the file writable
       // We have to Buffered the writing values.
       
       try
       {
           // The File class helps us to introduce the file in the program
           File file = new File("testingWrite.txt");
           // BufferedWritter actually transfer everthing from Buffer memory to machine readable format
           // Filewriter write the machine readable format to harddrive file
           BufferedWriter bw = new BufferedWriter(new FileWriter(file));
           
           for(int i = 0; i<number.length; i++){
               // bufferedWritter object bw will write everything as a string in file
               // to covert the integer value to String, we need to use String.valueOf method
               // to convert the integer to String value
               // this line will write a single value to the file
               bw.write(String.valueOf(number[i]));
               // this line will add a new string after what you have written in the previous line
               bw.write(" ~ ");
           }
           // In bufferedWritter, you have to flush the buffer memory so that the present buffer information
           //got cleaned
           // Without flash, the data will still be in the program memory/ processor cache memory
           bw.flush();
           // Ater flushing, we have to close the file. Otherwise, nothing will be written
           // in the file. It will be empty.
           bw.close();   
       }
       catch (IOException ex){
           System.out.println(ex.getMessage());
       }
    }
    
}

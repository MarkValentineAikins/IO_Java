import javax.swing.JOptionPane;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

//        String Filename;
//        Filename = JOptionPane.showInputDialog("Enter file name");
//        PrintWriter outputFile = new PrintWriter("dataLine.txt");
//        outputFile.println("Filename");
//        System.out.println("Hello world!");
//        PrintWriter outputFile;
//
//        String file;
//        file = JOptionPane.showInputDialog("Enter file name");
//        PrintWriter printWriter;
//        printWriter = new PrintWriter(file);
//        printWriter.println("hello");
//            printWriter.close();

//            PrintWriter writeMe = new PrintWriter("newFIle.txt");
//            writeMe.println("Just writing some text to print to your file ");
//        String text;
//        text = JOptionPane.showInputDialog("Enter some text");
//        PrintWriter writer = new PrintWriter(text);
//        writer.println("hello! Writing some text to print to your file ");
//        writer.println("This will write as many lines as you want to print");
//        writer.println(2626);
//        writer.close();

        String Name = "Mark valentine Aikins";
        int age = 37;
        String Genders = "Male";

        PrintWriter writer = new PrintWriter("mySelf.txt");
        writer.println("My name is " + Name +" ");
        writer.println("I am " + age + "years old");
        writer.println("I am " + Genders +" by gender composition");
        writer.close();



    }
}
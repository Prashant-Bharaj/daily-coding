package crio.coreJava1.prework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

/**
 * requirement:
 * Write a Java Program to Count the Number of Lines, Words, Characters, and Paragraphs in a Text File
 * Write the result in output.txt in the following format.
 * Total Lines Count - 10
 * Total Words Count - 10
 * Total Cha\racters Count - 10
 * Total Paragraphs Count - 10
 * */
public class CountLines {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try{
            bufferedReader = Files.newBufferedReader(Paths.get("C:\\Users\\prash\\OneDrive\\Documents\\GitHub\\daily coding\\src\\crio\\coreJava1\\prework\\input.txt"), StandardCharsets.UTF_8);
            String line;
            int countLines=0, countWords=0, countChar=0, countParagraph = 1;
            while((line = bufferedReader.readLine()) != null){
                countLines++;
                countChar += line.length();
                countWords += line.split(" ").length;
                if(line.equals("")) countParagraph++;
            }

            bufferedWriter = Files.newBufferedWriter(Paths.get("C:\\Users\\prash\\OneDrive\\Documents\\GitHub\\daily coding\\src\\crio\\coreJava1\\prework\\output.txt"), StandardCharsets.UTF_8,CREATE,WRITE);
            bufferedWriter.write("Total lines Count - " + countLines+"\n");
            bufferedWriter.write("Total words Count - " + countWords+"\n");
            bufferedWriter.write("Total character Count - " + countChar+"\n");

            bufferedWriter.write("Total Paragraph Count - " + countParagraph+"\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

                try {
                    bufferedWriter.close();
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }

    }
}

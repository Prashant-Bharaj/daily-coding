package crio.coreJava1.prework;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Features of OpenCSV
 * Any number of values per line.
 * Ignores commas in quoted elements.
 * Handles entries that span multiple lines.
 * */
public class CalculateTotalPricePerItem {
    public static void main(String[] args) {
        CSVReader reader = null;
        CSVWriter writer = null;
        try{
            reader = new CSVReader( new FileReader("C:\\Users\\prash\\OneDrive\\Documents\\GitHub\\daily coding\\src\\crio\\coreJava1\\prework\\sample.csv"));

            List<String[]> list = new ArrayList<>();
            list = reader.readAll();

            writer = new CSVWriter(new FileWriter("C:\\Users\\prash\\OneDrive\\Documents\\GitHub\\daily coding\\src\\crio\\coreJava1\\prework\\output.csv"));

            for(String[] curr : list){
                curr = Arrays.copyOf(curr, curr.length+1);
                curr[curr.length-1] = Integer.parseInt(curr[curr.length-2])*Integer.parseInt(curr[curr.length-3])+"";
                writer.writeNext(curr);
            }
        } catch (CsvException | IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert reader != null;
                reader.close();
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

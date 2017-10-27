package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import view.HistogramDisplay;
import model.Histogram;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename="emails.txt";
        List<String> lista=MailListReader.read(filename);
        Histogram<String> histogram=MailHistogramBuilder.build(lista);
        new HistogramDisplay(histogram).execute();
    }
}
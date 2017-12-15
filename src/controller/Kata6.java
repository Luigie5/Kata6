package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import view.HistogramDisplay;
import model.Histogram;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata6 {
    List<String> lista;
    Histogram<String> histogram;
    public static void main(String[] args) throws FileNotFoundException, IOException {
        new Kata6().execute();
    }
    private void execute() throws FileNotFoundException, IOException{
        input();
        process();
        output();
    }
    private void input() throws FileNotFoundException, IOException{
        String filename="emails.txt";
        lista=MailListReader.read(filename);
    }
    private void process(){
        histogram=MailHistogramBuilder.build(lista);
    }
    private void output(){
        new HistogramDisplay(histogram).execute();
    }
}
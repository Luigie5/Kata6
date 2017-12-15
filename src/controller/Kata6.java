package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import view.HistogramDisplay;
import model.Histogram;
import model.Mail;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata6 {
    List<String> lista;
    Histogram<String> histogram;
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename="emails.txt";
        List<Mail> listMail= MailListReader.read(filename);
        MailHistogramBuilder<Mail> builder =new MailHistogramBuilder<>(listMail);
        Histogram<String> domains = builder.build(new Attribute<Mail,String>(){	
            @Override
            public String get(Mail item) {	
                return item.getMail().split("@")[1];	
            }	
	});	
        new HistogramDisplay(domains, "Dominios").execute();	
        Histogram<Character> letters = builder.build(new Attribute<Mail,Character>(){	
            @Override
            public Character get(Mail item){	
                return item.getMail().charAt(0);	
            }	
	});	
	new HistogramDisplay (letters,"Primer Caracter").execute();
        //new Kata6().execute();
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
        //histogram=MailHistogramBuilder.build(lista);
    }
    private void output(){
        //new HistogramDisplay(histogram).execute();
    }
}
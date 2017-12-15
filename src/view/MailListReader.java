package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;


public class MailListReader {
    public static List read(String file) throws FileNotFoundException, IOException{
        List<Mail> lista =new ArrayList<>();
        BufferedReader reader =new BufferedReader(new FileReader(new File(file)));
        String mail;
        Integer id=0;
        while((mail=reader.readLine()) != null){
            if(mail.contains("@")){
                lista.add(new Mail(id,mail));
            }
        }
        reader.close();
        return lista;
    }
}

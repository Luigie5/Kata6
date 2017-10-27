package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MailListReader {
    public static List<String> read(String file) throws FileNotFoundException, IOException{
        List<String> lista =new ArrayList<>();
        BufferedReader reader =new BufferedReader(new FileReader(new File(file)));
        String mail;
        while((mail=reader.readLine()) != null){
            if(mail.contains("@")){
                lista.add(mail);
            }
        }
        reader.close();
        return lista;
    }
}

package kata5p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MailListReader {
    
    public List<String> read(String fileName){
        
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            List<String> mailList = new LinkedList<>();
            String sCurrentLine;
            
            while ((sCurrentLine = br.readLine()) != null){
                if(sCurrentLine.contains("@")){
                    mailList.add(sCurrentLine);
                }
            }
            
            return mailList;
            
        }catch (IOException e) {
            return null;
        }
    }
}

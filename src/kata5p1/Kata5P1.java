package kata5p1;

import java.util.List;

public class Kata5P1 {

    private static String fileName = null;
    private static MailListReader mLR = new MailListReader();
    private static InsertarDatosTabla idt = new InsertarDatosTabla();
    
    public static void main(String[] args) {
        
        fileName = "src\\email.txt";
        List<String> mailList = mLR.read(fileName);
        
        for(String email : mailList){
            idt.insert(email);
        }
    }
}

import java.util.Base64;

import javax.crypto.SecretKey;
import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args){
        CryptoImpl crypto = new CryptoImpl();
        SecretKey key = crypto.genKey("AES",128);
        JFileChooser jfc = new JFileChooser();
        int option = jfc.showSaveDialog(jfc);
        if(JFileChooser.APPROVE_OPTION==option){
            String filePath = jfc.getSelectedFile().getAbsolutePath();
            crypto.saveKey(key, filePath);
        }
        
        crypto.saveKey(key, "mykey.khd");
        // String encoding = Base64.getEncoder().encodeToString(key.getEncoded());
        // System.out.println(encoding);
    } 
}

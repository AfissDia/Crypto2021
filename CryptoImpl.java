import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CryptoImpl implements Icrypto{

    @Override
    public SecretKey genKey(String algo, int keySize) {
        try {
            KeyGenerator gen = KeyGenerator.getInstance(algo);
            gen.init(keySize);
            SecretKey key = gen.generateKey();
            return key;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public String saveKey(SecretKey key, String filePath) {
       try {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream obj = new ObjectOutputStream(fos);
        obj.writeObject(key);
        obj.close();
        fos.close();
        return filePath;
       } catch (Exception e) {
           e.printStackTrace();
       }
        return null;
    }

    @Override
    public SecretKey getKey(String filePath) {
        
        return null;
    }
    
}

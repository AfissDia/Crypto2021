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
       
        
        return null;
    }

    @Override
    public SecretKey getKey(String filePath) {
        
        return null;
    }
    
}

import javax.crypto.SecretKey;

public class Main {
    public static void main(String[] args){
        CryptoImpl crypto = new CryptoImpl();
        SecretKey key = crypto.genKey("AES",128);
        System.out.println(key.getAlgorithm());
        System.out.println(key.getEncoded().length*8);
    }
    
}

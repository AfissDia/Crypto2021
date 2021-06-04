import javax.crypto.*;

public interface Icrypto{
    /**
     * cette methode permet de generer une cle
     * @param algo: L'algorithme de chiffrement(ex:'AES', 'DES')
     * @param keySize: La taille de la cle (ex: 128 ou 256)
     * @return La cle generee
     */
    public SecretKey genKey(String algo, int keySize);
   /**
    * Cette methode permet de stocke la cle
    * @param key
    * @param filePath
    * @return
    */
    public String saveKey(SecretKey key, String filePath);
    /**
     * Cette methode permet de recuperer le chemin
     * @param filePath
     * @return
     */
    public SecretKey getKey(String filePath);
}

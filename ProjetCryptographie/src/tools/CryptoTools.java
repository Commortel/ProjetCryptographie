package tools;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Thibaut
 */
public class CryptoTools 
{
    /// <summary>
    /// Calcul le hash SHA1 de la chaîne spécifiée
    /// </summary>
    /// <param name="str">Chaîne dont on cherche le hash SHA1</param>
    /// <returns>Hash SHA1 de la chaîne spécifiée</returns>
    public static String getSHA1(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(StringTools.getBytes(str), 0, str.length());
        return StringTools.getString(md.digest());
    }
    
    public static String getMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(StringTools.getBytes(str), 0, str.length());
        return StringTools.getString(md.digest());
    }

    public static String encrypt3DES(String str, String encrKey) throws Exception 
    {
    	final MessageDigest md = MessageDigest.getInstance("md5");
    	final byte[] digestOfPassword = md.digest(encrKey.getBytes("utf-8"));
    	final byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
    	for (int j = 0, k = 16; j < 8;)
    		keyBytes[k++] = keyBytes[j++];

    	final SecretKey key = new SecretKeySpec(keyBytes, "DESede");
    	final IvParameterSpec iv = new IvParameterSpec(new byte[8]);
    	final Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
    	cipher.init(Cipher.ENCRYPT_MODE, key, iv);

    	final byte[] plainTextBytes = str.getBytes("utf-8");
    	final byte[] cipherText = cipher.doFinal(plainTextBytes);

    	return StringTools.getString(cipherText);
    }

    public static String decrypt3DES(byte[] message, String encrKey) throws Exception 
    {
    	final MessageDigest md = MessageDigest.getInstance("md5");
    	final byte[] digestOfPassword = md.digest(encrKey.getBytes("utf-8"));
    	final byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
    	for (int j = 0, k = 16; j < 8;)
    		keyBytes[k++] = keyBytes[j++];

    	final SecretKey key = new SecretKeySpec(keyBytes, "DESede");
    	final IvParameterSpec iv = new IvParameterSpec(new byte[8]);
    	final Cipher decipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
    	decipher.init(Cipher.DECRYPT_MODE, key, iv);

    	final byte[] plainText = decipher.doFinal(message);

    	return StringTools.getString(plainText);
    }
    
    public static String EncryptFile3DES(String file, String key)  throws Exception
    {
        // Lit l'article pour le décrypter
        //String fileContent = FileTools.ReadFile();

        // Retourne la chaine cryptée
        return CryptoTools.encrypt3DES(file, key);
    }

}

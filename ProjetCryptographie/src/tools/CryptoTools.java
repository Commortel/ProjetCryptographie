package tools;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static String getSHA1(String str)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(StringTools.getBytes(str), 0, str.length());
            return StringTools.getString(md.digest());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CryptoTools.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static String getMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(StringTools.getBytes(str), 0, str.length());
        return StringTools.getString(md.digest());
    }
        
    public static byte[] encrypt3DES(byte[] str, String encrKey)
    {
        try
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

            //final byte[] plainTextBytes = str.getBytes("utf-8");
            final byte[] cipherText = cipher.doFinal(str);

            return cipherText;
        }
        catch (Exception ex) 
        {
            Logger.getLogger(CryptoTools.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }

    public static String decrypt3DES(byte[] message, String encrKey)
    {
        try
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
        catch (Exception ex) 
        {
            Logger.getLogger(CryptoTools.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    
    public static void encryptFile3DES(NoteBookFile nf)
    {
        FileTools.WriteFile(encrypt3DES(nf.outputFormatFile(),nf.getKey()),nf.getName());
    }
    
    public static String decryptFile3DES(String file, String key)
    {
        return decrypt3DES(FileTools.ReadFile(file), key);
    }

}

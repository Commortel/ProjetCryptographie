package tools;

import java.util.HashMap;

/**
 * Skeleton File for Notebook data
 * @author Thibaut
 * 
 */
public class NoteBookFile 
{
    private String name;
    private String algorithmEncryption;
    private String password;
    private HashMap<String,String> data;

    public NoteBookFile() 
    {
        this.name = null;
        this.algorithmEncryption = null;
        this.password = null;
        this.data = new HashMap<>();
    }
    
    /**
     * 
     * @param name
     * @param algorithmEncryption
     * @param password
     * @param data
     */
    public NoteBookFile(String name, String algorithmEncryption, String password, HashMap<String,String> data) 
    {
        this.name = name;
        this.algorithmEncryption = algorithmEncryption;
        this.password = password;
        this.data = data;
    }

    /**
     * Returns a byte array after putting name, SHA-1(password) and algorithm in HashMap data
     * @return a byte array
     */
    public byte[] outputFormatFile()
    {
        //Head of file
        data.put(this.name, CryptoTools.getSHA1(this.password));
        data.put("algorithm",this.algorithmEncryption);
        
        return StringTools.convertHashMapToStringFormat(data);
    }
    
    /**
     * Returns encryption/decryption key
     * @return name + password
     */
    public String getKey()
    {
        return this.name+this.password;
    }

    /**
     * Returns the name
     * @return name
     */
    public String getName() {
        return this.name;
    }
         
    
}

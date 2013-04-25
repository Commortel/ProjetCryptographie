/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashMap;

/**
 *
 * @author Thibaut
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
    
    public NoteBookFile(String name, String algorithmEncryption, String password, HashMap<String,String> data) 
    {
        this.name = name;
        this.algorithmEncryption = algorithmEncryption;
        this.password = password;
        this.data = data;
    }

    public byte[] outputFormatFile()
    {
        //Head of file
        data.put(this.name, CryptoTools.getSHA1(this.password));
        data.put("algorithm",this.algorithmEncryption);
        
        return StringTools.convertHashMapToStringFormat(data);
    }
    
    public String getKey()
    {
        return this.name+this.password;
    }

    public String getName() {
        return this.name;
    }
         
    
}

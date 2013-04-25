/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thibaut
 */
public class StringTools 
{
    public static String getString(byte[] str)
    { 
        try { 
            return new String( str , "Cp1252" );
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(StringTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
 
    public static byte[] getBytes(String str)
    {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(StringTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static byte[] convertHashMapToStringFormat(HashMap<String,String> data)
    {
        String tmp = new String("");
        for(Entry<String, String> entry : data.entrySet()) 
            tmp += entry.getKey() + "~" + entry.getValue() + ";";
        return getBytes(tmp);
    }
    
    public static HashMap<String,String> convertStringToHashMapFormat(String data)
    {
        try
        {
            HashMap<String,String> listData = new HashMap<>();
            String[] tmp = data.split(";");

            for(String s : tmp)
            {
                String[] t = s.split("~");
                listData.put(t[0], t[1]);
            }
            return listData;
        }
        catch(Exception ex)
        {
            return new HashMap<>();
        }
    }
    
    public static String getNameWithoutExtension(String name)
    {
        return name.substring(0, name.length()-4);
    }
}

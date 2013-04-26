package tools;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * String function container
 * @author Thibaut
 */
public class StringTools 
{
    /**
     * Returns a string for a byte array
     * @param str - data
     * @return a string for a byte array
     */
    public static String getString(byte[] str)
    { 
        try { 
            return new String( str , "Cp1252" );
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(StringTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
 
    /**
     * Returns a byte array from a string, utf-8 encoding
     * @param str - data
     * @return a byte array
     */
    public static byte[] getBytes(String str)
    {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(StringTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    /**
     * Returns a byte array from an HashMap
     * @param data - data
     * @return a byte array
     */
    public static byte[] convertHashMapToStringFormat(HashMap<String,String> data)
    {
        String tmp = new String("");
        for(Entry<String, String> entry : data.entrySet()) 
            tmp += entry.getKey() + "~" + entry.getValue() + ";";
        return getBytes(tmp);
    }
    
    /**
     * Returns an HashMap from a string
     * @param data - data
     * @return a HashMap
     */
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
    
    /**
     * Returns an HashMap data from a google csv file format
     * @param csv - google csv 
     * @return an HashMap
     */
    public static HashMap<String,String> convertCsvStringToHashMapFormat(String csv)
    {
        HashMap<String,String> data = new HashMap<>();
        String[] tmp = csv.split(",");
        System.out.println(tmp.length);
        
        for(int i=30; i < tmp.length-28; i+=30)
        {
            data.put(tmp[i].trim(), tmp[i+28].trim());
            System.out.println("Name : " + tmp[i].trim() + " Mail : " + tmp[i+28].trim());
        }
        
        return data;
    }
    
    /**
     * Returns a filename without his extension
     * @param name - filename
     * @return filename without his extension
     */
    public static String getNameWithoutExtension(String name)
    {
        return name.substring(0, name.length()-4);
    }
}

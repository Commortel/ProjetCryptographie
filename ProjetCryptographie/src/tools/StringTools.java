/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.UnsupportedEncodingException;
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
}

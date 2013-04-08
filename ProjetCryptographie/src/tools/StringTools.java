/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author Thibaut
 */
public class StringTools 
{
    public static String getString(byte[] str)
    {
        StringBuilder buffer = new StringBuilder();

        for(byte b : str) 
        {
          buffer.append(Integer.toHexString(b));
          buffer.append(" ");
        }
          
        return buffer.toString(); 
    } 
 
    public static byte[] getBytes(String str) throws UnsupportedEncodingException
    {
        return str.getBytes("utf-8");
    }
}

package tools;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thibaut
 */
public class FileTools 
{   
    public static String folderPath = "Notebook/";

    public static void WriteFile(byte[] fileContent, String filePath)
    {
        FileOutputStream out = null;
        try 
        {
            out = new FileOutputStream(folderPath+filePath+".cry");
            out.write(fileContent);
        }
        catch (Exception ex) 
        { 
            Logger.getLogger(FileTools.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally 
        {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(FileTools.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }

    public static byte[] ReadFile(String filePath)
    {  
        try{ return Files.readAllBytes(Paths.get(filePath)); } 
        catch (IOException ex) { Logger.getLogger(FileTools.class.getName()).log(Level.SEVERE, null, ex); return null;}
    } 
}

package tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Thibaut
 */
public class FileTools 
{   
    public static String filePath = "C:\\Users\\Thibaut\\Downloads\\t.txt";
    /// <summary>
    /// Ecrit le texte spécifié dans un fichier
    /// </summary>
    /// <param name="filePath">Chemin du fichier à créer</param>
    /// <param name="fileContent">Text à écrire dans le fichier</param>
    public static void WriteFile(String fileContent) throws Exception
    {
        Writer out = new OutputStreamWriter(new FileOutputStream(filePath));
        try 
        {
          out.write(fileContent);
        }
        finally {
          out.close();
        }
    }

    /// <summary>
    /// Lit le fichier spécifié
    /// </summary>
    /// <param name="file">Fichier à lire</param>
    /// <returns>Contenu du fichier</returns>
    public static String ReadFile() throws FileNotFoundException
    {  
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(new FileInputStream(filePath));
        try {
          while (scanner.hasNextLine()){
            text.append(scanner.nextLine());
          }
        }
        finally{
          scanner.close();
        }
        return text.toString();
    }

    /// <summary>
    /// Génere un flux depuis une chaîne de caractères
    /// </summary>
    /// <param name="str">Chaîne représentant le contenu du flux à créer</param>
    /// <returns>Flux vers la chaîne spécifiée</returns>
    public static FileInputStream GenerateStreamFromString(String str)
    {
       /* MemoryStream stream = new MemoryStream();
        StreamWriter writer = new StreamWriter(stream);
        writer.Write(str);
        writer.Flush();
        stream.Position = 0;
        return stream;*/
        return null;
    }   
}

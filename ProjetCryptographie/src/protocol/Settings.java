/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import java.util.Properties;

/**
 *
 * @author Thibaut
 */
public abstract class Settings {
    
    public static boolean isEnscrypted = true;
    public static String encryption = "Salsa20";
    public static Properties p = new Properties();
    

    /**
     * @return the isEnscrypted
     */
    public boolean isIsEnscrypted() {
        return isEnscrypted;
    }

    /**
     * @param isEnscrypted the isEnscrypted to set
     */
    public void setIsEnscrypted(boolean isEnscrypted) {
        this.isEnscrypted = isEnscrypted;
    }

    /**
     * @return the encryption
     */
    public String getEncryption() {
        return encryption;
    }

    /**
     * @param encryption the encryption to set
     */
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }
    
    
}

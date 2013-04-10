/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

/**
 *
 * @author Thibaut
 */
public class Contact {
    
    private String phone, name, surname, description, imgPath, mail;
    
    public Contact(String phone, String name, String surname, String description, String imgPath, String mail)
    {
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.imgPath = imgPath;
        this.mail = mail;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the ImgPath
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * @param ImgPath the ImgPath to set
     */
    public void setImgPath(String ImgPath) {
        this.imgPath = ImgPath;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}

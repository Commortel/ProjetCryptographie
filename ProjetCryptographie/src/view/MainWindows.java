package view;

import java.io.IOException;
import java.security.Security;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import tools.CryptoTools;
import tools.FileTools;
import tools.NoteBookFile;
import tools.StringTools;

/**
 * Starting class of the project
 * @author Thibaut
 */
public class MainWindows extends javax.swing.JFrame 
{    
    public MainWindows() {
        Security.addProvider(new BouncyCastleProvider());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SaveDialogWithoutFile = new javax.swing.JDialog();
        LoginLabel = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        SaveButtonDialog = new javax.swing.JButton();
        CancelButtonDialog = new javax.swing.JButton();
        FileChooser = new javax.swing.JFileChooser();
        OpenDialog = new javax.swing.JDialog();
        OpenPasswordField = new javax.swing.JPasswordField();
        OpenPasswordLabel = new javax.swing.JLabel();
        OpenButtonDialog = new javax.swing.JButton();
        CancelButtonOpenDialog = new javax.swing.JButton();
        InfoDialog = new javax.swing.JDialog();
        InfoField = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        notebook1 = new view.Notebook();
        Menu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Quit = new javax.swing.JMenuItem();
        Option = new javax.swing.JMenu();
        EncreyptedFile = new javax.swing.JCheckBoxMenuItem();
        ContactMenu = new javax.swing.JMenu();
        addContact = new javax.swing.JMenuItem();
        deleteContact = new javax.swing.JMenuItem();
        ImportContact = new javax.swing.JMenuItem();

        SaveDialogWithoutFile.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        SaveDialogWithoutFile.setTitle("Notebook");
        SaveDialogWithoutFile.setAlwaysOnTop(true);
        SaveDialogWithoutFile.setMinimumSize(new java.awt.Dimension(270, 170));
        SaveDialogWithoutFile.setModal(true);

        LoginLabel.setText("Login");

        PasswordLabel.setText("Password");

        SaveButtonDialog.setText("Save");
        SaveButtonDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonDialogActionPerformed(evt);
            }
        });

        CancelButtonDialog.setText("Cancel");
        CancelButtonDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SaveDialogWithoutFileLayout = new javax.swing.GroupLayout(SaveDialogWithoutFile.getContentPane());
        SaveDialogWithoutFile.getContentPane().setLayout(SaveDialogWithoutFileLayout);
        SaveDialogWithoutFileLayout.setHorizontalGroup(
            SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaveDialogWithoutFileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SaveDialogWithoutFileLayout.createSequentialGroup()
                        .addGroup(SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginTextField)
                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                    .addGroup(SaveDialogWithoutFileLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(SaveButtonDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelButtonDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        SaveDialogWithoutFileLayout.setVerticalGroup(
            SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SaveDialogWithoutFileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SaveDialogWithoutFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButtonDialog)
                    .addComponent(CancelButtonDialog))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        FileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\Thibaut\\Documents\\GitHub\\ProjetCryptographie\\ProjetCryptographie\\Notebook"));

        OpenDialog.setAlwaysOnTop(true);
        OpenDialog.setMinimumSize(new java.awt.Dimension(270, 160));
        OpenDialog.setModal(true);

        OpenPasswordLabel.setText("Password");

        OpenButtonDialog.setText("Open");
        OpenButtonDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenButtonDialogActionPerformed(evt);
            }
        });

        CancelButtonOpenDialog.setText("Cancel");
        CancelButtonOpenDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonOpenDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OpenDialogLayout = new javax.swing.GroupLayout(OpenDialog.getContentPane());
        OpenDialog.getContentPane().setLayout(OpenDialogLayout);
        OpenDialogLayout.setHorizontalGroup(
            OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OpenDialogLayout.createSequentialGroup()
                        .addComponent(OpenPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OpenPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OpenDialogLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(OpenButtonDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CancelButtonOpenDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        OpenDialogLayout.setVerticalGroup(
            OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpenDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenPasswordLabel)
                    .addComponent(OpenPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OpenDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpenButtonDialog)
                    .addComponent(CancelButtonOpenDialog))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        InfoDialog.setTitle("Information");
        InfoDialog.setAlwaysOnTop(true);
        InfoDialog.setMinimumSize(new java.awt.Dimension(172, 80));
        InfoDialog.setModal(true);

        javax.swing.GroupLayout InfoDialogLayout = new javax.swing.GroupLayout(InfoDialog.getContentPane());
        InfoDialog.getContentPane().setLayout(InfoDialogLayout);
        InfoDialogLayout.setHorizontalGroup(
            InfoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoDialogLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(InfoField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(548, Short.MAX_VALUE))
        );
        InfoDialogLayout.setVerticalGroup(
            InfoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(InfoField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NoteBook");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(709, 554));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(notebook1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notebook1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        File.setMnemonic('F');
        File.setText("Fichier");

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        Quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        File.add(Quit);

        Menu.add(File);

        Option.setMnemonic('O');
        Option.setText("Option");

        EncreyptedFile.setSelected(true);
        EncreyptedFile.setText("EncryptedFile");
        Option.add(EncreyptedFile);

        Menu.add(Option);

        ContactMenu.setText("Contact");

        addContact.setText("Ajouter");
        addContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContactActionPerformed(evt);
            }
        });
        ContactMenu.add(addContact);

        deleteContact.setText("Supprimer");
        deleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContactActionPerformed(evt);
            }
        });
        ContactMenu.add(deleteContact);

        ImportContact.setText("Import");
        ImportContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportContactActionPerformed(evt);
            }
        });
        ContactMenu.add(ImportContact);

        Menu.add(ContactMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        this.FileChooser.setVisible(true);
        int returnVal = this.FileChooser.showOpenDialog(this);
        
        if (returnVal == FileChooser.APPROVE_OPTION) {
            this.OpenDialog.setVisible(true);     
        } else {
            System.out.println("Canceled");
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        this.Save.doClick();
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.Save.doClick();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if(this.notebook1.getIsFileChanged()) this.SaveDialogWithoutFile.setVisible(true);
    }//GEN-LAST:event_SaveActionPerformed

    private void addContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContactActionPerformed
        this.notebook1.addRow();
    }//GEN-LAST:event_addContactActionPerformed

    private void deleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContactActionPerformed
        this.notebook1.removeRow();
    }//GEN-LAST:event_deleteContactActionPerformed

    private void SaveButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonDialogActionPerformed
        CryptoTools.encryptFile3DES(
                new NoteBookFile(this.loginTextField.getText(),
                "3DES",
                new String(this.PasswordField.getPassword()),
                this.notebook1.getDataFromTable()));
        System.exit(0);
    }//GEN-LAST:event_SaveButtonDialogActionPerformed

    private void CancelButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonDialogActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelButtonDialogActionPerformed

    private void OpenButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenButtonDialogActionPerformed
        this.OpenDialog.setVisible(false);
        try {
            System.out.println(this.FileChooser.getSelectedFile().getName());
            String name = StringTools.getNameWithoutExtension(this.FileChooser.getSelectedFile().getName());
            HashMap<String,String> tmp = StringTools.convertStringToHashMapFormat(
                    CryptoTools.decryptFile3DES(this.FileChooser.getSelectedFile().getCanonicalPath(),name + new String(this.OpenPasswordField.getPassword())));
            if(!tmp.isEmpty())
            {    
                this.InfoField.setText("File opened");
                this.notebook1.setData(tmp);
            }
            else
                this.InfoField.setText("Bad Password");
            this.InfoDialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.OpenPasswordField.setText(null);
    }//GEN-LAST:event_OpenButtonDialogActionPerformed

    private void CancelButtonOpenDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonOpenDialogActionPerformed
        this.OpenDialog.setVisible(false);
        this.OpenPasswordField.setText(null);
    }//GEN-LAST:event_CancelButtonOpenDialogActionPerformed

    private void ImportContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportContactActionPerformed
        try{    
            this.FileChooser.setVisible(true);
            int returnVal = this.FileChooser.showOpenDialog(this);

            if (returnVal == FileChooser.APPROVE_OPTION) {
                this.notebook1.setData(StringTools.convertCsvStringToHashMapFormat(StringTools.getString(FileTools.ReadFile(this.FileChooser.getSelectedFile().getCanonicalPath()))));
            } else {
                System.out.println("Canceled");
            }
        } catch (IOException ex) {
            Logger.getLogger(MainWindows.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImportContactActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButtonDialog;
    private javax.swing.JButton CancelButtonOpenDialog;
    private javax.swing.JMenu ContactMenu;
    private javax.swing.JCheckBoxMenuItem EncreyptedFile;
    private javax.swing.JMenu File;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JMenuItem ImportContact;
    private javax.swing.JDialog InfoDialog;
    private javax.swing.JLabel InfoField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton OpenButtonDialog;
    private javax.swing.JDialog OpenDialog;
    private javax.swing.JPasswordField OpenPasswordField;
    private javax.swing.JLabel OpenPasswordLabel;
    private javax.swing.JMenu Option;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JMenuItem Save;
    private javax.swing.JButton SaveButtonDialog;
    private javax.swing.JDialog SaveDialogWithoutFile;
    private javax.swing.JMenuItem addContact;
    private javax.swing.JMenuItem deleteContact;
    private javax.swing.JTextField loginTextField;
    private view.Notebook notebook1;
    // End of variables declaration//GEN-END:variables
}

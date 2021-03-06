/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Desktop;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import tableView.DefaultTableViewColumn;
import tableView.DefaultTableViewModel;
import tableView.TableView;
import tableView.TableViewColumn;

/**
 * Notebook class manage and display informations with a JTable
 * @author Thibaut
 */
public class Notebook extends javax.swing.JPanel
{
    private DefaultTableViewModel model;
    private boolean isFileChanged = false;
    
    public Notebook() {
        this.initData();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new TableView(this.model);
        mailToButton = new javax.swing.JButton();

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(viewTable);

        mailToButton.setText("MailTo");
        mailToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailToButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(mailToButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mailToButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        this.addRow();
    }//GEN-LAST:event_addButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        this.removeRow();
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void mailToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailToButtonActionPerformed
        this.mailTo();
    }//GEN-LAST:event_mailToButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton addButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mailToButton;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables

    private void initData()
    {
        try {
            TableViewColumn[] columns =
              {
                new DefaultTableViewColumn(
                  "Name",
                  Row.class.getDeclaredMethod("getName", null),
                  Row.class.getDeclaredMethod("setName", new Class[] {String.class})),
                new DefaultTableViewColumn(
                  "Mail",
                  Row.class.getDeclaredMethod("getMail", null),
                  Row.class.getDeclaredMethod("setMail", new Class[] {String.class})),
            };

            Row[] rows = new Row[0];
 

            this.model = new DefaultTableViewModel(columns, Arrays.asList(rows));

          }
          catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
          }
    }
    
    /**
     *
     * @param list
     */
    public void setData(HashMap<String,String> list)
    {
        this.isFileChanged = true;
        List selection = ((TableView)viewTable).getSelectedRowObjects();
        for(Entry<String, String> entry : list.entrySet()) 
            model.addRow(new Row(entry.getKey(), entry.getValue()));
        
        ((TableView)viewTable).addRowSelection(selection);
    }
    
    /**
     *
     * @return
     */
    public HashMap<String,String> getDataFromTable()
    {
        HashMap<String,String> data = new HashMap<>();
        
        for(int i=0; i < this.viewTable.getRowCount(); i++)
            data.put((String)this.viewTable.getValueAt(i, 0),(String)this.viewTable.getValueAt(i, 1));  
        
        return data;
    }
    
    /**
     *
     */
    public void addRow()
    {
        this.isFileChanged = true;
        List selection = ((TableView)viewTable).getSelectedRowObjects();
        model.addRow(new Row("New row", "This is s new row"));
        ((TableView)viewTable).addRowSelection(selection);
    }
    
    /**
     *
     */
    public void removeRow()
    {
        this.isFileChanged = true;
        List selection = ((TableView)viewTable).getSelectedRowObjects();
        model.removeRows(selection);
    }

    private void mailTo() 
    {
        System.out.println(((Row)((TableView)viewTable).getSelectedRowObject()).mail);
        String mailTo = new String("");
        URI uriMailTo = null;

        //Assembler l'url
        mailTo = ((Row)((TableView)viewTable).getSelectedRowObject()).mail;
        mailTo += "?subject=Objet";
        mailTo += "&body=";

        //Ouvrir le logiciel de messagerie par défaut
        if (Desktop.isDesktopSupported()) {
            if (Desktop.getDesktop().isSupported(Desktop.Action.MAIL)) {
                try {
                    uriMailTo = new URI("mailto", mailTo, null);
                    Desktop.getDesktop().mail(uriMailTo);
                } catch (Exception ex) {
                    Logger.getLogger(Notebook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     *
     * @return
     */
    public boolean getIsFileChanged() {
        return isFileChanged;
    }
    
    /**
     *
     */
    public static class Row
    {
        private String name,mail;
        
        /**
         *
         * @param name
         * @param mail
         */
        public Row(String name, String mail)
        {
            this.name = name;
            this.mail = mail;
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
}
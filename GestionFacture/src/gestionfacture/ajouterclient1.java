/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionfacture;

 
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ROSSE PATIENT
 */
public final class ajouterclient1 extends javax.swing.JFrame {
     Connection con;
    ResultSet rs ;
    ResultSet rst ;
    Statement pst;
   private static int ida;
 
    public ajouterclient1(int idAgent) throws SQLException {
       
        initComponents();
        TableClient();
        this.ida= idAgent;
        pst = con.createStatement(); 
        
    }
     public void Connect(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/GESTIONFACTURE","root","");
         //JOptionPane.showMessageDialog(null,"connection reussie");
     }
     catch (ClassNotFoundException | SQLException e){
     }

 }
      public void TableClient(){
          String [] client ={"ID","NOM","PRENOM","EMAIL","CONTACT"};
          String[] afficher =new String[5];
          DefaultTableModel model =new DefaultTableModel(null,client);
      
       try{
          Connect();
          Statement stm = con.createStatement();
           String sql1 = "SELECT * FROM client";
           rs = stm.executeQuery(sql1);
            while(rs.next()){
                afficher[0]=rs.getString("idClient");
                afficher[1]=rs.getString("NomClient");
                afficher[2]=rs.getString("PrenomClient");
                afficher[3]=rs.getString("ContactClient");
                afficher[4]=rs.getString("EmailClient");
                model.addRow(afficher);
            }
            jTable2.setModel(model);

       
       }  catch (SQLException e){
     }


}
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtnom = new javax.swing.JLabel();
        txtcontact = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        mail1 = new javax.swing.JTextField();
        txtprenom1 = new javax.swing.JLabel();
        txtemail1 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        AjoutAgent = new javax.swing.JButton();
        nom = new javax.swing.JTextField();
        accueil = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        police = new javax.swing.JTextField();
        txtcontact1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setText("[]");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 10, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setRowHeight(22);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 710, 260));

        txtnom.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        txtnom.setForeground(new java.awt.Color(255, 255, 255));
        txtnom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnom.setText("NOM");
        jPanel2.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, 20));

        txtcontact.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        txtcontact.setForeground(new java.awt.Color(255, 255, 255));
        txtcontact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcontact.setText("POLICE COMPTEUR");
        jPanel2.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 170, -1));

        prenom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        jPanel2.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, 36));

        mail1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail1ActionPerformed(evt);
            }
        });
        jPanel2.add(mail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 230, 36));

        txtprenom1.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        txtprenom1.setForeground(new java.awt.Color(255, 255, 255));
        txtprenom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtprenom1.setText("PRENOM");
        jPanel2.add(txtprenom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 80, -1));

        txtemail1.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        txtemail1.setForeground(new java.awt.Color(255, 255, 255));
        txtemail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtemail1.setText("EMAIL");
        jPanel2.add(txtemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 220, 36));

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 0));
        jButton5.setText("SUPPRIMER");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 180, 30));

        jButton7.setBackground(new java.awt.Color(0, 204, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("MODIFIER");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 180, 30));

        AjoutAgent.setBackground(new java.awt.Color(0, 204, 0));
        AjoutAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AjoutAgent.setForeground(new java.awt.Color(255, 255, 255));
        AjoutAgent.setText("AJOUTER");
        AjoutAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjoutAgentMouseClicked(evt);
            }
        });
        AjoutAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutAgentActionPerformed(evt);
            }
        });
        jPanel2.add(AjoutAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, 30));

        nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 220, 36));

        accueil.setBackground(new java.awt.Color(0, 102, 204));
        accueil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accueil.setForeground(new java.awt.Color(255, 255, 255));
        accueil.setText("Accueil");
        jPanel2.add(accueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Module client");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("INFORMATION COMPTEUR");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 270, 20));

        jLabel13.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("INFORMATION CLIENT");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 270, 20));
        jPanel2.add(police, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 240, 40));

        txtcontact1.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        txtcontact1.setForeground(new java.awt.Color(255, 255, 255));
        txtcontact1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcontact1.setText("CONTACT");
        jPanel2.add(txtcontact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 740));

        setSize(new java.awt.Dimension(777, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

                  try {
          Connect();
          Statement stm3=con.createStatement();
          
          String sql3 = "DELETE   FROM client  WHERE IdClient='"+ id.getText()+ "'";
         
        
stm3.executeUpdate(sql3);
con.close();
             JOptionPane.showMessageDialog(null,"Client supprimé avec succès");
             TableClient();
      }
      catch(HeadlessException | SQLException e){
          e.printStackTrace();
      }      
        
   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void AjoutAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjoutAgentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AjoutAgentMouseClicked

    private void AjoutAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutAgentActionPerformed
      
           try {
          Connect();
          
          String sql2 = "INSERT INTO client"+ "(NomClient, PrenomClient,ContactClient,EmailClient) VALUES('"+nom.getText() +"', '"+ prenom.getText() +"', '"+ contact.getText()+"' ,'"+ mail1.getText()+"')";
        
this.pst.executeUpdate(sql2);
Statement stm4 = con.createStatement();
           String sql4 = "SELECT IdClient FROM client ORDER BY IdClient DESC LIMIT 1";
           rst = stm4.executeQuery(sql4);
           while(rst.next()){
               String IdClient = rst.getString("IdClient");
           String sql5 = "INSERT INTO compteur"+ "(Police,IdClient) VALUES('"+police.getText() +"', '"+ rst.getString("IdClient")+"')";
         Statement stm5 = con.createStatement();
        stm5.executeUpdate(sql5);
            }



             JOptionPane.showMessageDialog(null,"Client Ajouter");
             TableClient();
             con.close();
      }
      catch(HeadlessException | SQLException e){
          e.printStackTrace();
      }
    }//GEN-LAST:event_AjoutAgentActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     
                try {
          Connect();
          Statement stm3=con.createStatement();
          
          String sql3 = "UPDATE client SET NomClient='"+nom.getText() +"', PrenomClient='"+ prenom.getText() +"',EmailClient='"+ mail1.getText()+"',ContactClient='"+ contact.getText()+"'  WHERE idClient='"+ id.getText()+"'";
        
stm3.executeUpdate(sql3);
con.close();
             JOptionPane.showMessageDialog(null,"Client modifié avec succès");
             TableClient();
      }
      catch(HeadlessException | SQLException e){
          e.printStackTrace();
      }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void mail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
      
        int i=jTable2.getSelectedRow();
         DefaultTableModel model =(DefaultTableModel)jTable2.getModel();
        id.setText(model.getValueAt(i,0).toString());
         nom.setText(model.getValueAt(i,1).toString());
         prenom.setText(model.getValueAt(i,2).toString());
         contact.setText(model.getValueAt(i,3).toString());
         mail1.setText(model.getValueAt(i,4).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

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
            java.util.logging.Logger.getLogger(ajouterclient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouterclient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouterclient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouterclient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ajouterclient1(ida).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ajouterclient1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutAgent;
    private javax.swing.JButton accueil;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField mail1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField police;
    private javax.swing.JTextField prenom;
    private javax.swing.JLabel txtcontact;
    private javax.swing.JLabel txtcontact1;
    private javax.swing.JLabel txtemail1;
    private javax.swing.JLabel txtnom;
    private javax.swing.JLabel txtprenom1;
    // End of variables declaration//GEN-END:variables

    private void initComponent() {
        throw new UnsupportedOperationException("Not supported yetyt."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

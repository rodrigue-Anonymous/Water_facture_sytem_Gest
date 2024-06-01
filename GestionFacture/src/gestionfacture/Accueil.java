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
public class Accueil extends javax.swing.JFrame {

         Connection con;
    ResultSet rs ;
    ResultSet rst ;
    Statement pst;
    private static int id;
    int volumeConsommeDB;
    /**
     * Creates new form Accueil
     */

    public  Accueil(int   ida) {
       initComponents();
       this.id = ida;
      
            try {
           
          Connect();
          
     
           String sql = "SELECT * FROM agent WHERE IdAgent = '"+id+"' ";
           Statement stm = con.createStatement();
           rs = stm.executeQuery(sql);
          
              
             while(rs.next()){
           
                 String nom1 = rs.getString("NomAgent");
                String pr = rs.getString("PrenomAgent");
                String fct = rs.getString("FonctionAgent");
                 String mail = rs.getString("EmailAgent");
                  String contact = rs.getString("TelAgent");
                    nom.setText(nom1);
                   prenom.setText(pr);
               fonction.setText(fct);
               email.setText(mail);
               tel.setText(contact);
            } 

                       
             con.close();
      }
      catch(HeadlessException | SQLException e){
          e.printStackTrace();
      }
  
 
    }
    
    public void prendreId ( int idagent) {
        
       
      
             
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        police = new javax.swing.JTextField();
        volumeconsomme = new javax.swing.JTextField();
        etablir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        fonction = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        moduleclient = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ETABLIR UNE FACTURE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 23, -1, -1));

        police.setText("Police Compteur");
        police.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                policeMouseClicked(evt);
            }
        });
        jPanel1.add(police, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 77, 188, 30));

        volumeconsomme.setText("Volume relevé");
        volumeconsomme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeconsommeMouseClicked(evt);
            }
        });
        jPanel1.add(volumeconsomme, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 141, 184, 32));

        etablir.setBackground(new java.awt.Color(0, 102, 255));
        etablir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etablir.setForeground(new java.awt.Color(255, 255, 255));
        etablir.setText("ETABLIR");
        etablir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etablirMouseClicked(evt);
            }
        });
        jPanel1.add(etablir, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 238, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 330, 380));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Mes informations Personnelles");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Nom");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Prénoms");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Email");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Téléphone");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Fonction");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        nom.setText("jLabel8");
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 240, -1));

        prenom.setText("jLabel9");
        jPanel2.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, -1));

        email.setText("jLabel10");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 240, -1));

        tel.setText("jLabel11");
        jPanel2.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 240, -1));

        fonction.setText("jLabel12");
        jPanel2.add(fonction, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 240, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 370, 370));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Accueil");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 100, 30));

        moduleclient.setBackground(new java.awt.Color(0, 102, 204));
        moduleclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        moduleclient.setForeground(new java.awt.Color(255, 255, 255));
        moduleclient.setText("Module Client");
        moduleclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moduleclientMouseClicked(evt);
            }
        });
        jPanel3.add(moduleclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionfacture/OIP (2).jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel9.setMinimumSize(new java.awt.Dimension(30, 30));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 200));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void etablirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etablirMouseClicked
        // TODO add your handling code here:

                  try {
          Connect();
          int c = 0;

        
        
        
         Statement stm = con.createStatement();
          Statement stm3 = con.createStatement();
         
        if(police.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Champ Non vide");
                } else if(volumeconsomme.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Champ Non vide");
                } else{
                    String sql = "SELECT *  FROM compteur";
                     rst = stm.executeQuery(sql);
                     while(rst.next()){
                         
                        if(police.getText().equals(rst.getString("Police"))){
                          c= c+1;
                        }}
                         
                         if (c > 0) {
    String sql1 = "SELECT VolumeConsomme FROM Consulter WHERE Police= '" + police.getText() + "' ORDER BY DateConsultation DESC LIMIT 1";
    
    rs = stm.executeQuery(sql1);
    
       if (rs.next()) {
    int volumeConsommeDB = rs.getInt("VolumeConsomme");
   
       int difference = Integer.parseInt(volumeconsomme.getText()) - volumeConsommeDB;
    int Montant = difference * 198;
    int Mtotal = Montant + (20 * Montant) / 100;

    String sql2 = "INSERT INTO facture(DateEmission, Police, MontantTotal) VALUES(NOW(), '" + police.getText() + "', '" + Mtotal + "')";
    stm.executeUpdate(sql2);

    String sql3 = "INSERT INTO consulter(DateConsultation, Police, VolumeConsomme, IdAgent) VALUES(NOW(), '" + police.getText() + "', '" + volumeconsomme.getText() + "','" + id + "')";
    stm.executeUpdate(sql3);

    JOptionPane.showMessageDialog(null, "La facture a été établie");
} else {
   int volumeConsommeDB = 0;
   
       int difference = Integer.parseInt(volumeconsomme.getText()) - volumeConsommeDB;
    int Montant = difference * 198;
    int Mtotal = Montant + (20 * Montant) / 100;

    String sql2 = "INSERT INTO facture(DateEmission, Police, MontantTotal) VALUES(NOW(), '" + police.getText() + "', '" + Mtotal + "')";
    stm.executeUpdate(sql2);

    String sql3 = "INSERT INTO consulter(DateConsultation, Police, VolumeConsomme, IdAgent) VALUES(NOW(), '" + police.getText() + "', '" + volumeconsomme.getText() + "','" + id + "')";
    stm.executeUpdate(sql3);

    JOptionPane.showMessageDialog(null, "La facture a été établie");
}

stm.close(); // Fermer le Statement après utilisation

} else {
    JOptionPane.showMessageDialog(null, "Police incorrecte");
}

                     
                  


                }
          
          
          
            con.close();
            
            
      }
      catch(HeadlessException | SQLException e){
          e.printStackTrace();
      }
                  new AfficherFacture(id).setVisible(true);
                  hide();
    }//GEN-LAST:event_etablirMouseClicked

    private void policeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_policeMouseClicked
        // TODO add your handling code here:
        police.setText("");
    }//GEN-LAST:event_policeMouseClicked

    private void volumeconsommeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeconsommeMouseClicked
        // TODO add your handling code here:
        volumeconsomme.setText("");
    }//GEN-LAST:event_volumeconsommeMouseClicked

    private void moduleclientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moduleclientMouseClicked
             try {
                 // TODO add your handling code here:
                 new ajouterclient1(id).setVisible(true);
                 hide();
             } catch (SQLException ex) {
                 Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_moduleclientMouseClicked

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Accueil(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JButton etablir;
    private javax.swing.JLabel fonction;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton moduleclient;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField police;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel tel;
    private javax.swing.JTextField volumeconsomme;
    // End of variables declaration//GEN-END:variables
}
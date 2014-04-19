


package discotheque;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.Vector;
import oracle.jdbc.driver.OracleConnection;

public class JFrameListeArtiste extends javax.swing.JFrame {

    public JFrameListeArtiste(ConnectionOracle conn, int numArt) {
        initComponents();
        this.connBD = conn;
        this.numArtiste = numArt;
    }
    private void nommerArtiste()
    {
        String sqlNom = "select nom, prenom from artistes where numart = " + numArtiste;
        try{
            Statement stm1 = connBD.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rst = stm1.executeQuery(sqlNom);
            if (rst.first())
            {
                LB_NomArt.setText(rst.getString("prenom")+" "+rst.getString("nom"));                
            }
        }catch (SQLException sqe){System.out.println(sqe);}
    }

    //Remplir le JSCROLLPANE
    public void lister(){
    
        Vector vectEntete = null;
        nommerArtiste();
        try
        {
            PreparedStatement stm = connBD.getConnection().prepareStatement(sqlListe);
            stm.setInt(1, numArtiste);
            ResultSet rst = stm.executeQuery();
            vectDisques = remplirVecteur(rst);
            vectEntete = creerEntete();  
            tabDisques = new JTable(vectDisques, vectEntete);
            JSP_Artistes.setViewportView(tabDisques);
            this. getContentPane().add(JSP_Artistes,BorderLayout.CENTER);
            JSP_Artistes.validate();            
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, se);
        }
    }
    
    private Vector creerEntete()
    {
        Vector vectEntete = new Vector();
        vectEntete.add("No Disque");
        vectEntete.add("Titre");
        vectEntete.add("Prix");
        vectEntete.add("Année");
        vectEntete.add("Lanque");
        vectEntete.add("Nbre chansons");
        vectEntete.add("Genre");
        return vectEntete;        
    }
    private Vector remplirVecteur(ResultSet rst){
        Vector v = new Vector();
        Vector ligne = null;
        try
        {            
            while (rst.next()){
                ligne = new Vector();
                ligne.add(rst.getInt(1));
                ligne.add(rst.getString(2));
                ligne.add(rst.getFloat(3));
                ligne.add(rst.getInt(4));
                ligne.add(rst.getString(5));
                ligne.add(rst.getInt(6));
                ligne.add(rst.getString(7));
                v.add(ligne); 
            }            
        }
        catch (SQLException se)
        {
            JOptionPane.showMessageDialog(this, se);
        }
        return v;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSP_Artistes = new javax.swing.JScrollPane();
        BTN_Supprimer = new javax.swing.JButton();
        LB_NomArt = new javax.swing.JLabel();

        setTitle("Disques par artistes");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        BTN_Supprimer.setText("Supprimer disque de l'artiste");
        BTN_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SupprimerActionPerformed(evt);
            }
        });

        LB_NomArt.setText("Artiste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LB_NomArt, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JSP_Artistes, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Supprimer)
                    .addComponent(LB_NomArt))
                .addGap(18, 18, 18)
                .addComponent(JSP_Artistes, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SupprimerActionPerformed
        String sqlDesaffecter = "delete from \"Artiste/Disque\" where numart = ? and numdisque = ?";
        try
        {
            int ListPos = tabDisques.getSelectedRow();
            Object descDique = (vectDisques.elementAt(ListPos));
            String disque = descDique.toString().split(", ")[0].substring(1); //récupère le numdisque seulement
            PreparedStatement pstA = connBD.getConnection().prepareStatement(sqlDesaffecter);
            pstA.setInt(1, numArtiste);
            pstA.setInt(2, Integer.parseInt(disque));   
            pstA.executeUpdate();
            
            this.lister();
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, se.getMessage());
        }
    }//GEN-LAST:event_BTN_SupprimerActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.lister();
    }//GEN-LAST:event_formFocusGained

    
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
            java.util.logging.Logger.getLogger(JFrameListeArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameListeArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameListeArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameListeArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
 //               new JFrameListeArtiste(connBD).setVisible(true);
            }
        });
    }

    int numArtiste = 0;
    ConnectionOracle connBD;
    Vector vectDisques = new Vector();
    JTable tabDisques = null;
    String sqlListe = "select * from disques where numdisque in " +
            "(select numdisque from \"Artiste/Disque\" where numart = ? )";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Supprimer;
    private javax.swing.JScrollPane JSP_Artistes;
    private javax.swing.JLabel LB_NomArt;
    // End of variables declaration//GEN-END:variables
}

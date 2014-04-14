//JFrameArtistes.java
//Isabelle Angrignon et Simon Bouchard
//le 12/04/2014
package discotheque;


import java.sql.*;
import javax.swing.*;

public class JFrameArtistes extends javax.swing.JFrame {

    public JFrameArtistes(ConnectionOracle conn) {
        initComponents();
        this.connBD = conn;
        listerTBX();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Vider = new javax.swing.JButton();
        BTN_Dernier = new javax.swing.JButton();
        BTN_Supprimer = new javax.swing.JButton();
        BTN_Premier = new javax.swing.JButton();
        BTN_Ajout = new javax.swing.JButton();
        BTN_Modif = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TBX_Nation = new javax.swing.JTextField();
        BTN_Lister = new javax.swing.JButton();
        BTN_Precedent = new javax.swing.JButton();
        TBX_Prenom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TBX_Recherche = new javax.swing.JTextField();
        BTN_Suivant = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LB_Num = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BTN_Rechercher = new javax.swing.JButton();
        TBX_Nom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setResizable(false);

        BTN_Vider.setText("Vider les zones");
        BTN_Vider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ViderActionPerformed(evt);
            }
        });

        BTN_Dernier.setText("Dernier");
        BTN_Dernier.setMaximumSize(new java.awt.Dimension(85, 23));
        BTN_Dernier.setMinimumSize(new java.awt.Dimension(85, 23));
        BTN_Dernier.setPreferredSize(new java.awt.Dimension(85, 23));
        BTN_Dernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DernierActionPerformed(evt);
            }
        });

        BTN_Supprimer.setText("Supprimer");
        BTN_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SupprimerActionPerformed(evt);
            }
        });

        BTN_Premier.setText("Premier");
        BTN_Premier.setMaximumSize(new java.awt.Dimension(85, 23));
        BTN_Premier.setMinimumSize(new java.awt.Dimension(85, 23));
        BTN_Premier.setPreferredSize(new java.awt.Dimension(85, 23));
        BTN_Premier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PremierActionPerformed(evt);
            }
        });

        BTN_Ajout.setText("Ajouter");
        BTN_Ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AjoutActionPerformed(evt);
            }
        });

        BTN_Modif.setText("Modifier");
        BTN_Modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModifActionPerformed(evt);
            }
        });

        jLabel6.setText("Nationalité");

        BTN_Lister.setText("Afficher tous les enregistrements");
        BTN_Lister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ListerActionPerformed(evt);
            }
        });

        BTN_Precedent.setText("Précédent");
        BTN_Precedent.setMaximumSize(new java.awt.Dimension(85, 23));
        BTN_Precedent.setMinimumSize(new java.awt.Dimension(85, 23));
        BTN_Precedent.setPreferredSize(new java.awt.Dimension(85, 23));
        BTN_Precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PrecedentActionPerformed(evt);
            }
        });

        jLabel5.setText("Prénom");

        BTN_Suivant.setText("Suivant");
        BTN_Suivant.setMaximumSize(new java.awt.Dimension(85, 23));
        BTN_Suivant.setMinimumSize(new java.awt.Dimension(85, 23));
        BTN_Suivant.setPreferredSize(new java.awt.Dimension(85, 23));
        BTN_Suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SuivantActionPerformed(evt);
            }
        });

        jLabel4.setText("Nom");

        LB_Num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Num.setText("1");
        LB_Num.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("#Artiste");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Artistes");

        BTN_Rechercher.setText("Recherche par nom");
        BTN_Rechercher.setToolTipText("");
        BTN_Rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RechercherActionPerformed(evt);
            }
        });

        jLabel7.setText("(vide affiche tout)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TBX_Nation, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LB_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TBX_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TBX_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BTN_Supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_Modif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_Ajout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BTN_Vider))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Rechercher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TBX_Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(BTN_Lister)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Premier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Precedent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Suivant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Dernier, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LB_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Ajout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BTN_Modif)
                    .addComponent(TBX_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBX_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(BTN_Supprimer))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TBX_Nation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Vider))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Precedent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Dernier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Premier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Suivant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BTN_Lister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Rechercher)
                    .addComponent(TBX_Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BTN_ViderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ViderActionPerformed
        vider();
    }//GEN-LAST:event_BTN_ViderActionPerformed

    private void BTN_DernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DernierActionPerformed
        try {
            if(rst.last())
            {
                remplir();
            }
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(this, "dernier imposible");        }
    }//GEN-LAST:event_BTN_DernierActionPerformed

    private void BTN_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SupprimerActionPerformed
        try{
            CallableStatement cstmS = connBD.getConnection().prepareCall("{call GestionArtiste.supprimer(?)}");
            cstmS.setInt(1, Integer.parseInt(LB_Num.getText()));
            cstmS.executeUpdate();
            listerTBX();
        }catch(SQLException sqe){
            JOptionPane.showMessageDialog(this, sqe.getMessage());
        }
        
    }//GEN-LAST:event_BTN_SupprimerActionPerformed

    private void listerTBX(){
        try{
            Statement stm1 = connBD.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rst = stm1.executeQuery(sqlListe);
            if (rst.first())
            {
                remplir();
            }
        }catch (SQLException sqe){System.out.println(sqe);}
    }
            
    private void BTN_PremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PremierActionPerformed
        try
        {            
            if (rst.first())
            {
                remplir();
            }
        }
        catch(SQLException se){ System.out.println(se);}
        
    }//GEN-LAST:event_BTN_PremierActionPerformed

    private void BTN_AjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AjoutActionPerformed

        try{
            CallableStatement cstmS = connBD.getConnection().prepareCall("{call GestionArtiste.inserer(?,?,?)}");
            cstmS.setString(1, TBX_Nom.getText());
            cstmS.setString(2, TBX_Prenom.getText());
            cstmS.setString(3, TBX_Nation.getText());
            cstmS.executeUpdate();
            listerTBX();
        }catch(SQLException sqe){
            JOptionPane.showMessageDialog(this, sqe.getMessage());
        }
    }//GEN-LAST:event_BTN_AjoutActionPerformed

    private void BTN_ModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifActionPerformed
        try{
            CallableStatement cstmS = connBD.getConnection().prepareCall("{call GestionArtiste.modifier(?,?,?,?)}");
            cstmS.setInt(1, Integer.parseInt(LB_Num.getText()));
            cstmS.setString(2, TBX_Nom.getText());
            cstmS.setString(3, TBX_Prenom.getText());
            cstmS.setString(4, TBX_Nation.getText());
            cstmS.executeUpdate();
            listerTBX();
            vider();
        }catch(SQLException sqe){
            JOptionPane.showMessageDialog(this, sqe.getMessage());
        }
    }//GEN-LAST:event_BTN_ModifActionPerformed

    private void BTN_ListerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ListerActionPerformed
        JFrameListeArtiste fenetre2 = new JFrameListeArtiste(connBD);
        fenetre2.setVisible(true);
   //     fenetre2.lister();        
    }//GEN-LAST:event_BTN_ListerActionPerformed

    private void BTN_PrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PrecedentActionPerformed

        try
        {
            if(rst.previous())
            {
                remplir();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Précedent impossible");
            }
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "précedent impossible");
        }
    }//GEN-LAST:event_BTN_PrecedentActionPerformed

    private void BTN_SuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SuivantActionPerformed
        
        try
        {
            if(rst.next())
            {
                remplir();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "suivant impossible");
            }
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(this, "Suivant imposible");
        }
    }//GEN-LAST:event_BTN_SuivantActionPerformed

    private void BTN_RechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RechercherActionPerformed
        try{
            PreparedStatement stm2 = connBD.getConnection().prepareStatement(sqlRecherche, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);            
            stm2.setString(1, TBX_Recherche.getText()+"%");
            rst = stm2.executeQuery();
            if (rst.first())
            {
                remplir();
            }
        }catch (SQLException sqe){
            JOptionPane.showMessageDialog(this, sqe.getMessage());
        }
    }//GEN-LAST:event_BTN_RechercherActionPerformed
 
    private void remplir(){
        try{
            LB_Num.setText(((Integer)rst.getInt("numart")).toString());                
            TBX_Nom.setText(rst.getString("nom"));
            TBX_Prenom.setText(rst.getString("prenom"));
            TBX_Nation.setText (rst.getString("nationalite"));
        }
        catch(SQLException se){ System.out.println(se);}
    }
    
    private void vider(){
         TBX_Nom.setText("");
         TBX_Prenom.setText("");
         TBX_Nation.setText("");
         TBX_Recherche.setText("");
     }
   
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
            java.util.logging.Logger.getLogger(JFrameArtistes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameArtistes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameArtistes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameArtistes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //   new JFrameArtistes().setVisible(true);
            }
        });
    }

    // Declartion autres variables.
   ConnectionOracle connBD;
   ResultSet rst ;
   String sqlListe ="select * from artistes order by nom, prenom, nationalite";
   String sqlRecherche = "select * from artistes where nom like ? order by nom, prenom, nationalite";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Ajout;
    private javax.swing.JButton BTN_Dernier;
    private javax.swing.JButton BTN_Lister;
    private javax.swing.JButton BTN_Modif;
    private javax.swing.JButton BTN_Precedent;
    private javax.swing.JButton BTN_Premier;
    private javax.swing.JButton BTN_Rechercher;
    private javax.swing.JButton BTN_Suivant;
    private javax.swing.JButton BTN_Supprimer;
    private javax.swing.JButton BTN_Vider;
    private javax.swing.JLabel LB_Num;
    private javax.swing.JTextField TBX_Nation;
    private javax.swing.JTextField TBX_Nom;
    private javax.swing.JTextField TBX_Prenom;
    private javax.swing.JTextField TBX_Recherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

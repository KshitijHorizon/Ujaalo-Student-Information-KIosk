/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campuses;

import InternalFrames.CampusServices;
import InternalFrames.PutterLocation;

import InternalFrames.PutterGallery;
import InternalFrames.PutterAbout;
import Ujaalo.Campuses;

/**
 *
 * @author User
 */
public class PutteridgeCampus extends javax.swing.JFrame {

    /**
     * Creates new form Putteridge
     */
    public PutteridgeCampus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SideTabPanel = new javax.swing.JPanel();
        UniversityLogo = new javax.swing.JLabel();
        btn_about = new javax.swing.JButton();
        btn_location = new javax.swing.JButton();
        btn_gallery = new javax.swing.JButton();
        btn_services = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LutonPane = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(99, 110, 114));
        jPanel1.setForeground(new java.awt.Color(99, 110, 114));

        jPanel2.setBackground(new java.awt.Color(99, 110, 114));
        jPanel2.setForeground(new java.awt.Color(99, 110, 114));

        SideTabPanel.setBackground(new java.awt.Color(237, 28, 36));
        SideTabPanel.setMaximumSize(new java.awt.Dimension(270, 768));
        SideTabPanel.setMinimumSize(new java.awt.Dimension(270, 768));

        UniversityLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uu1.png"))); // NOI18N

        btn_about.setBackground(new java.awt.Color(237, 28, 36));
        btn_about.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_about.setForeground(new java.awt.Color(255, 255, 255));
        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about1.png"))); // NOI18N
        btn_about.setText("     About Us");
        btn_about.setBorder(null);
        btn_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_aboutMousePressed(evt);
            }
        });
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });

        btn_location.setBackground(new java.awt.Color(237, 28, 36));
        btn_location.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_location.setForeground(new java.awt.Color(255, 255, 255));
        btn_location.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Campus.png"))); // NOI18N
        btn_location.setText("     Location");
        btn_location.setBorder(null);
        btn_location.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locationActionPerformed(evt);
            }
        });

        btn_gallery.setBackground(new java.awt.Color(237, 28, 36));
        btn_gallery.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_gallery.setForeground(new java.awt.Color(255, 255, 255));
        btn_gallery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coursess.png.png"))); // NOI18N
        btn_gallery.setText("     Gallery");
        btn_gallery.setBorder(null);
        btn_gallery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_galleryActionPerformed(evt);
            }
        });

        btn_services.setBackground(new java.awt.Color(237, 28, 36));
        btn_services.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_services.setForeground(new java.awt.Color(255, 255, 255));
        btn_services.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/apply.png"))); // NOI18N
        btn_services.setText("       Services");
        btn_services.setBorder(null);
        btn_services.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_services.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SideTabPanelLayout = new javax.swing.GroupLayout(SideTabPanel);
        SideTabPanel.setLayout(SideTabPanelLayout);
        SideTabPanelLayout.setHorizontalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_location, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_gallery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_services, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43))))
        );
        SideTabPanelLayout.setVerticalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideTabPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_location, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_gallery, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_services, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1300_1.jpg"))); // NOI18N

        LutonPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LutonPaneLayout = new javax.swing.GroupLayout(LutonPane);
        LutonPane.setLayout(LutonPaneLayout);
        LutonPaneLayout.setHorizontalGroup(
            LutonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LutonPaneLayout.setVerticalGroup(
            LutonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LutonPaneLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(SideTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LutonPane)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LutonPane)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aboutMousePressed
        // This will connect another tabbed window inside the same jframe
    }//GEN-LAST:event_btn_aboutMousePressed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        // TODO add your handling code here:

        PutterAbout pa = new PutterAbout();
        LutonPane.add(pa);
        pa.show();
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void btn_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locationActionPerformed
        // TODO add your handling code here:

        PutterLocation pl = new PutterLocation();
        LutonPane.add(pl);
        pl.show();
    }//GEN-LAST:event_btn_locationActionPerformed

    private void btn_galleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_galleryActionPerformed
        // TODO add your handling code here:

        PutterGallery pg = new PutterGallery();
        LutonPane.add(pg);
        pg.show();
    }//GEN-LAST:event_btn_galleryActionPerformed

    private void btn_servicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicesActionPerformed
        // TODO add your handling code here:
        
        CampusServices ba = new CampusServices();
       LutonPane.add(ba);
       ba.show();
    }//GEN-LAST:event_btn_servicesActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        Campuses cgf = new Campuses();
        cgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        Campuses cgf = new Campuses();
        cgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(PutteridgeCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PutteridgeCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PutteridgeCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PutteridgeCampus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PutteridgeCampus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane LutonPane;
    private javax.swing.JPanel SideTabPanel;
    private javax.swing.JLabel UniversityLogo;
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_gallery;
    private javax.swing.JButton btn_location;
    private javax.swing.JButton btn_services;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

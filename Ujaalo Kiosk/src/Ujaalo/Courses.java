/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujaalo;

import Courses.UnderGraduate;
import Courses.PostGraduate;
import Courses.FoundationYear;
import Courses.JobPlacements;
import Courses.InternationalStudents;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Courses extends javax.swing.JFrame {

    /**
     * Creates new form Courses
     */
    public Courses() {
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

        CoursesPanel = new javax.swing.JPanel();
        Course = new javax.swing.JPanel();
        SideTabPanel = new javax.swing.JPanel();
        UniversityLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_underGraduate = new javax.swing.JButton();
        btn_postGraduate = new javax.swing.JButton();
        btn_FoundationClass = new javax.swing.JButton();
        btn_InternationalStudent = new javax.swing.JButton();
        btn_jobPlacements = new javax.swing.JButton();
        CouresesPane = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        CoursesPanel.setBackground(new java.awt.Color(99, 110, 114));
        CoursesPanel.setForeground(new java.awt.Color(99, 110, 114));

        Course.setBackground(new java.awt.Color(99, 110, 114));
        Course.setForeground(new java.awt.Color(99, 110, 114));

        SideTabPanel.setBackground(new java.awt.Color(237, 28, 36));
        SideTabPanel.setMaximumSize(new java.awt.Dimension(270, 768));
        SideTabPanel.setMinimumSize(new java.awt.Dimension(270, 768));

        UniversityLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uu1.png"))); // NOI18N

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

        btn_underGraduate.setBackground(new java.awt.Color(237, 28, 36));
        btn_underGraduate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_underGraduate.setForeground(new java.awt.Color(255, 255, 255));
        btn_underGraduate.setText("Undergraduate Course");
        btn_underGraduate.setBorder(null);
        btn_underGraduate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_underGraduate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_underGraduateMousePressed(evt);
            }
        });
        btn_underGraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_underGraduateActionPerformed(evt);
            }
        });

        btn_postGraduate.setBackground(new java.awt.Color(237, 28, 36));
        btn_postGraduate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_postGraduate.setForeground(new java.awt.Color(255, 255, 255));
        btn_postGraduate.setText("Postgraduate Courses");
        btn_postGraduate.setBorder(null);
        btn_postGraduate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_postGraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_postGraduateActionPerformed(evt);
            }
        });

        btn_FoundationClass.setBackground(new java.awt.Color(237, 28, 36));
        btn_FoundationClass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_FoundationClass.setForeground(new java.awt.Color(255, 255, 255));
        btn_FoundationClass.setText("Foundation Courses   ");
        btn_FoundationClass.setBorder(null);
        btn_FoundationClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_FoundationClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FoundationClassActionPerformed(evt);
            }
        });

        btn_InternationalStudent.setBackground(new java.awt.Color(237, 28, 36));
        btn_InternationalStudent.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_InternationalStudent.setForeground(new java.awt.Color(255, 255, 255));
        btn_InternationalStudent.setText("  International Students");
        btn_InternationalStudent.setBorder(null);
        btn_InternationalStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_InternationalStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InternationalStudentActionPerformed(evt);
            }
        });

        btn_jobPlacements.setBackground(new java.awt.Color(237, 28, 36));
        btn_jobPlacements.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_jobPlacements.setForeground(new java.awt.Color(255, 255, 255));
        btn_jobPlacements.setText("Job Placements         ");
        btn_jobPlacements.setBorder(null);
        btn_jobPlacements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jobPlacements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jobPlacementsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideTabPanelLayout = new javax.swing.GroupLayout(SideTabPanel);
        SideTabPanel.setLayout(SideTabPanelLayout);
        SideTabPanelLayout.setHorizontalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideTabPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43))))
            .addComponent(btn_underGraduate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_postGraduate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_FoundationClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_InternationalStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_jobPlacements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideTabPanelLayout.setVerticalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideTabPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btn_underGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_postGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_FoundationClass, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_InternationalStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_jobPlacements, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/13001.jpg"))); // NOI18N

        CouresesPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout CouresesPaneLayout = new javax.swing.GroupLayout(CouresesPane);
        CouresesPane.setLayout(CouresesPaneLayout);
        CouresesPaneLayout.setHorizontalGroup(
            CouresesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CouresesPaneLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CouresesPaneLayout.setVerticalGroup(
            CouresesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CouresesPaneLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CourseLayout = new javax.swing.GroupLayout(Course);
        Course.setLayout(CourseLayout);
        CourseLayout.setHorizontalGroup(
            CourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseLayout.createSequentialGroup()
                .addComponent(SideTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CouresesPane)
                .addGap(0, 0, 0))
        );
        CourseLayout.setVerticalGroup(
            CourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CouresesPane)
        );

        javax.swing.GroupLayout CoursesPanelLayout = new javax.swing.GroupLayout(CoursesPanel);
        CoursesPanel.setLayout(CoursesPanelLayout);
        CoursesPanelLayout.setHorizontalGroup(
            CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CoursesPanelLayout.setVerticalGroup(
            CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CoursesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CoursesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_underGraduateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_underGraduateMousePressed
        // This will connect another tabbed window inside the same jframe

    }//GEN-LAST:event_btn_underGraduateMousePressed

    private void btn_underGraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_underGraduateActionPerformed
        // TODO add your handling code here:

        UnderGraduate aa = new UnderGraduate();
        CouresesPane.add(aa);
        aa.show();

    }//GEN-LAST:event_btn_underGraduateActionPerformed

    private void btn_postGraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_postGraduateActionPerformed
        // TODO add your handling code here:

        PostGraduate aa = new PostGraduate();
        CouresesPane.add(aa);
        aa.show();
    }//GEN-LAST:event_btn_postGraduateActionPerformed

    private void btn_FoundationClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FoundationClassActionPerformed
        // TODO add your handling code here:
        FoundationYear aa = new FoundationYear();
        CouresesPane.add(aa);
        aa.show();

    }//GEN-LAST:event_btn_FoundationClassActionPerformed

    private void btn_InternationalStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InternationalStudentActionPerformed
        // TODO add your handling code here:

       InternationalStudents aa = new InternationalStudents();
        CouresesPane.add(aa);
        aa.show();
    }//GEN-LAST:event_btn_InternationalStudentActionPerformed

    private void btn_jobPlacementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jobPlacementsActionPerformed
        // TODO add your handling code here:
         JobPlacements aa = new JobPlacements();
        CouresesPane.add(aa);
        aa.show();
    }//GEN-LAST:event_btn_jobPlacementsActionPerformed

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
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane CouresesPane;
    private javax.swing.JPanel Course;
    private javax.swing.JPanel CoursesPanel;
    private javax.swing.JPanel SideTabPanel;
    private javax.swing.JLabel UniversityLogo;
    private javax.swing.JButton btn_FoundationClass;
    private javax.swing.JButton btn_InternationalStudent;
    private javax.swing.JButton btn_jobPlacements;
    private javax.swing.JButton btn_postGraduate;
    private javax.swing.JButton btn_underGraduate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
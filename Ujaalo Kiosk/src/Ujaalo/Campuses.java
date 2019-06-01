/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujaalo;

import Events.EventsNormal;
import Campuses.PatanCollege;
import Campuses.PutteridgeCampus;
import Campuses.MiltonKeynes;
import Campuses.LutonCampus;
import Campuses.AylesburyCampus;
import Campuses.BedfordCampus;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Campuses extends javax.swing.JFrame {

    /**
     * Creates new form Campuses
     */
    public Campuses() {
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

        CampusPanel = new javax.swing.JPanel();
        SideTabPanel = new javax.swing.JPanel();
        UniversityLogo = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        btn_campuses = new javax.swing.JButton();
        btn_courses = new javax.swing.JButton();
        btn_events = new javax.swing.JButton();
        btn_stdLogin = new javax.swing.JButton();
        btn_Prospectus = new javax.swing.JButton();
        icon_help = new javax.swing.JLabel();
        lbl_help = new javax.swing.JLabel();
        BedfordCampus = new javax.swing.JLabel();
        LutonCampus = new javax.swing.JLabel();
        PutterRifgeCampus = new javax.swing.JLabel();
        btn_Bedford = new javax.swing.JButton();
        btn_Luton = new javax.swing.JButton();
        btn_PutterRidge = new javax.swing.JButton();
        Aylesbury = new javax.swing.JLabel();
        btn_AylesBury = new javax.swing.JButton();
        MiltonKeynes = new javax.swing.JLabel();
        btn_MiltonKeynes = new javax.swing.JButton();
        PCPS = new javax.swing.JLabel();
        btn_PCPS = new javax.swing.JButton();
        OurCampuses = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        CampusPanel.setBackground(new java.awt.Color(99, 110, 114));
        CampusPanel.setForeground(new java.awt.Color(99, 110, 114));

        SideTabPanel.setBackground(new java.awt.Color(237, 28, 36));
        SideTabPanel.setMaximumSize(new java.awt.Dimension(270, 768));
        SideTabPanel.setMinimumSize(new java.awt.Dimension(270, 768));

        UniversityLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uu1.png"))); // NOI18N

        btn_home.setBackground(new java.awt.Color(237, 28, 36));
        btn_home.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about.png"))); // NOI18N
        btn_home.setText("     Home       ");
        btn_home.setBorder(null);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_campuses.setBackground(new java.awt.Color(237, 28, 36));
        btn_campuses.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_campuses.setForeground(new java.awt.Color(255, 255, 255));
        btn_campuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Campus.png"))); // NOI18N
        btn_campuses.setText("     Campuses");
        btn_campuses.setBorder(null);
        btn_campuses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_campuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_campusesActionPerformed(evt);
            }
        });

        btn_courses.setBackground(new java.awt.Color(237, 28, 36));
        btn_courses.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_courses.setForeground(new java.awt.Color(255, 255, 255));
        btn_courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coursess.png.png"))); // NOI18N
        btn_courses.setText("       Courses ");
        btn_courses.setBorder(null);
        btn_courses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coursesActionPerformed(evt);
            }
        });

        btn_events.setBackground(new java.awt.Color(237, 28, 36));
        btn_events.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_events.setForeground(new java.awt.Color(255, 255, 255));
        btn_events.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/apply.png"))); // NOI18N
        btn_events.setText("         Events    ");
        btn_events.setBorder(null);
        btn_events.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eventsActionPerformed(evt);
            }
        });

        btn_stdLogin.setBackground(new java.awt.Color(237, 28, 36));
        btn_stdLogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_stdLogin.setForeground(new java.awt.Color(255, 255, 255));
        btn_stdLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentLogin.png"))); // NOI18N
        btn_stdLogin.setText("         Login   ");
        btn_stdLogin.setBorder(null);
        btn_stdLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_stdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stdLoginActionPerformed(evt);
            }
        });

        btn_Prospectus.setBackground(new java.awt.Color(237, 28, 36));
        btn_Prospectus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_Prospectus.setForeground(new java.awt.Color(255, 255, 255));
        btn_Prospectus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prospectus.png"))); // NOI18N
        btn_Prospectus.setText("      Brochure");
        btn_Prospectus.setBorder(null);
        btn_Prospectus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Prospectus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProspectusActionPerformed(evt);
            }
        });

        icon_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help.png"))); // NOI18N
        icon_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_help.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_help.setForeground(new java.awt.Color(255, 255, 255));
        lbl_help.setText("Help");

        javax.swing.GroupLayout SideTabPanelLayout = new javax.swing.GroupLayout(SideTabPanel);
        SideTabPanel.setLayout(SideTabPanelLayout);
        SideTabPanelLayout.setHorizontalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_campuses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_events, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_stdLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Prospectus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideTabPanelLayout.createSequentialGroup()
                        .addComponent(icon_help)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_help)
                        .addGap(31, 31, 31))))
        );
        SideTabPanelLayout.setVerticalGroup(
            SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideTabPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(UniversityLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_campuses, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_events, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_stdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Prospectus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SideTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        BedfordCampus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bedford campus.jpg"))); // NOI18N
        BedfordCampus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        BedfordCampus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BedfordCampus.setMaximumSize(new java.awt.Dimension(340, 260));
        BedfordCampus.setMinimumSize(new java.awt.Dimension(340, 260));
        BedfordCampus.setPreferredSize(new java.awt.Dimension(340, 260));
        BedfordCampus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BedfordCampusMouseClicked(evt);
            }
        });

        LutonCampus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/luton.jpg"))); // NOI18N
        LutonCampus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        LutonCampus.setMaximumSize(new java.awt.Dimension(340, 260));
        LutonCampus.setMinimumSize(new java.awt.Dimension(340, 260));
        LutonCampus.setPreferredSize(new java.awt.Dimension(340, 260));
        LutonCampus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LutonCampusMouseClicked(evt);
            }
        });

        PutterRifgeCampus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Putteridge Bury campus.jpg"))); // NOI18N
        PutterRifgeCampus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        PutterRifgeCampus.setMaximumSize(new java.awt.Dimension(340, 260));
        PutterRifgeCampus.setMinimumSize(new java.awt.Dimension(340, 260));
        PutterRifgeCampus.setPreferredSize(new java.awt.Dimension(340, 260));
        PutterRifgeCampus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PutterRifgeCampusMouseClicked(evt);
            }
        });

        btn_Bedford.setBackground(new java.awt.Color(99, 110, 114));
        btn_Bedford.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Bedford.setForeground(new java.awt.Color(255, 255, 255));
        btn_Bedford.setText("Bedfordshire Campus");
        btn_Bedford.setBorder(null);
        btn_Bedford.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Bedford.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BedfordActionPerformed(evt);
            }
        });

        btn_Luton.setBackground(new java.awt.Color(99, 110, 114));
        btn_Luton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_Luton.setForeground(new java.awt.Color(255, 255, 255));
        btn_Luton.setText("Luton Campus");
        btn_Luton.setBorder(null);
        btn_Luton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Luton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LutonMouseClicked(evt);
            }
        });

        btn_PutterRidge.setBackground(new java.awt.Color(99, 110, 114));
        btn_PutterRidge.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_PutterRidge.setForeground(new java.awt.Color(255, 255, 255));
        btn_PutterRidge.setText("Putteridge Campus");
        btn_PutterRidge.setBorder(null);
        btn_PutterRidge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_PutterRidge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PutterRidgeActionPerformed(evt);
            }
        });

        Aylesbury.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Aylesbury campus.jpg"))); // NOI18N
        Aylesbury.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Aylesbury.setMaximumSize(new java.awt.Dimension(340, 260));
        Aylesbury.setMinimumSize(new java.awt.Dimension(340, 260));
        Aylesbury.setPreferredSize(new java.awt.Dimension(340, 260));
        Aylesbury.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AylesburyMouseClicked(evt);
            }
        });

        btn_AylesBury.setBackground(new java.awt.Color(99, 110, 114));
        btn_AylesBury.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_AylesBury.setForeground(new java.awt.Color(255, 255, 255));
        btn_AylesBury.setText("Aylesbury Campus");
        btn_AylesBury.setBorder(null);
        btn_AylesBury.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AylesBury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AylesBuryActionPerformed(evt);
            }
        });

        MiltonKeynes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/milton keynes1.jpg"))); // NOI18N
        MiltonKeynes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        MiltonKeynes.setMaximumSize(new java.awt.Dimension(340, 260));
        MiltonKeynes.setMinimumSize(new java.awt.Dimension(340, 260));
        MiltonKeynes.setPreferredSize(new java.awt.Dimension(340, 260));
        MiltonKeynes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MiltonKeynesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                MiltonKeynesAncestorRemoved(evt);
            }
        });
        MiltonKeynes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiltonKeynesMouseClicked(evt);
            }
        });

        btn_MiltonKeynes.setBackground(new java.awt.Color(99, 110, 114));
        btn_MiltonKeynes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_MiltonKeynes.setForeground(new java.awt.Color(255, 255, 255));
        btn_MiltonKeynes.setText("Milton Keynes Campus");
        btn_MiltonKeynes.setBorder(null);
        btn_MiltonKeynes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MiltonKeynes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MiltonKeynesActionPerformed(evt);
            }
        });

        PCPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pcps.jpg"))); // NOI18N
        PCPS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        PCPS.setMaximumSize(new java.awt.Dimension(340, 260));
        PCPS.setMinimumSize(new java.awt.Dimension(340, 260));
        PCPS.setPreferredSize(new java.awt.Dimension(340, 260));
        PCPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PCPSMouseClicked(evt);
            }
        });

        btn_PCPS.setBackground(new java.awt.Color(99, 110, 114));
        btn_PCPS.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_PCPS.setForeground(new java.awt.Color(255, 255, 255));
        btn_PCPS.setText("International College PCPS");
        btn_PCPS.setBorder(null);
        btn_PCPS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_PCPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PCPSActionPerformed(evt);
            }
        });

        OurCampuses.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        OurCampuses.setForeground(new java.awt.Color(255, 255, 255));
        OurCampuses.setText("Our Campuses");

        javax.swing.GroupLayout CampusPanelLayout = new javax.swing.GroupLayout(CampusPanel);
        CampusPanel.setLayout(CampusPanelLayout);
        CampusPanelLayout.setHorizontalGroup(
            CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CampusPanelLayout.createSequentialGroup()
                .addComponent(SideTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CampusPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Aylesbury, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_AylesBury, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MiltonKeynes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_MiltonKeynes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CampusPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BedfordCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Bedford, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LutonCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Luton, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_PCPS, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PutterRifgeCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_PutterRidge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PCPS, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(OurCampuses, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        CampusPanelLayout.setVerticalGroup(
            CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideTabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CampusPanelLayout.createSequentialGroup()
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addComponent(OurCampuses, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BedfordCampus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LutonCampus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PutterRifgeCampus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Luton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Bedford, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_PutterRidge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Aylesbury, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MiltonKeynes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CampusPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PCPS, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CampusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AylesBury, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_MiltonKeynes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PCPS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CampusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CampusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed
        // This will connect another tabbed window inside the same jframe

    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_campusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_campusesActionPerformed
        // TODO add your handling code here:
        
        Campuses cgf = new Campuses();
        cgf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_campusesActionPerformed

    private void btn_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coursesActionPerformed
        // TODO add your handling code here:
        
        Courses cos = new Courses();
        cos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_coursesActionPerformed

    private void btn_eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eventsActionPerformed
        // TODO add your handling code here:
         EventsNormal ef= new EventsNormal();
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_eventsActionPerformed

    private void btn_stdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stdLoginActionPerformed
        // TODO add your handling code here:
        RegisterLogin rgf= new RegisterLogin();
        KioskMain kmr= new KioskMain();
        rgf.setVisible(true);
        kmr.dispose();
    }//GEN-LAST:event_btn_stdLoginActionPerformed

    private void btn_ProspectusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProspectusActionPerformed
        // TODO add your handling code here:
        
         try {
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "D:\\Java Project\\Ujaalo Kiosk\\src\\PdfFiles\\Course-Handbook-BSC-CSSE.pdf");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error");
    }
    }//GEN-LAST:event_btn_ProspectusActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        
        KioskMain kgf = new KioskMain();
        kgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_BedfordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BedfordActionPerformed
        // TODO add your handling code here:
        BedfordCampus bgf = new BedfordCampus();
        bgf.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_BedfordActionPerformed

    private void btn_AylesBuryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AylesBuryActionPerformed
        // TODO add your handling code here:
        
        AylesburyCampus acf = new AylesburyCampus();
        acf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AylesBuryActionPerformed

    private void BedfordCampusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BedfordCampusMouseClicked
        // TODO add your handling code here:
        
        BedfordCampus bgf = new BedfordCampus();
        bgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BedfordCampusMouseClicked

    private void LutonCampusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LutonCampusMouseClicked
        // TODO add your handling code here:
        
        LutonCampus lcf = new LutonCampus();
        lcf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LutonCampusMouseClicked

    private void btn_LutonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LutonMouseClicked
        // TODO add your handling code here:
        
        LutonCampus lcf = new LutonCampus();
        lcf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_LutonMouseClicked

    private void PutterRifgeCampusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PutterRifgeCampusMouseClicked
        // TODO add your handling code here:
        PutteridgeCampus pcf = new PutteridgeCampus();
        pcf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_PutterRifgeCampusMouseClicked

    private void btn_PutterRidgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PutterRidgeActionPerformed
        // TODO add your handling code here:
        
        PutteridgeCampus pcf = new PutteridgeCampus();
        pcf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_PutterRidgeActionPerformed

    private void AylesburyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AylesburyMouseClicked
        // TODO add your handling code here:
        
        AylesburyCampus acf = new AylesburyCampus();
        acf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_AylesburyMouseClicked

    private void MiltonKeynesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MiltonKeynesAncestorAdded
        // This will inherit all campuses but a little bit of complicated by Kshitij Bajagain  
       
    }//GEN-LAST:event_MiltonKeynesAncestorAdded

    private void btn_MiltonKeynesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MiltonKeynesActionPerformed
        // TODO add your handling code here:
        
        MiltonKeynes mcf = new MiltonKeynes();
        mcf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_MiltonKeynesActionPerformed

    private void MiltonKeynesAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MiltonKeynesAncestorRemoved
        
        
    }//GEN-LAST:event_MiltonKeynesAncestorRemoved

    private void MiltonKeynesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiltonKeynesMouseClicked
        // TODO add your handling code here:
        
        MiltonKeynes mcf = new MiltonKeynes();
        mcf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MiltonKeynesMouseClicked

    private void PCPSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PCPSMouseClicked
        // TODO add your handling code here:
        PatanCollege pf = new PatanCollege();
        pf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_PCPSMouseClicked

    private void btn_PCPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PCPSActionPerformed
        // TODO add your handling code here:
        PatanCollege pf = new PatanCollege();
        pf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_PCPSActionPerformed

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
            java.util.logging.Logger.getLogger(Campuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aylesbury;
    private javax.swing.JLabel BedfordCampus;
    private javax.swing.JPanel CampusPanel;
    private javax.swing.JLabel LutonCampus;
    private javax.swing.JLabel MiltonKeynes;
    private javax.swing.JLabel OurCampuses;
    private javax.swing.JLabel PCPS;
    private javax.swing.JLabel PutterRifgeCampus;
    private javax.swing.JPanel SideTabPanel;
    private javax.swing.JLabel UniversityLogo;
    private javax.swing.JButton btn_AylesBury;
    private javax.swing.JButton btn_Bedford;
    private javax.swing.JButton btn_Luton;
    private javax.swing.JButton btn_MiltonKeynes;
    private javax.swing.JButton btn_PCPS;
    private javax.swing.JButton btn_Prospectus;
    private javax.swing.JButton btn_PutterRidge;
    private javax.swing.JButton btn_campuses;
    private javax.swing.JButton btn_courses;
    private javax.swing.JButton btn_events;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_stdLogin;
    private javax.swing.JLabel icon_help;
    private javax.swing.JLabel lbl_help;
    // End of variables declaration//GEN-END:variables
}

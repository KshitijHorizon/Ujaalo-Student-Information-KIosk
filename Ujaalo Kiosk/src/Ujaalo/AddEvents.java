/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ujaalo;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author User
 */
public class AddEvents extends javax.swing.JFrame {

    /**
     * Creates new form AddEvents
     */
    
    Connection conn=null;
    OraclePreparedStatement pst=null;
    OracleResultSet rs = null;
    
     String s;
     
     
     
     
     
     
    public AddEvents() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    public void AddEvents(){
        // Databse connectivity with our permanent OracleDatabase class such that it will be more agile(dyanmic)
        
        conn = OracleDatabase.ConnectDb();

     
        try{

            String sql = "insert into  Events(EventsName,Category,Description,Venue,EventDate,NoOfSeats) values(?,?,?,?,?,?)";
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            
            
            pst.setString(1,EventName.getText());
            
            String value=Category.getSelectedItem().toString();
            
            pst.setString(2, value);
            
            pst.setString(3,Description.getText());
            
            pst.setString(4,EventVenue.getText());
           
            pst.setString(5,EventDate.getText());
            
            String value1=TotalSeats.getSelectedItem().toString();
            pst.setString(6, value1);

            rs =(OracleResultSet) pst.executeQuery();

            if (rs.next())
            {
                JOptionPane.showMessageDialog(null,"Adding Successful.Now you will be redirected to login page");

                //Login lgf = new Login();
                //lgf.setVisible(true);
                //this.dispose();
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Adding Events  Unsuccessful.Please fill the  form carefully!!");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    
    
    public void ImageBrowse(){
        
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        
        fileChooser.addChoosableFileFilter(filter);
        
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            label.setIcon(ResizeImage(path));
            s = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Data");
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_validate = new javax.swing.JLabel();
        AddEvents = new javax.swing.JPanel();
        lblAddEvents = new javax.swing.JLabel();
        BackPanel = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lbl_EventName = new javax.swing.JLabel();
        lbl_Category = new javax.swing.JLabel();
        EventName = new javax.swing.JTextField();
        lbl_Venue = new javax.swing.JLabel();
        lbl_EventDate = new javax.swing.JLabel();
        btn_events = new javax.swing.JButton();
        lbl_Description = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        Separator1 = new javax.swing.JSeparator();
        EventVenue = new javax.swing.JTextField();
        Separator2 = new javax.swing.JSeparator();
        EventDate = new datechooser.beans.DateChooserCombo();
        lbl_TotalSeats = new javax.swing.JLabel();
        TotalSeats = new javax.swing.JComboBox<>();
        lbl_validate1 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        EventImage = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        lbl_PriceRate = new javax.swing.JLabel();
        Separator3 = new javax.swing.JSeparator();
        txtPrice = new javax.swing.JTextField();

        lbl_validate.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_validate.setForeground(new java.awt.Color(255, 0, 51));
        lbl_validate.setText("*One or more required information is empty.");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        AddEvents.setBackground(new java.awt.Color(255, 255, 255));
        AddEvents.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));
        AddEvents.setPreferredSize(new java.awt.Dimension(700, 450));

        lblAddEvents.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblAddEvents.setForeground(new java.awt.Color(214, 48, 49));
        lblAddEvents.setText("Add Events");

        BackPanel.setBackground(new java.awt.Color(214, 48, 49));

        lblMinimize.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setText("X");
        lblMinimize.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblMinimizeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMinimize)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addContainerGap())
        );

        lbl_EventName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_EventName.setForeground(new java.awt.Color(214, 48, 49));
        lbl_EventName.setText("Event Name ");

        lbl_Category.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_Category.setForeground(new java.awt.Color(214, 48, 49));
        lbl_Category.setText("Category");

        EventName.setBackground(new java.awt.Color(255, 255, 255));
        EventName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EventName.setForeground(new java.awt.Color(102, 102, 102));
        EventName.setBorder(null);
        EventName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EventNameKeyPressed(evt);
            }
        });

        lbl_Venue.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_Venue.setForeground(new java.awt.Color(214, 48, 49));
        lbl_Venue.setText("Event Venue");

        lbl_EventDate.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_EventDate.setForeground(new java.awt.Color(214, 48, 49));
        lbl_EventDate.setText("Event Date");

        btn_events.setBackground(new java.awt.Color(214, 48, 49));
        btn_events.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_events.setForeground(new java.awt.Color(255, 255, 255));
        btn_events.setText("Add Event");
        btn_events.setBorder(null);
        btn_events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eventsActionPerformed(evt);
            }
        });

        lbl_Description.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_Description.setForeground(new java.awt.Color(214, 48, 49));
        lbl_Description.setText("Description");

        Category.setBackground(new java.awt.Color(255, 255, 255));
        Category.setEditable(true);
        Category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Category.setForeground(new java.awt.Color(102, 102, 102));
        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Campus", "Community" }));
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });

        Description.setBackground(new java.awt.Color(255, 255, 255));
        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Description.setForeground(new java.awt.Color(102, 102, 102));
        Description.setLineWrap(true);
        Description.setRows(5);
        Description.setWrapStyleWord(true);
        Description.setBorder(null);
        jScrollPane1.setViewportView(Description);

        Separator1.setBackground(new java.awt.Color(153, 153, 153));
        Separator1.setForeground(new java.awt.Color(51, 51, 51));
        Separator1.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator1.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator1.setPreferredSize(new java.awt.Dimension(261, 24));

        EventVenue.setBackground(new java.awt.Color(255, 255, 255));
        EventVenue.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        EventVenue.setForeground(new java.awt.Color(102, 102, 102));
        EventVenue.setBorder(null);
        EventVenue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EventVenueKeyPressed(evt);
            }
        });

        Separator2.setBackground(new java.awt.Color(153, 153, 153));
        Separator2.setForeground(new java.awt.Color(51, 51, 51));
        Separator2.setMaximumSize(new java.awt.Dimension(261, 24));
        Separator2.setMinimumSize(new java.awt.Dimension(261, 24));
        Separator2.setPreferredSize(new java.awt.Dimension(261, 24));

        EventDate.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(255, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    EventDate.setCalendarBackground(new java.awt.Color(255, 255, 255));
    EventDate.setCalendarPreferredSize(new java.awt.Dimension(376, 330));
    try {
        EventDate.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2019, 3, 23),
            new java.util.GregorianCalendar(2019, 3, 23))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
    e1.printStackTrace();
    }
    EventDate.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
    EventDate.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 10));

    lbl_TotalSeats.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
    lbl_TotalSeats.setForeground(new java.awt.Color(214, 48, 49));
    lbl_TotalSeats.setText("Total Seats");

    TotalSeats.setBackground(new java.awt.Color(255, 255, 255));
    TotalSeats.setEditable(true);
    TotalSeats.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    TotalSeats.setForeground(new java.awt.Color(102, 102, 102));
    TotalSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

    lbl_validate1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    lbl_validate1.setForeground(new java.awt.Color(255, 0, 51));
    lbl_validate1.setText("*One or more required information is empty.");

    label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

    EventImage.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
    EventImage.setForeground(new java.awt.Color(214, 48, 49));
    EventImage.setText("Event Image");

    btnBrowse.setBackground(new java.awt.Color(214, 48, 49));
    btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
    btnBrowse.setForeground(new java.awt.Color(255, 255, 255));
    btnBrowse.setText("Browse");
    btnBrowse.setBorder(null);
    btnBrowse.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBrowseActionPerformed(evt);
        }
    });

    lbl_PriceRate.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
    lbl_PriceRate.setForeground(new java.awt.Color(214, 48, 49));
    lbl_PriceRate.setText("Price Rate($)");

    Separator3.setBackground(new java.awt.Color(153, 153, 153));
    Separator3.setForeground(new java.awt.Color(51, 51, 51));
    Separator3.setMaximumSize(new java.awt.Dimension(261, 24));
    Separator3.setMinimumSize(new java.awt.Dimension(261, 24));
    Separator3.setPreferredSize(new java.awt.Dimension(261, 24));

    txtPrice.setBackground(new java.awt.Color(255, 255, 255));
    txtPrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
    txtPrice.setForeground(new java.awt.Color(102, 102, 102));
    txtPrice.setBorder(null);
    txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtPriceKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtPriceKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout AddEventsLayout = new javax.swing.GroupLayout(AddEvents);
    AddEvents.setLayout(AddEventsLayout);
    AddEventsLayout.setHorizontalGroup(
        AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEventsLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAddEvents)
            .addGap(392, 392, 392)
            .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(AddEventsLayout.createSequentialGroup()
            .addGap(59, 59, 59)
            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddEventsLayout.createSequentialGroup()
                    .addComponent(lbl_EventName)
                    .addGap(60, 60, 60)
                    .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Separator1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                        .addComponent(EventName))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EventImage)
                    .addGap(108, 108, 108))
                .addGroup(AddEventsLayout.createSequentialGroup()
                    .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_PriceRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_EventDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Description, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Venue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(lbl_TotalSeats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(43, 43, 43)
                    .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddEventsLayout.createSequentialGroup()
                            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Separator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EventVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EventDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEventsLayout.createSequentialGroup()
                                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(150, 150, 150))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEventsLayout.createSequentialGroup()
                                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))))
                        .addGroup(AddEventsLayout.createSequentialGroup()
                            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))))))
        .addGroup(AddEventsLayout.createSequentialGroup()
            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddEventsLayout.createSequentialGroup()
                    .addGap(225, 225, 225)
                    .addComponent(lbl_validate1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddEventsLayout.createSequentialGroup()
                    .addGap(348, 348, 348)
                    .addComponent(btn_events, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    AddEventsLayout.setVerticalGroup(
        AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(AddEventsLayout.createSequentialGroup()
            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddEventsLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(lblAddEvents)
                    .addGap(18, 18, 18)
                    .addComponent(lbl_validate1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddEventsLayout.createSequentialGroup()
                        .addComponent(EventName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_EventName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(EventImage))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddEventsLayout.createSequentialGroup()
                    .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Venue, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddEventsLayout.createSequentialGroup()
                            .addComponent(EventVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_EventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(lbl_TotalSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(AddEventsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_PriceRate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Separator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btn_events, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(AddEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(AddEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        // TODO add your handling code here:
        
                AdminPanel cls = new AdminPanel();
                cls.EventList();
                this.setVisible(false);
        
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btn_eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eventsActionPerformed

        // Databse connectivity with our permanent OracleDatabase class such that it will be more agile(dyanmic)
        
        conn = OracleDatabase.ConnectDb();

     
        try{

            String sql = "insert into  Events(EventsName,Category,Description,Venue,EventDate,NoOfSeats,PriceRate) values(?,?,?,?,?,?,?)";
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,EventName.getText());
            
            String value=Category.getSelectedItem().toString();
            
            pst.setString(2, value);
            
            pst.setString(3,Description.getText());
            
            pst.setString(4,EventVenue.getText());
           
            pst.setString(5,EventDate.getText());
            
            String value1=TotalSeats.getSelectedItem().toString();
            pst.setString(6, value1);
            
            pst.setString(7,txtPrice.getText());
            
            //InputStream is = new FileInputStream(new File(s));
            //pst.setBlob(7,is);
             
            rs =(OracleResultSet) pst.executeQuery();

            if (rs.next())
            {
                JOptionPane.showMessageDialog(null,"Adding Successful.Now you will be redirected to login page");

               
                
                AdminPanel cls = new AdminPanel();
                cls.EventList();
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Adding Events  Unsuccessful.Please fill the  form carefully!!");
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

        //Validation Starts from here

        //if (txt_Password.getText().trim().isEmpty() && txt_UniID.getText().trim().isEmpty() && txt_Email.getText().trim().isEmpty() && txt_EnrolledCourses.getText().trim().isEmpty()){
            //lbl_validate.setText("*One or more required information is empty.");
       // }
    }//GEN-LAST:event_btn_eventsActionPerformed

    private void EventNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventNameKeyPressed
        // TODO add your handling code here:

       // char c =evt.getKeyChar();
        //if(Character.isLetter(c)){
            //lbl_validate.setText("*University ID cannot contain alphabets.");

        //}else{
            //txt_UniID.setEditable(true);
            //lbl_validate.setText("");
        //}
    }//GEN-LAST:event_EventNameKeyPressed

    private void EventVenueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventVenueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventVenueKeyPressed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void lblMinimizeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblMinimizeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinimizeAncestorAdded

    
    
    
    
    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        
        fileChooser.addChoosableFileFilter(filter);
        
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            label.setIcon(ResizeImage(path));
            s = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Data");
        }

    }//GEN-LAST:event_btnBrowseActionPerformed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyPressed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
       
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || c==KeyEvent.VK_DELETE))
        {
            
            Toolkit tk = Toolkit.getDefaultToolkit();
    tk.beep();
            
            evt.consume();
            
            
        }
    }//GEN-LAST:event_txtPriceKeyTyped
  


//Methode To Resize The ImageIcon
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
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
            java.util.logging.Logger.getLogger(AddEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddEvents;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextArea Description;
    private datechooser.beans.DateChooserCombo EventDate;
    private javax.swing.JLabel EventImage;
    private javax.swing.JTextField EventName;
    private javax.swing.JTextField EventVenue;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JComboBox<String> TotalSeats;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btn_events;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblAddEvents;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lbl_Category;
    private javax.swing.JLabel lbl_Description;
    private javax.swing.JLabel lbl_EventDate;
    private javax.swing.JLabel lbl_EventName;
    private javax.swing.JLabel lbl_PriceRate;
    private javax.swing.JLabel lbl_TotalSeats;
    private javax.swing.JLabel lbl_Venue;
    private javax.swing.JLabel lbl_validate;
    private javax.swing.JLabel lbl_validate1;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
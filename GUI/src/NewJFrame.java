
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class NewJFrame extends javax.swing.JFrame {

     ArrayList<Cellphone> myCells = new ArrayList<Cellphone>();
    ArrayList<Wearable> myWear = new ArrayList<Wearable>();
    ArrayList<ExternalBattery> myExBat = new ArrayList<ExternalBattery>();
    ArrayList myAllElectronics = new ArrayList();
    String wearType = "VR HeadSet";
    int capacity;
    public NewJFrame() {
        initComponents();
        parent.setVisible(false);
        panelcellphone.setVisible(false);
        panelwear.setVisible(false);
        panelext.setVisible(false);
        cboxoperator.removeAllItems();
        cboxoperator.addItem("Turkcell");
        cboxoperator.addItem("Vodafone");
        cboxoperator.addItem("AVEA");
        cboxoperator.setSelectedIndex(-1);
        tabbedPaneShow.addTab("Cellphone",showcellpanel );
        tabbedPaneShow.addTab("Wearable", showwearpanel);
        tabbedPaneShow.addTab("External Batary", showextbatpanel);
        tabbedPaneShow.addTab("ALL", showallpanel);
        tabbedPaneShow.setVisible(false);
    }

    public void clearAll(){
        tfbrand.setText("");
        tfid.setText("");
        tfprice.setText("");
        tftype.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        endıs = new javax.swing.JPanel();
        electronicspanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfbrand = new javax.swing.JTextField();
        tfprice = new javax.swing.JTextField();
        tfid = new javax.swing.JTextField();
        tftype = new javax.swing.JTextField();
        rbcell = new javax.swing.JRadioButton();
        rbext = new javax.swing.JRadioButton();
        rbwear = new javax.swing.JRadioButton();
        outputtoggle = new javax.swing.JToggleButton();
        parent = new javax.swing.JPanel();
        panelext = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        spinnercable = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        addexbatbutton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        checkb5 = new javax.swing.JCheckBox();
        checkb7 = new javax.swing.JCheckBox();
        checkb10 = new javax.swing.JCheckBox();
        progbarBat = new javax.swing.JProgressBar();
        panelwear = new javax.swing.JPanel();
        addwearbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        wearslider = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbwearpart = new javax.swing.JLabel();
        panelcellphone = new javax.swing.JPanel();
        addcellbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboxoperator = new javax.swing.JComboBox<>();
        lbpromo = new javax.swing.JLabel();
        tabbedPaneShow = new javax.swing.JTabbedPane();
        showcellpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecell = new javax.swing.JTable();
        showwearpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablewear = new javax.swing.JTable();
        showextbatpanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableext = new javax.swing.JTable();
        showallpanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableall = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        endıs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 3));

        electronicspanel.setBackground(new java.awt.Color(204, 255, 255));
        electronicspanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("           ELECTRONİCS");

        jLabel2.setText("ID");

        jLabel3.setText("BRAND");

        jLabel4.setText("PRİCE");

        jLabel5.setText("TYPE");

        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });

        rbcell.setText("cellphone");
        rbcell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcellActionPerformed(evt);
            }
        });

        rbext.setText("externalbattery");
        rbext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbextActionPerformed(evt);
            }
        });

        rbwear.setText("wearable");
        rbwear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbwearActionPerformed(evt);
            }
        });

        outputtoggle.setText("outputs");
        outputtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputtoggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout electronicspanelLayout = new javax.swing.GroupLayout(electronicspanel);
        electronicspanel.setLayout(electronicspanelLayout);
        electronicspanelLayout.setHorizontalGroup(
            electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(electronicspanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
            .addGroup(electronicspanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(53, 53, 53)
                .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(electronicspanelLayout.createSequentialGroup()
                        .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbext))
                    .addGroup(electronicspanelLayout.createSequentialGroup()
                        .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfid)
                            .addComponent(tftype, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(127, 127, 127)
                        .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbwear)
                            .addComponent(rbcell))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, electronicspanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outputtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        electronicspanelLayout.setVerticalGroup(
            electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(electronicspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbcell)))
                .addGap(1, 1, 1)
                .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(electronicspanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tftype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, electronicspanelLayout.createSequentialGroup()
                        .addComponent(rbwear)
                        .addGap(19, 19, 19)))
                .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(electronicspanelLayout.createSequentialGroup()
                        .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(electronicspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(electronicspanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(rbext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(outputtoggle)
                        .addGap(23, 23, 23))))
        );

        parent.setLayout(new java.awt.CardLayout());

        panelext.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "exrernal battery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel11.setText("custom cable length");

        jLabel12.setText("cm");

        addexbatbutton.setBackground(new java.awt.Color(255, 153, 153));
        addexbatbutton.setText("add external battery");
        addexbatbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addexbatbuttonActionPerformed(evt);
            }
        });

        jLabel13.setText("capacity");

        checkb5.setText("5000");
        checkb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkb5ActionPerformed(evt);
            }
        });

        checkb7.setText("7500");
        checkb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkb7ActionPerformed(evt);
            }
        });

        checkb10.setText("10000");
        checkb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkb10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelextLayout = new javax.swing.GroupLayout(panelext);
        panelext.setLayout(panelextLayout);
        panelextLayout.setHorizontalGroup(
            panelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(panelextLayout.createSequentialGroup()
                        .addComponent(spinnercable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(addexbatbutton))
                .addGap(155, 155, 155)
                .addGroup(panelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelextLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(35, 35, 35)
                        .addComponent(checkb5)
                        .addGap(18, 18, 18)
                        .addComponent(checkb7)
                        .addGap(18, 18, 18)
                        .addComponent(checkb10))
                    .addComponent(progbarBat, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelextLayout.setVerticalGroup(
            panelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(checkb5)
                    .addComponent(checkb7)
                    .addComponent(checkb10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelextLayout.createSequentialGroup()
                        .addGroup(panelextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnercable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addexbatbutton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelextLayout.createSequentialGroup()
                        .addComponent(progbarBat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))))
        );

        parent.add(panelext, "card4");

        panelwear.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "wearable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        addwearbutton.setText("add wear");
        addwearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addwearbuttonActionPerformed(evt);
            }
        });

        jLabel7.setText("gear type");

        wearslider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                wearsliderStateChanged(evt);
            }
        });

        jLabel8.setText("smart watch");

        jLabel9.setText("smart glasses");

        jLabel10.setText("vr headseats");

        lbwearpart.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout panelwearLayout = new javax.swing.GroupLayout(panelwear);
        panelwear.setLayout(panelwearLayout);
        panelwearLayout.setHorizontalGroup(
            panelwearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelwearLayout.createSequentialGroup()
                .addGroup(panelwearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelwearLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel8)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel9)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10))
                    .addGroup(panelwearLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lbwearpart, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(addwearbutton)
                .addGap(22, 22, 22))
            .addGroup(panelwearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addComponent(wearslider, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelwearLayout.setVerticalGroup(
            panelwearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelwearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelwearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(wearslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelwearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelwearLayout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(addwearbutton)
                        .addContainerGap())
                    .addGroup(panelwearLayout.createSequentialGroup()
                        .addGroup(panelwearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbwearpart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        parent.add(panelwear, "card3");

        panelcellphone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "cellphone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        addcellbutton.setText("add cellphone");
        addcellbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcellbuttonActionPerformed(evt);
            }
        });

        jLabel6.setText("operator");

        cboxoperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbpromo.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout panelcellphoneLayout = new javax.swing.GroupLayout(panelcellphone);
        panelcellphone.setLayout(panelcellphoneLayout);
        panelcellphoneLayout.setHorizontalGroup(
            panelcellphoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcellphoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxoperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addcellbutton)
                .addGap(57, 57, 57))
            .addGroup(panelcellphoneLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lbpromo, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        panelcellphoneLayout.setVerticalGroup(
            panelcellphoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcellphoneLayout.createSequentialGroup()
                .addComponent(addcellbutton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelcellphoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelcellphoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxoperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbpromo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        parent.add(panelcellphone, "card2");

        tabbedPaneShow.setBackground(new java.awt.Color(153, 153, 255));

        showcellpanel.setLayout(new javax.swing.OverlayLayout(showcellpanel));

        tablecell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "brand", "price", "operator"
            }
        ));
        jScrollPane1.setViewportView(tablecell);

        showcellpanel.add(jScrollPane1);

        tabbedPaneShow.addTab("tab1", showcellpanel);

        showwearpanel.setLayout(new javax.swing.OverlayLayout(showwearpanel));

        tablewear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "brand", "price", "gear type"
            }
        ));
        jScrollPane2.setViewportView(tablewear);

        showwearpanel.add(jScrollPane2);

        tabbedPaneShow.addTab("tab2", showwearpanel);

        showextbatpanel.setLayout(new javax.swing.OverlayLayout(showextbatpanel));

        tableext.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "brand", "price", "cable length", "capacity"
            }
        ));
        jScrollPane3.setViewportView(tableext);

        showextbatpanel.add(jScrollPane3);

        tabbedPaneShow.addTab("tab3", showextbatpanel);

        showallpanel.setLayout(new javax.swing.OverlayLayout(showallpanel));

        tableall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "device"
            }
        ));
        jScrollPane4.setViewportView(tableall);

        showallpanel.add(jScrollPane4);

        tabbedPaneShow.addTab("tab4", showallpanel);

        javax.swing.GroupLayout endısLayout = new javax.swing.GroupLayout(endıs);
        endıs.setLayout(endısLayout);
        endısLayout.setHorizontalGroup(
            endısLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endısLayout.createSequentialGroup()
                .addComponent(electronicspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(endısLayout.createSequentialGroup()
                .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(endısLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneShow, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        endısLayout.setVerticalGroup(
            endısLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endısLayout.createSequentialGroup()
                .addComponent(electronicspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPaneShow, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(endıs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(endıs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void rbcellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcellActionPerformed
        parent.setVisible(true);
        panelcellphone.setVisible(true);
        panelext.setVisible(false);
        panelwear.setVisible(false);
       
    }//GEN-LAST:event_rbcellActionPerformed

    private void addcellbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcellbuttonActionPerformed
        myCells.add(new Cellphone(Integer.parseInt(tfid.getText()), tfbrand.getText(), tftype.getText(), Double.parseDouble(tfprice.getText()), cboxoperator.getSelectedItem().toString()));
        myAllElectronics.add(myCells.get((myCells.size()-1)));
        lbpromo.setText(myCells.get((myCells.size()-1)).findPromotion());
        clearAll();
    }//GEN-LAST:event_addcellbuttonActionPerformed

    private void rbwearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbwearActionPerformed
        parent.setVisible(true);
        panelwear.setVisible(true);
        panelcellphone.setVisible(false);
        panelext.setVisible(false);
        
    }//GEN-LAST:event_rbwearActionPerformed

    private void rbextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbextActionPerformed
        parent.setVisible(true);
        panelwear.setVisible(false);
        panelcellphone.setVisible(false);
        panelext.setVisible(true);
    }//GEN-LAST:event_rbextActionPerformed

    private void wearsliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_wearsliderStateChanged
        if (wearslider.getValue()==1) {
            wearType = "Smart Watch";
        }else if(wearslider.getValue()==2) {
            wearType = "Smart Glasses";
        }else
            wearType = "VR HeadSet";
        lbwearpart.setText(wearType + " is preferred..");
    }//GEN-LAST:event_wearsliderStateChanged

    private void addwearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addwearbuttonActionPerformed
        myWear.add(new Wearable(Integer.parseInt(tfid.getText()), tfbrand.getText(), tftype.getText(), Double.parseDouble(tfprice.getText()), wearType));
        myAllElectronics.add(myWear.get((myWear.size()-1)));
        clearAll();
    }//GEN-LAST:event_addwearbuttonActionPerformed

    private void checkb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkb5ActionPerformed
        checkb7.setSelected(false);
        checkb10.setSelected(false);
        progbarBat.setValue(33);
        capacity = 5000;
    }//GEN-LAST:event_checkb5ActionPerformed

    private void checkb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkb7ActionPerformed
        checkb5.setSelected(false);
        checkb10.setSelected(false);
        progbarBat.setValue(66);
        capacity = 7500;
    }//GEN-LAST:event_checkb7ActionPerformed

    private void checkb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkb10ActionPerformed
        checkb5.setSelected(false);
        checkb7.setSelected(false);
        progbarBat.setValue(100);
        capacity = 10000;
    }//GEN-LAST:event_checkb10ActionPerformed

    private void addexbatbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addexbatbuttonActionPerformed
        myExBat.add(new ExternalBattery(Integer.parseInt(tfid.getText()), tfbrand.getText(), tftype.getText(), Double.parseDouble(tfprice.getText()), capacity, Integer.parseInt(spinnercable.getValue().toString())));
        myAllElectronics.add(myExBat.get((myExBat.size()-1)));
        clearAll();
    }//GEN-LAST:event_addexbatbuttonActionPerformed

    private void outputtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputtoggleActionPerformed
         int index = 0;
        parent.setVisible(false);
        tabbedPaneShow.setVisible(true);
        //to pass all the data in your arraylist to the table, we need to manage model property of your table
        DefaultTableModel model1 = (DefaultTableModel)tablecell.getModel();
        DefaultTableModel model2 = (DefaultTableModel)tablewear.getModel();
        DefaultTableModel model3 = (DefaultTableModel)tableext.getModel();
        DefaultTableModel model4 = (DefaultTableModel)tableall.getModel();
        //at beginning there will be no row at all.
        model1.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        model4.setRowCount(0);
        //pass your lists to tables one by one
        while (myCells.size() > index) {
           model1.addRow(new Object[]{myCells.get(index).getID(), myCells.get(index).getBrand(),myCells.get(index).getPrice(),myCells.get(index).getOperator()}); 
           index++;
        }
        index=0;
        while (myWear.size() > index) {
           model2.addRow(new Object[]{myWear.get(index).getID(), myWear.get(index).getBrand(),myWear.get(index).getPrice(),myWear.get(index).getBodypart()}); 
           index++;
        }
        index=0;
        while (myExBat.size() > index) {
           model3.addRow(new Object[]{myExBat.get(index).getID(), myExBat.get(index).getBrand(),myExBat.get(index).getPrice(),myExBat.get(index).getCableLength(),myExBat.get(index).getCapacity()}); 
           index++;
        }
        index=0;
        while (myAllElectronics.size() > index) {
            if (myAllElectronics.get(index) instanceof Cellphone) {
                model4.addRow(new Object[]{((Cellphone)(myAllElectronics.get(index))).getID(), "Cellphone"});
            }else if (myAllElectronics.get(index) instanceof Wearable) {
                model4.addRow(new Object[]{((Wearable)(myAllElectronics.get(index))).getID(), "Wearable"});
            }else
                model4.addRow(new Object[]{((ExternalBattery)(myAllElectronics.get(index))).getID(), "Externalbattery"}); 
           index++;
        }
    }//GEN-LAST:event_outputtoggleActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcellbutton;
    private javax.swing.JButton addexbatbutton;
    private javax.swing.JButton addwearbutton;
    private javax.swing.JComboBox<String> cboxoperator;
    private javax.swing.JCheckBox checkb10;
    private javax.swing.JCheckBox checkb5;
    private javax.swing.JCheckBox checkb7;
    private javax.swing.JPanel electronicspanel;
    private javax.swing.JPanel endıs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbpromo;
    private javax.swing.JLabel lbwearpart;
    private javax.swing.JToggleButton outputtoggle;
    private javax.swing.JPanel panelcellphone;
    private javax.swing.JPanel panelext;
    private javax.swing.JPanel panelwear;
    private javax.swing.JPanel parent;
    private javax.swing.JProgressBar progbarBat;
    private javax.swing.JRadioButton rbcell;
    private javax.swing.JRadioButton rbext;
    private javax.swing.JRadioButton rbwear;
    private javax.swing.JPanel showallpanel;
    private javax.swing.JPanel showcellpanel;
    private javax.swing.JPanel showextbatpanel;
    private javax.swing.JPanel showwearpanel;
    private javax.swing.JSpinner spinnercable;
    private javax.swing.JTabbedPane tabbedPaneShow;
    private javax.swing.JTable tableall;
    private javax.swing.JTable tablecell;
    private javax.swing.JTable tableext;
    private javax.swing.JTable tablewear;
    private javax.swing.JTextField tfbrand;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tftype;
    private javax.swing.JSlider wearslider;
    // End of variables declaration//GEN-END:variables
}

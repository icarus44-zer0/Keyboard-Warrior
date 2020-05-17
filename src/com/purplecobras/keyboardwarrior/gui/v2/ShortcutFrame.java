package com.purplecobras.keyboardwarrior.gui.v2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.purplecobras.keyboardwarrior.ShortcutMap;

public class ShortcutFrame extends javax.swing.JFrame {
      // IDE Generated variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel DisplayTextPanel;
      private javax.swing.JLabel General_Label;
      private javax.swing.JLabel Groups_Label;
      private javax.swing.JLabel Help_Label;
      private javax.swing.JPanel InputTextPanel;
      private javax.swing.JLabel Layout_Label;
      private javax.swing.JLabel Logo_Label;
      private javax.swing.JLabel MasterPanelLabel;
      private javax.swing.JPanel Master_LabelPanel;
      private javax.swing.JPanel Master_MainPannel;
      private javax.swing.JPanel Master_SidePanel;
      private javax.swing.JLabel Profile_Label;
      private javax.swing.JLabel SC_Descript_JLabel;
      private static javax.swing.JTextField SC_Descript_JTextField;
      private static javax.swing.JTextField SC_Key_JTextField;
      private javax.swing.JLabel SC_Key_Label;
      private javax.swing.JLabel SC_Value_JLabel;
      private javax.swing.JLabel Share_Label;
      private javax.swing.JLabel Shortcut_Label;
      private javax.swing.JTable Shortcut_Table;
      private javax.swing.JLabel Statistics_Label;
      private javax.swing.JButton addNewButton;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JScrollPane SC_Text_ScrollPane;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JSeparator jSeparator1;
      private static javax.swing.JTextArea SC_TextArea;
      private javax.swing.JButton removeButton;
      private javax.swing.JButton saveButton;
      private javax.swing.ButtonGroup tableButtonGroup;
  
      // Class varibles declaration - do not modify//GEN-BEGIN:variables
      Object[] keys;
      Object[] values;
      Object[][] data;
      private static Shortcut_TableModel shortcut_TableModel = new Shortcut_TableModel() {
          private static final long serialVersionUID = 1L;
      };

    /**
     *
     */
    private static final long serialVersionUID = 1393697328936951472L;

    /**
     * Creates new form ShortcutFrame
     */
    public ShortcutFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableButtonGroup = new javax.swing.ButtonGroup();
        Master_MainPannel = new javax.swing.JPanel();
        Master_LabelPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        MasterPanelLabel = new javax.swing.JLabel();
        Master_SidePanel = new javax.swing.JPanel();
        Logo_Label = new javax.swing.JLabel();
        Layout_Label = new javax.swing.JLabel();
        Shortcut_Label = new javax.swing.JLabel();
        Share_Label = new javax.swing.JLabel();
        Groups_Label = new javax.swing.JLabel();
        Statistics_Label = new javax.swing.JLabel();
        General_Label = new javax.swing.JLabel();
        Help_Label = new javax.swing.JLabel();
        Profile_Label = new javax.swing.JLabel();
        DisplayTextPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Shortcut_Table = new javax.swing.JTable();
        InputTextPanel = new javax.swing.JPanel();
        SC_Value_JLabel = new javax.swing.JLabel();
        SC_Descript_JTextField = new javax.swing.JTextField();
        SC_Key_JTextField = new javax.swing.JTextField();
        SC_Key_Label = new javax.swing.JLabel();
        SC_Descript_JLabel = new javax.swing.JLabel();
        SC_Text_ScrollPane = new javax.swing.JScrollPane();
        SC_TextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        addNewButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Master_MainPannel.setBackground(new java.awt.Color(102, 102, 102));
        Master_MainPannel.setPreferredSize(new java.awt.Dimension(650, 550));

        Master_LabelPanel.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        MasterPanelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MasterPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        MasterPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MasterPanelLabel.setText("Shortcut Manager");
        MasterPanelLabel.setToolTipText("");
        MasterPanelLabel.setPreferredSize(new java.awt.Dimension(140, 30));

        javax.swing.GroupLayout Master_LabelPanelLayout = new javax.swing.GroupLayout(Master_LabelPanel);
        Master_LabelPanel.setLayout(Master_LabelPanelLayout);
        Master_LabelPanelLayout.setHorizontalGroup(
            Master_LabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Master_LabelPanelLayout.createSequentialGroup()
                .addGroup(Master_LabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Master_LabelPanelLayout.createSequentialGroup()
                        .addComponent(MasterPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Master_LabelPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        Master_LabelPanelLayout.setVerticalGroup(
            Master_LabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Master_LabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MasterPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Master_SidePanel.setBackground(new java.awt.Color(51, 51, 51));
        Master_SidePanel.setPreferredSize(new java.awt.Dimension(200, 550));

        Logo_Label.setBackground(new java.awt.Color(11, 11, 11));
        Logo_Label.setForeground(new java.awt.Color(255, 255, 255));
        Logo_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/WHITE_W_HELMET.png"))); // NOI18N

        Layout_Label.setBackground(new java.awt.Color(11, 11, 11));
        Layout_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Layout_Label.setForeground(new java.awt.Color(255, 255, 255));
        Layout_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/006-interface.png"))); // NOI18N
        Layout_Label.setText("Layout");
        Layout_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        Shortcut_Label.setBackground(new java.awt.Color(11, 11, 11));
        Shortcut_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Shortcut_Label.setForeground(new java.awt.Color(255, 255, 255));
        Shortcut_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/computer_1.png"))); // NOI18N
        Shortcut_Label.setText("Shortcuts");
        Shortcut_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        Share_Label.setBackground(new java.awt.Color(11, 11, 11));
        Share_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Share_Label.setForeground(new java.awt.Color(255, 255, 255));
        Share_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/share.png"))); // NOI18N
        Share_Label.setText("Share");
        Share_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        Groups_Label.setBackground(new java.awt.Color(11, 11, 11));
        Groups_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Groups_Label.setForeground(new java.awt.Color(255, 255, 255));
        Groups_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/networking.png"))); // NOI18N
        Groups_Label.setText("Groups");
        Groups_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        Statistics_Label.setBackground(new java.awt.Color(11, 11, 11));
        Statistics_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Statistics_Label.setForeground(new java.awt.Color(255, 255, 255));
        Statistics_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/analytics.png"))); // NOI18N
        Statistics_Label.setText("Statistics");
        Statistics_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        General_Label.setBackground(new java.awt.Color(11, 11, 11));
        General_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        General_Label.setForeground(new java.awt.Color(255, 255, 255));
        General_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/010-configuration.png"))); // NOI18N
        General_Label.setText("General");
        General_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        Help_Label.setBackground(new java.awt.Color(11, 11, 11));
        Help_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Help_Label.setForeground(new java.awt.Color(255, 255, 255));
        Help_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/communication.png"))); // NOI18N
        Help_Label.setText("Help");
        Help_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        Profile_Label.setBackground(new java.awt.Color(11, 11, 11));
        Profile_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Profile_Label.setForeground(new java.awt.Color(255, 255, 255));
        Profile_Label.setIcon(new javax.swing.ImageIcon(("src/com/purplecobras/keyboardwarrior/ico/user.png"))); // NOI18N
        Profile_Label.setText("Profile");
        Profile_Label.setPreferredSize(new java.awt.Dimension(70, 50));

        javax.swing.GroupLayout Master_SidePanelLayout = new javax.swing.GroupLayout(Master_SidePanel);
        Master_SidePanel.setLayout(Master_SidePanelLayout);
        Master_SidePanelLayout.setHorizontalGroup(
            Master_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Master_SidePanelLayout.createSequentialGroup()
                .addGroup(Master_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Logo_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Master_SidePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Shortcut_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Master_SidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Master_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Groups_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Share_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Statistics_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(General_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Help_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Profile_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Master_SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Layout_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Master_SidePanelLayout.setVerticalGroup(
            Master_SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Master_SidePanelLayout.createSequentialGroup()
                .addComponent(Logo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Layout_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Shortcut_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Groups_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Share_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Statistics_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(General_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Help_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Profile_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        /**
         * Table Model Insertion
         */
        DisplayTextPanel.setBackground(new java.awt.Color(102, 102, 102));
        updateTableData();
        Shortcut_Table.setModel(shortcut_TableModel);
        shortcut_TableModel.setData(data);

        jScrollPane3.setViewportView(Shortcut_Table);

        javax.swing.GroupLayout DisplayTextPanelLayout = new javax.swing.GroupLayout(DisplayTextPanel);
        DisplayTextPanel.setLayout(DisplayTextPanelLayout);
        DisplayTextPanelLayout.setHorizontalGroup(
            DisplayTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        DisplayTextPanelLayout.setVerticalGroup(
            DisplayTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayTextPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        InputTextPanel.setBackground(new java.awt.Color(102, 102, 102));

        SC_Value_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SC_Value_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        SC_Value_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SC_Value_JLabel.setText("Shortcut");

        SC_Descript_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        SC_Descript_JTextField.setText("Enter Description");
        SC_Descript_JTextField.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    descriptJTextFieldClicked(evt);
                }
            });

        SC_Key_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        SC_Key_JTextField.setText("Enter Hotkey");
        SC_Key_JTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keyJTextFieldClicked(evt);
            }
        });

        SC_Key_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SC_Key_Label.setForeground(new java.awt.Color(255, 255, 255));
        SC_Key_Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SC_Key_Label.setText("Hotkey");


        SC_Descript_JLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SC_Descript_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        SC_Descript_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SC_Descript_JLabel.setText("Description");

        SC_TextArea.setColumns(20);
        SC_TextArea.setRows(5);
    
        SC_TextArea.setText("Enter Shortcut");
        SC_Text_ScrollPane.setViewportView(SC_TextArea);
        SC_TextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valueJTextAreaClicked(evt);
            }
        });

        javax.swing.GroupLayout InputTextPanelLayout = new javax.swing.GroupLayout(InputTextPanel);
        InputTextPanel.setLayout(InputTextPanelLayout);
        InputTextPanelLayout.setHorizontalGroup(
            InputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputTextPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(InputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputTextPanelLayout.createSequentialGroup()
                        .addComponent(SC_Value_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SC_Text_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputTextPanelLayout.createSequentialGroup()
                        .addComponent(SC_Descript_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SC_Descript_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(InputTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SC_Key_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SC_Key_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        InputTextPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SC_Descript_JTextField, SC_Key_JTextField});

        InputTextPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SC_Descript_JLabel, SC_Key_Label, SC_Value_JLabel});

        InputTextPanelLayout.setVerticalGroup(
            InputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputTextPanelLayout.createSequentialGroup()
                .addGroup(InputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SC_Descript_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SC_Descript_JLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SC_Key_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SC_Key_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InputTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SC_Value_JLabel)
                    .addComponent(SC_Text_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        InputTextPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SC_Descript_JLabel, SC_Key_Label, SC_Value_JLabel});

        InputTextPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SC_Descript_JTextField, SC_Key_JTextField});

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        addNewButton.setBackground(new java.awt.Color(255, 255, 255));
        addNewButton.setText("Add");
        tableButtonGroup.add(addNewButton);
        addNewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewButtonMouseClicked(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        tableButtonGroup.add(removeButton);
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });

        saveButton.setText("Save");
        tableButtonGroup.add(saveButton);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewButton)
                    .addComponent(removeButton)
                    .addComponent(saveButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addNewButton, removeButton, saveButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(removeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addNewButton, removeButton, saveButton});

        javax.swing.GroupLayout Master_MainPannelLayout = new javax.swing.GroupLayout(Master_MainPannel);
        Master_MainPannel.setLayout(Master_MainPannelLayout);
        Master_MainPannelLayout.setHorizontalGroup(
            Master_MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Master_MainPannelLayout.createSequentialGroup()
                .addComponent(Master_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Master_MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Master_MainPannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Master_MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DisplayTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Master_LabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Master_MainPannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InputTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        Master_MainPannelLayout.setVerticalGroup(
            Master_MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Master_MainPannelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Master_LabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisplayTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Master_MainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputTextPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Master_SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Master_MainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Master_MainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public void ShortcutFrame_init(){
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
            java.util.logging.Logger.getLogger(ShortcutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShortcutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShortcutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShortcutFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShortcutFrame().setVisible(true);
            }
        });
    }


    private void addNewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewButtonMouseClicked
        updateShortcutSerFile();
        addNewSCtoSC_MAP();
        updateTableData();
    }

    private static void updateShortcutSerFile() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        shortcut_map.updateShortcutSerFile();
    }

    private static void addNewSCtoSC_MAP() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        String add_key = SC_Key_JTextField.getText();
        String add_value = SC_TextArea.getText();
        shortcut_map.get_Shortcut_Map().put(add_key, add_value);
    }

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        int row = Shortcut_Table.getSelectedRow();
        Object keyRemove = Shortcut_Table.getValueAt(row, 0);
        Object valueRemove = Shortcut_Table.getValueAt(row, 1);
        ShortcutMap scm = ShortcutMap.getInstance();

        if (displayDeleteMessage(valueRemove)==0){
         scm.get_Shortcut_Map().remove(keyRemove);
         scm.updateShortcutSerFile();
         updateTableData();
        }
    }

    private static int displayDeleteMessage(Object valueRemove) {
        JFrame scDeletedPopUpFrame = new JFrame();
        int value = JOptionPane.showConfirmDialog(scDeletedPopUpFrame, valueRemove , "Remove", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(scRemovedPopUp, valueRemove.toString() + "\nShortcut Removed");
        return value;
    }

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonMouseClicked

    private Object[][] concat(Object[] key, Object[] val) {
        Object res[][] = new Object[key.length][2];
        if (key.length != val.length) {
            throw new IllegalArgumentException("lenght are not equal, cannot perform");
        }
        for (int i = 0; i < key.length; i++) {
            res[i][0] = key[i];
            res[i][1] = val[i];
        }
        return res;
    }

    private void updateTableData() {
        ShortcutMap shortcut_map = ShortcutMap.getInstance();
        keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
        values = shortcut_map.get_Shortcut_Map().values().toArray();
        data = concat(keys, values);
        shortcut_TableModel.setData(data);
        Shortcut_Table.setModel(shortcut_TableModel);
        Shortcut_Table.updateUI();
    }

    public void descriptJTextFieldClicked(java.awt.event.MouseEvent evt){
        SC_Descript_JTextField.setText("");
        //SC_Descript_JTextField.setCursor(cursor);
    }

    public void valueJTextAreaClicked(java.awt.event.MouseEvent evt){
        SC_TextArea.setText("");
    }

    public void keyJTextFieldClicked(java.awt.event.MouseEvent evt){
        SC_Key_JTextField.setText("");
    }
}

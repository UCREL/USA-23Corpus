package project1;

import java.util.ArrayList;

/**
 *
 * @author Umar
 */
public class b1 extends javax.swing.JFrame {

    /**
     * Creates new form b1
     */
    read_Utf8 ut=new read_Utf8();
    ArrayList<String> read;                                     //read data from file and  store in it.
    Common_methods cm =new Common_methods();
    public b1() {
        initComponents();
        this.setVisible(true);
        read= ut.read("USAS Urdu Semantic Tagset");                                //read and get data in string
        this.setTitle(read.get(0));
        jCheckBox48.setLabel(read.get(0));
        jCheckBox1.setLabel(read.get(1));
         jCheckBox2.setLabel(read.get(2));
          jCheckBox3.setLabel(read.get(3));
           jCheckBox4.setLabel(read.get(4));
            jCheckBox5.setLabel(read.get(5));
             jCheckBox6.setLabel(read.get(6));
              jCheckBox7.setLabel(read.get(7));
               jCheckBox8.setLabel(read.get(8));
                jCheckBox9.setLabel(read.get(9));
                 jCheckBox10.setLabel(read.get(10));
                  jCheckBox11.setLabel(read.get(11));
                   jCheckBox12.setLabel(read.get(12));
                    jCheckBox13.setLabel(read.get(13));
                     jCheckBox14.setLabel(read.get(14));
                      jCheckBox15.setLabel(read.get(15));
                       jCheckBox16.setLabel(read.get(16));
                        jCheckBox17.setLabel(read.get(17));
                         jCheckBox18.setLabel(read.get(18));
                          jCheckBox19.setLabel(read.get(19));
                           jCheckBox20.setLabel(read.get(20));
                            jCheckBox21.setLabel(read.get(21));
                             jCheckBox22.setLabel(read.get(22));
                              jCheckBox23.setLabel(read.get(23));
                               jCheckBox24.setLabel(read.get(24));
                                jCheckBox25.setLabel(read.get(25));
                                jCheckBox26.setLabel(read.get(26));
                                jCheckBox27.setLabel(read.get(27));
                                jCheckBox28.setLabel(read.get(28));
                                jCheckBox29.setLabel(read.get(29));
                                jCheckBox30.setLabel(read.get(30));
                                jCheckBox31.setLabel(read.get(31));
                                jCheckBox32.setLabel(read.get(32));
                                jCheckBox33.setLabel(read.get(33));
                                jCheckBox34.setLabel(read.get(34));
                                jCheckBox35.setLabel(read.get(35));
                                jCheckBox36.setLabel(read.get(36));
                                jCheckBox37.setLabel(read.get(37));
                                jCheckBox38.setLabel(read.get(38));
                                jCheckBox39.setLabel(read.get(39));
                                jCheckBox40.setLabel(read.get(40));
                                jCheckBox41.setLabel(read.get(41));
                                jCheckBox42.setLabel(read.get(42));
                                jCheckBox43.setLabel(read.get(43));
                                jCheckBox44.setLabel(read.get(44));
                                jCheckBox45.setLabel(read.get(45));
                                jCheckBox46.setLabel(read.get(46));
                                jCheckBox47.setLabel(read.get(47));
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox12.setText("jCheckBox12");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 158;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox12, gridBagConstraints);

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox13.setText("jCheckBox13");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 177;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox13, gridBagConstraints);

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox14.setText("jCheckBox14");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 178;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox14, gridBagConstraints);

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox15.setText("jCheckBox15");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 179;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox15, gridBagConstraints);

        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox16.setText("jCheckBox16");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 180;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox16, gridBagConstraints);

        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox17.setText("jCheckBox17");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 181;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox17, gridBagConstraints);

        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox18.setText("jCheckBox18");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 182;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox18, gridBagConstraints);

        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox19.setText("jCheckBox19");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 185, 0, 0);
        jPanel1.add(jCheckBox19, gridBagConstraints);

        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox20.setText("jCheckBox20");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 185, 0, 0);
        jPanel1.add(jCheckBox20, gridBagConstraints);

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox11.setText("jCheckBox11");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 125;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox11, gridBagConstraints);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 180, 0, 0);
        jPanel1.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox2.setText("jCheckBox2");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 180, 0, 0);
        jPanel1.add(jCheckBox2, gridBagConstraints);

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox3.setText("jCheckBox3");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 180, 0, 0);
        jPanel1.add(jCheckBox3, gridBagConstraints);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 0);
        jPanel1.add(jCheckBox4, gridBagConstraints);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox5.setText("jCheckBox5");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 0);
        jPanel1.add(jCheckBox5, gridBagConstraints);

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox6.setText("jCheckBox6");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 0);
        jPanel1.add(jCheckBox6, gridBagConstraints);

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox7.setText("jCheckBox7");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 33;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 0);
        jPanel1.add(jCheckBox7, gridBagConstraints);

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox8.setText("jCheckBox8");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 0);
        jPanel1.add(jCheckBox8, gridBagConstraints);

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox9.setText("jCheckBox9");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 71;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 0);
        jPanel1.add(jCheckBox9, gridBagConstraints);

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox10.setText("jCheckBox10");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 96;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 180, 0, 15);
        jPanel1.add(jCheckBox10, gridBagConstraints);

        jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox21.setText("jCheckBox21");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 185, 0, 0);
        jPanel1.add(jCheckBox21, gridBagConstraints);

        jCheckBox22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox22.setText("jCheckBox22");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox22, gridBagConstraints);

        jCheckBox23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox23.setText("jCheckBox23");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox23, gridBagConstraints);

        jCheckBox24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox24.setText("jCheckBox24");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox24, gridBagConstraints);

        jCheckBox25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox25.setText("jCheckBx25");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 33;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox25, gridBagConstraints);

        jCheckBox26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox26.setText("jCheckBox26");
        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox26, gridBagConstraints);

        jCheckBox27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox27.setText("jCheckBox27");
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 71;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox27, gridBagConstraints);

        jCheckBox28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox28.setText("jCheckBox28");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 96;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox28, gridBagConstraints);

        jCheckBox29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox29.setText("jCheckBox29");
        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 125;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox29, gridBagConstraints);

        jCheckBox30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox30.setText("jCheckBox30");
        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 158;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox30, gridBagConstraints);

        jCheckBox31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox31.setText("jCheckBox31");
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 177;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox31, gridBagConstraints);

        jCheckBox32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox32.setText("jCheckBox32");
        jCheckBox32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox32ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 178;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox32, gridBagConstraints);

        jCheckBox33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox33.setText("jCheckBox33");
        jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox33ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 179;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox33, gridBagConstraints);

        jCheckBox34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox34.setText("jCheckBox34");
        jCheckBox34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox34ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 180;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox34, gridBagConstraints);

        jCheckBox35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox35.setText("jCheckBox35");
        jCheckBox35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox35ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 181;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox35, gridBagConstraints);

        jCheckBox36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox36.setText("jCheckBox36");
        jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox36ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 182;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 185, 0, 0);
        jPanel1.add(jCheckBox36, gridBagConstraints);

        jCheckBox37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox37.setText("jCheckBox37");
        jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox37ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 93, 0, 0);
        jPanel1.add(jCheckBox37, gridBagConstraints);

        jCheckBox38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox38.setText("jCheckBox38");
        jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox38ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 93, 0, 0);
        jPanel1.add(jCheckBox38, gridBagConstraints);

        jCheckBox39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox39.setText("jCheckBox39");
        jCheckBox39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox39ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 93, 0, 0);
        jPanel1.add(jCheckBox39, gridBagConstraints);

        jCheckBox40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox40.setText("jCheckBox40");
        jCheckBox40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox40ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 93, 0, 0);
        jPanel1.add(jCheckBox40, gridBagConstraints);

        jCheckBox41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox41.setText("jCheckBox41");
        jCheckBox41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox41ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 93, 0, 0);
        jPanel1.add(jCheckBox41, gridBagConstraints);

        jCheckBox42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox42.setText("jCheckBox42");
        jCheckBox42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox42ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 93, 0, 0);
        jPanel1.add(jCheckBox42, gridBagConstraints);

        jCheckBox43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox43.setText("jCheckBox43");
        jCheckBox43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox43ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 41;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 93, 0, 0);
        jPanel1.add(jCheckBox43, gridBagConstraints);

        jCheckBox44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox44.setText("jCheckBox44");
        jCheckBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox44ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 60;
        gridBagConstraints.gridheight = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 93, 0, 0);
        jPanel1.add(jCheckBox44, gridBagConstraints);

        jCheckBox45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox45.setText("jCheckBox45");
        jCheckBox45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox45ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 83;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 93, 0, 0);
        jPanel1.add(jCheckBox45, gridBagConstraints);

        jCheckBox46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox46.setText("jCheckBox46");
        jCheckBox46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox46ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 110;
        gridBagConstraints.gridheight = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 93, 0, 0);
        jPanel1.add(jCheckBox46, gridBagConstraints);

        jCheckBox47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox47.setText("jCheckBox47");
        jCheckBox47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox47ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 141;
        gridBagConstraints.gridheight = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 93, 0, 0);
        jPanel1.add(jCheckBox47, gridBagConstraints);

        jCheckBox48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox48.setText("jCheckBox48");
        jCheckBox48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox48ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 180, 0, 0);
        jPanel1.add(jCheckBox48, gridBagConstraints);

        jButton1.setText("Go to back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 183;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 105, 11, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 731;
        gridBagConstraints.ipady = 667;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox1.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox1.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
         if(jCheckBox2.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox2.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox2.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
         if(jCheckBox3.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox3.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox3.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if(jCheckBox4.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox4.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox4.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if(jCheckBox5.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox5.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox5.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if(jCheckBox6.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox6.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox6.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
         if(jCheckBox7.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox7.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox7.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
         if(jCheckBox8.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox8.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox8.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
         if(jCheckBox9.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox9.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox9.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
         if(jCheckBox19.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox19.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox19.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox38ActionPerformed
         if(jCheckBox38.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox38.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox38.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox38ActionPerformed

    private void jCheckBox32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox32ActionPerformed
         if(jCheckBox32.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox32.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox32.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox32ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed
         if(jCheckBox30.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox30.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox30.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
         if(jCheckBox28.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox28.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox28.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
          if(jCheckBox10.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox10.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox10.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
         if(jCheckBox11.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox11.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox11.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
          if(jCheckBox12.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox12.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox12.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
          if(jCheckBox13.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox13.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox13.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
         if(jCheckBox14.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox14.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox14.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
           if(jCheckBox15.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox15.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox15.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
         if(jCheckBox16.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox16.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox16.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
         if(jCheckBox17.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox17.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox17.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
         if(jCheckBox18.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox18.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox18.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
         if(jCheckBox20.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox20.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox20.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
         if(jCheckBox21.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox21.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox21.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
         if(jCheckBox22.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox22.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox22.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
         if(jCheckBox23.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox23.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox23.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
               if(jCheckBox24.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox24.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox24.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
                if(jCheckBox25.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox25.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox25.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed
                if(jCheckBox26.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox26.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox26.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
               if(jCheckBox27.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox27.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox27.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox29ActionPerformed
              if(jCheckBox29.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox29.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox29.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox29ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed
                 if(jCheckBox31.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox31.getText()));                 //cm.index return index of tagert
        }
        else
        {
            menu. ind=cm.remove(cm.index(jCheckBox31.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox33ActionPerformed
                if(jCheckBox33.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox33.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox33.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox33ActionPerformed

    private void jCheckBox34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox34ActionPerformed
                if(jCheckBox34.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox34.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox34.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox34ActionPerformed

    private void jCheckBox35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox35ActionPerformed
               if(jCheckBox35.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox35.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox35.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox35ActionPerformed

    private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox36ActionPerformed
              if(jCheckBox36.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox36.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox36.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox36ActionPerformed

    private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox37ActionPerformed
               if(jCheckBox37.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox37.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox37.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox37ActionPerformed

    private void jCheckBox39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox39ActionPerformed
                 if(jCheckBox39.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox39.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox39.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox39ActionPerformed

    private void jCheckBox40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox40ActionPerformed
               if(jCheckBox40.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox40.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox40.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox40ActionPerformed

    private void jCheckBox41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox41ActionPerformed
                 if(jCheckBox41.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox41.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox41.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox41ActionPerformed

    private void jCheckBox42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox42ActionPerformed
                if(jCheckBox42.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox42.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox42.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox42ActionPerformed

    private void jCheckBox43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox43ActionPerformed
                if(jCheckBox43.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox43.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox43.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox43ActionPerformed

    private void jCheckBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox44ActionPerformed
                if(jCheckBox44.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox44.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox44.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox44ActionPerformed

    private void jCheckBox45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox45ActionPerformed
              if(jCheckBox45.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox45.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox45.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox45ActionPerformed

    private void jCheckBox46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox46ActionPerformed
                 if(jCheckBox46.isSelected())
        {  
          menu. ind.add(cm.index(jCheckBox46.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox46.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox46ActionPerformed

    private void jCheckBox47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox47ActionPerformed
                if(jCheckBox47.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox47.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox47.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox47ActionPerformed

    private void jCheckBox48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox48ActionPerformed
                   if(jCheckBox48.isSelected())
        {  
           menu.ind.add(cm.index(jCheckBox48.getText()));                 //cm.index return index of tagert
        }
        else
        {
             menu.ind=cm.remove(cm.index(jCheckBox48.getText()),menu.ind);   
        }
    }//GEN-LAST:event_jCheckBox48ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

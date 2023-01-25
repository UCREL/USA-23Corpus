

//======>>>> b1,b2 .... class  means (button1,button2..)  on menu targets ا ,ب  ... respectively.


package project1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


import javax.swing.JOptionPane;


/**
 *
 * @author Umar
 */
public class menu extends javax.swing.JFrame {

    write w=new write();
    read_Utf8 r = new read_Utf8();
    Common_methods cm =new Common_methods();
    static ArrayList<String> ind =new ArrayList<> ();       //used for storing index's
    ArrayList<String> pos =new ArrayList<> ();   
    StringTokenizer st ;
    int i=0;
       
    public menu() {
        initComponents();
        this.setTitle("Graphical User Semantic Annotation Interface (GUSAI)/اردو یو۔ایس۔اے۔سی علم المعانی ٹیگینگ انٹرفیس ");
        pos= r.read("uni-gram_POS"); 
        st=new StringTokenizer(pos.get(i));
        wrd_tf.setText(st.nextToken());
        pos_tf.setText(st.nextToken());
        i++;
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        wrd_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pos_tf = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("چ ۔  مال اور تجارت");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 506, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("ش ۔  نفسیاتی سرگرمیاں، کیفیات اور افعال");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 714, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("ح ۔ تفریح، کھیل کود اور غیر نصابی سرگرمیاں");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 506, 246, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("ص ۔ سائنس اور ٹیکنالوجی");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 714, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("خ ۔ زندگی اور زندہ چیزیں");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 558, 124, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("ض ۔ نام اور قواعدی اصطلاحات");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 714, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("د ۔ نقل و حرکت، محل و قوع، سیر و سیاحت اور سواری");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 558, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("ڈ ۔ اشاری اعداد اور پیمائش");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 558, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("ذ ۔ مادہ، سامان، اشیاء اور آلات");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 610, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("ر ۔ تعلیم");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 610, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("ڑ ۔ لسانی عوامل، روداد اور افعال");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 610, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("ز ۔ سماجی سرگرمیاں، کیفیات اور عوامل");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 662, -1, -1));
        
        title1.setBackground(new java.awt.Color(51, 0, 255));
        title1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        title1.setText("اردو یو۔ایس۔اے۔سی علم المعانی ٹیگینگ انٹرفیس");
        title1.setAlignmentX(CENTER_ALIGNMENT);
        jPanel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 27, 502, 47));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("ب ۔ جسم اور انفرادی خصوصیات");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 402, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("پ ۔ فنون اور دستکاری");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 402, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("ت ۔ جذباتی عوامل، کیفیات اور طریقہ کار");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 454, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("ث ۔ طرز حکومت اور سرکاری دائرہ اختیار");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 454, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("ژ ۔ وقت");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 662, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("ج ۔ فن تعمیر، عمارتیں، مکانات اور گھر");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 506, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("س ۔ کائنات اور ہماری فضا");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 662, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ا ۔ عمومی اور ماحصل اصطلاحات");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 402, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ٹ ۔ خوراک اور کاشت کاری");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 454, -1, -1));

        jButton2.setText("مزید ٹیگز منتخب کریں");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 421, -1, -1));

        jButton3.setText("مزید ٹیگز منتخب کریں");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 421, -1, -1));

        jButton4.setText("مزید ٹیگز منتخب کریں");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 473, -1, -1));

        jButton5.setText("مزید ٹیگز منتخب کریں");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 473, -1, -1));

        jButton6.setText("مزید ٹیگز منتخب کریں");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 473, -1, -1));

        jButton7.setText("مزید ٹیگز منتخب کریں");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 525, -1, -1));

        jButton8.setText("مزید ٹیگز منتخب کریں");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 525, -1, -1));

        jButton9.setText("مزید ٹیگز منتخب کریں");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 525, -1, -1));

        jButton10.setText("مزید ٹیگز منتخب کریں");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 577, -1, -1));

        jButton11.setText("مزید ٹیگز منتخب کریں");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 577, -1, -1));

        jButton12.setText("مزید ٹیگز منتخب کریں");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 577, -1, -1));

        jButton13.setText("مزید ٹیگز منتخب کریں");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 629, -1, -1));

        jButton14.setText("مزید ٹیگز منتخب کریں");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 629, -1, -1));

        jButton15.setText("مزید ٹیگز منتخب کریں");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 629, -1, -1));

        jButton16.setText("مزید ٹیگز منتخب کریں");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 681, -1, -1));

        jButton17.setText("مزید ٹیگز منتخب کریں");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 681, -1, -1));

        jButton18.setText("مزید ٹیگز منتخب کریں");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 681, -1, -1));

        jButton19.setText("مزید ٹیگز منتخب کریں");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 733, -1, -1));

        jButton20.setText("مزید ٹیگز منتخب کریں");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 733, -1, -1));

        jButton21.setText("مزید ٹیگز منتخب کریں");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 733, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("لفظ:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1013, 357, 85, 25));

        wrd_tf.setEditable(false);
        wrd_tf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(wrd_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 357, 175, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("پارٹ آف سپیچ:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 108, -1));

        pos_tf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(pos_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 357, 238, -1));

       // jButton22.setBackground(new java.awt.Color(51, 51, 255));
        jButton22.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
       // jButton22.setForeground(new java.awt.Color(153, 153, 153));
        jButton22.setText("سبمٹ");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 868, 86, 31));

       // jButton23.setBackground(new java.awt.Color(51, 51, 255));
        jButton23.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
       // jButton23.setForeground(new java.awt.Color(153, 153, 153));
        jButton23.setText("اگلا");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 868, 86, 31));

       // jButton24.setBackground(new java.awt.Color(51, 51, 255));
        jButton24.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
      //  jButton24.setForeground(new java.awt.Color(153, 153, 153));
        jButton24.setText("خروج");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 868, 86, 31));
        
        String labelText = "مہربانی فرما کر نیچے لکھے گۓ لفظ ایک بڑی تعداد کے ٹیگز کے ساتھ اسطرح لیبل کریں کہ اس کا مطلب واضح ہو جاۓ ۔";
                
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N   
        
        jLabel5.setAlignmentX(CENTER_ALIGNMENT);
        jLabel5.setVisible(true);
        
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 115, 176, 29));

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("مزید ٹیگز منتخب کریں");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 70, 0, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 421, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
      
           ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       }   
      
         new b1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b3();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b4();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b5();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b6();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
           ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b7();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
           ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b8();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                  if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
           ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b9();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
                if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b10();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
               if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b11();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
                if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b12();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
             if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b13();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b14();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
                if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b15();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
               if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b16();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
               if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b17();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
               if(cm.search(wrd_tf.getText()+" "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b18();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b19();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
       } 
        new b20();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
              if(cm.search(wrd_tf.getText()+"      "+pos_tf.getText(), ind))
       {
            ind.add(String.format("%-20s %-20s ", wrd_tf.getText(),pos_tf.getText()));
           //ind.add(wrd_tf.getText()+"      "+pos_tf.getText());
       }  
        new b21();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
         //submit  
        
        w.open();
       try {
           w.write_data(ind);
       } catch (IOException ex) {
          System.out.println(ex);
       }
       w.close();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       //exit 
        System.exit(0);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // go to next
         if(i<=pos.size()-1)                        //check arraylist under limit
        {
        st=new StringTokenizer(pos.get(i));
        wrd_tf.setText(st.nextToken());
        pos_tf.setText(st.nextToken());

            i++;
        }
        else 
        if(i==pos.size())                          //show message if out of limit
        {
            JOptionPane.showMessageDialog(rootPane, "No more Words..!");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pos_tf;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField wrd_tf;
    // End of variables declaration//GEN-END:variables
}

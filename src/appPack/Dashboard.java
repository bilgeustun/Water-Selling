package appPack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    DB db = new DB();

    public Dashboard() {
        initComponents();
        dataResult();
        dataResultSip();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        adTxt = new javax.swing.JTextField();
        telefonTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        musTbl = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        adresTxt = new javax.swing.JTextField();
        soyadTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sipTbl = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        musTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        musTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(musTbl);

        jButton2.setText("Bul");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Düzenle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        adresTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("AD:");

        jLabel2.setText("SOYAD:");

        jLabel3.setText("TELEFON:");

        jLabel4.setText("ADRES:");

        jLabel5.setText("Müşteri Kayıt İşlemleri");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(83, 83, 83)
                .addComponent(jButton4)
                .addGap(67, 67, 67))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(telefonTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                            .addComponent(soyadTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adresTxt)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel5)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(108, 108, 108))
        );

        jButton6.setText("tümünü sil");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("bugünün siparisleri");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        sipTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sipTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sipTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(sipTbl);

        jButton9.setText("yeni sipariş");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("yola çıktı");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("teslim edildi");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("seçili olanı sil");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel6.setText("Sipariş İşlemleri");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton12)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addGap(20, 20, 20))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton12))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

    }//GEN-LAST:event_jPanel3MouseClicked

    private void adresTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ad = adTxt.getText().trim();
        String soyad = soyadTxt.getText().trim();
        String telefon = telefonTxt.getText().trim();
        String adres = adresTxt.getText().trim();
        

        try {
            String query = "INSERT INTO `sumusteri` (`id`, `ad`, `soyad`, `telefon`, `adres`) VALUES (NULL, ?, ?, ?, ?);";
            PreparedStatement pre = db.preBaglan(query);

            pre.setString(1, ad);
            pre.setString(2, soyad);
            pre.setString(3, telefon);
            pre.setString(4, adres);
            int insertStatu = pre.executeUpdate();
            if (insertStatu > 0) {
                dataResult();
            } else {
                // yazma hatası
            }
        } catch (Exception e) {
            System.err.println("Employe Insert Error : " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        bul bul = new bul();
        bul.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    String eid = "";
    private void musTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musTblMouseClicked
        int row = musTbl.getSelectedRow();
        eid = "" + musTbl.getValueAt(row, 0);
        String ad = "" + musTbl.getValueAt(row, 1);
        String soyad = "" + musTbl.getValueAt(row, 2);
        String telefon = "" + musTbl.getValueAt(row, 3);
        String adres = "" + musTbl.getValueAt(row, 4);

        adTxt.setText(ad);
        soyadTxt.setText(soyad);
        telefonTxt.setText(telefon);
        adresTxt.setText(adres);
    }//GEN-LAST:event_musTblMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String ad = adTxt.getText().trim();
        String soyad = soyadTxt.getText().trim();
        String telefon = telefonTxt.getText().trim();
        String adres = adresTxt.getText().trim();

        try {  
            String query = "UPDATE `sumusteri` SET `ad` = ?, `soyad` = ?, `telefon` = ?, `adres` = ? WHERE `sumusteri`.`id` = ? ";

            PreparedStatement pre = db.preBaglan(query);
            pre.setString(1, ad);
            pre.setString(2, soyad);
            pre.setString(3, telefon);
            pre.setString(4, adres);
            pre.setInt(5, Integer.valueOf(eid));
            int updateStatu = pre.executeUpdate();
            if (updateStatu > 0) {
                dataResult();
            }
        } catch (Exception e) {
            System.err.println("update error : " + e);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String query = "DELETE FROM `sumusteri` WHERE `sumusteri`.`id` = ?";
            PreparedStatement pre = db.preBaglan(query);
            pre.setInt(1, Integer.valueOf(eid));
            int deleteStatu = pre.executeUpdate();
            if (deleteStatu > 0) {
                dataResult();
                eid = "";
            }
        } catch (Exception e) {
            System.err.println("Delete Error : " + e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        yeniSiparis yS = new yeniSiparis();
        yS.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    String eidd="";
    private void sipTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sipTblMouseClicked
     int row = sipTbl.getSelectedRow();
     eidd = "" + sipTbl.getValueAt(row, 0);
        /*   int row = sipTbl.getSelectedRow();
        eid = "" + sipTbl.getValueAt(row, 0);
        String ad = "" + sipTbl.getValueAt(row, 1);
        String soyad = "" + sipTbl.getValueAt(row, 2);
        String durum = "" + sipTbl.getValueAt(row, 3);
        String adres = "" + sipTbl.getValueAt(row, 4);
        String tutar = "" + sipTbl.getValueAt(row, 5);

        adTxt.setText(ad);
        soyadTxt.setText(soyad);
        durumTxt.setText(durum);
        adresTxt.setText(adres);
        tutarTxt.setText(tutar);*/
    }//GEN-LAST:event_sipTblMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
            try {//DELETE FROM `susiparisler` WHERE `susiparisler`.`id` = 2 StringBuilder
            String query = "DELETE FROM `susiparisler` WHERE `susiparisler`.`id` = ?";
            
            PreparedStatement pre = db.preBaglan(query);
            pre.setInt(1, Integer.valueOf(eidd));
            int deleteStatu = pre.executeUpdate();
            if (deleteStatu > 0) {
                dataResultSip();
                eidd = "";
            }
        } catch (Exception e) {
            System.err.println("Delete Error : " + e);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {   // UPDATE `susiparisler` SET `durum` = 'dfgdgdfgdfg' WHERE `susiparisler`.`id` = 2;
            String query = "UPDATE `susiparisler` SET `durum` = ? WHERE `susiparisler`.`id` = ?;";
            PreparedStatement pre = db.preBaglan(query);
            pre.setString(1, "yolda");
            pre.setInt(2, Integer.valueOf(eidd));
            int updateStatu = pre.executeUpdate();
            if (updateStatu > 0) {
                dataResultSip();
                eidd = "";
            }
            
        } catch (Exception e) {
             System.err.println("Update Error : " + e);
        }
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            try {   // UPDATE `susiparisler` SET `durum` = 'dfgdgdfgdfg' WHERE `susiparisler`.`id` = 2;
            String query = "UPDATE `susiparisler` SET `durum` = ? WHERE `susiparisler`.`id` = ?;";
            PreparedStatement pre = db.preBaglan(query);
            pre.setString(1, "teslim edildi");
            pre.setInt(2, Integer.valueOf(eidd));
            int updateStatu = pre.executeUpdate();
            if (updateStatu > 0) {
                dataResultSip();
                eidd = "";
            }
            
        } catch (Exception e) {
             System.err.println("Update Error : " + e);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try {//DELETE FROM `susiparisler` WHERE `susiparisler`.`id` = 2
            String query = "DELETE FROM `susiparisler`";
            PreparedStatement pre = db.preBaglan(query);
            int deleteStatu = pre.executeUpdate();
            if (deleteStatu > 0) {
                dataResultSip();
                eidd = "";
            }
        } catch (Exception e) {
            System.err.println("Delete Error : " + e);
        }

        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         
         try {
            DefaultTableModel dtmsip = new DefaultTableModel();
            dtmsip.addColumn("id");
            dtmsip.addColumn("ad");
            dtmsip.addColumn("soyad");
            dtmsip.addColumn("durum");
            dtmsip.addColumn("adres");
            dtmsip.addColumn("tutar");
            dtmsip.addColumn("siparistarihi");
/*
            String query = "SELECT * FROM `susiparisler` WHERE `siparistarihi` = ?";
            PreparedStatement pre = db.preBaglan(query);
            
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            Date siparistarihi =new Date();
            String formattedDate = df.format(siparistarihi);
            
            pre.setDate(1, java.sql.Date.valueOf(formattedDate));
  */          

            String query = "SELECT * FROM `susiparisler` WHERE DATE(`siparistarihi`) = DATE(CURDATE())";
            PreparedStatement pre = db.preBaglan(query);

            ResultSet rsip = pre.executeQuery();
            while (rsip.next()) {
                String id = rsip.getString("id");
                String ad = rsip.getString("ad");
                String soyad = rsip.getString("soyad");
                String durum = rsip.getString("durum");
                String adres = rsip.getString("adres");
                String tutar = rsip.getString("tutar");
                String siparisTarihi = String.valueOf(rsip.getDate("siparistarihi"));
                String[] row = {id, ad, soyad, durum, adres, tutar, siparisTarihi};
                dtmsip.addRow(row);
            }

            sipTbl.setModel(dtmsip);

        } catch (Exception e) {
            System.err.println("delete error: " + e);
        }  
          
    }//GEN-LAST:event_jButton7ActionPerformed

    void dataResult() {
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("id");
            dtm.addColumn("ad");
            dtm.addColumn("soyad");
            dtm.addColumn("telefon");
            dtm.addColumn("adres");

            String query = "SELECT * FROM `sumusteri`";
            PreparedStatement pre = db.preBaglan(query);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String telefon = rs.getString("telefon");
                String adres = rs.getString("adres");
                String[] row = {id, ad, soyad, telefon, adres};
                dtm.addRow(row);
            }

            musTbl.setModel(dtm);

        } catch (Exception e) {
            System.err.println("delete error: " + e);
        }

    }
  
    void dataResultSip(){
    
            try {
            DefaultTableModel dtmsip = new DefaultTableModel();
            dtmsip.addColumn("id");
            dtmsip.addColumn("ad");
            dtmsip.addColumn("soyad");
            dtmsip.addColumn("durum");
            dtmsip.addColumn("adres");
            dtmsip.addColumn("tutar");
            dtmsip.addColumn("siparistarihi");

            String query = "SELECT * FROM `susiparisler` ";
            PreparedStatement pre = db.preBaglan(query);
            ResultSet rsip = pre.executeQuery();
            while (rsip.next()) {
                String id = rsip.getString("id");
                String ad = rsip.getString("ad");
                String soyad = rsip.getString("soyad");
                String durum = rsip.getString("durum");
                String adres = rsip.getString("adres");
                String tutar = rsip.getString("tutar");
                String siparisTarihi = String.valueOf(rsip.getDate("siparistarihi"));
                String[] row = {id, ad, soyad, durum, adres, tutar, siparisTarihi};
                dtmsip.addRow(row);
            }

            sipTbl.setModel(dtmsip);

        } catch (Exception e) {
            System.err.println("delete error: " + e);
        }
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adTxt;
    private javax.swing.JTextField adresTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable musTbl;
    private javax.swing.JTable sipTbl;
    private javax.swing.JTextField soyadTxt;
    private javax.swing.JTextField telefonTxt;
    // End of variables declaration//GEN-END:variables
}

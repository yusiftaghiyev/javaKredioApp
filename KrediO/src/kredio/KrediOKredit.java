llpackage kredio;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Yusif Taghizade
 */
public class KrediOKredit extends javax.swing.JFrame {

    public KrediOKredit() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);

        setIconImage(new ImageIcon("img/icon.png").getImage());

        jLabel5.setIcon(new ImageIcon("img/loan.png"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kredit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        faiz1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        muddet1 = new javax.swing.JTextField();
        buton1 = new javax.swing.JButton();
        kreditbildirim = new javax.swing.JLabel();
        faizbildirim1 = new javax.swing.JLabel();
        muddetbildirim1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        sil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setTitle("Kredit hesablayıcı");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kredit mebleği (AZN)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 52, 194, -1));
        getContentPane().add(kredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 194, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kredit faizi illik (%)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 194, -1));
        getContentPane().add(faiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kreditin müddeti (Ay)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 194, -1));
        getContentPane().add(muddet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 194, -1));

        buton1.setBackground(new java.awt.Color(0, 0, 0));
        buton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buton1.setForeground(new java.awt.Color(255, 255, 255));
        buton1.setText("Hesabla");
        buton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton1ActionPerformed(evt);
            }
        });
        getContentPane().add(buton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 320, 120, -1));

        kreditbildirim.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(kreditbildirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 194, -1));

        faizbildirim1.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(faizbildirim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 194, -1));

        muddetbildirim1.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(muddetbildirim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 194, -1));

        textarea1.setBackground(new java.awt.Color(153, 153, 153));
        textarea1.setColumns(20);
        textarea1.setRows(5);
        textarea1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        textarea1.setEnabled(false);
        jScrollPane2.setViewportView(textarea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 315, 136));

        sil.setBackground(new java.awt.Color(0, 0, 0));
        sil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sil.setForeground(new java.awt.Color(255, 255, 255));
        sil.setText("Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });
        getContentPane().add(sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 70, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton1ActionPerformed

        String bildirim;

        if (kredit.getText().trim().equals("")) {
            bildirim = "Mebleği daxil edin";
            kreditbildirim.setText(bildirim);
        } else if (!kredit.getText().trim().chars().allMatch(Character::isDigit)
                || (Double.parseDouble(kredit.getText().trim()) <= 0)) {

            bildirim = "Mebleği düzgün daxil edin";
            kreditbildirim.setText(bildirim);

        } else {
            kreditbildirim.setText("");
        }

        try {

            if (faiz1.getText().trim().equals("")) {
                bildirim = "Faizi daxil edin";
                faizbildirim1.setText(bildirim);
            } else if ((Double.parseDouble(faiz1.getText().trim()) <= 0)) {

            } else {
                faizbildirim1.setText("");
            }
        } catch (NumberFormatException e) {

            bildirim = "Faizi düzgün daxil edin";
            faizbildirim1.setText(bildirim);

        }

        if (muddet1.getText().trim().equals("")) {
            bildirim = "Müddeti daxil edin";
            muddetbildirim1.setText(bildirim);
        } else if (!muddet1.getText().trim().chars().allMatch(Character::isDigit)
                || (Double.parseDouble(muddet1.getText().trim()) <= 0)) {

            bildirim = "Müddeti düzgün daxil edin";
            muddetbildirim1.setText(bildirim);

        } else {
            muddetbildirim1.setText("");
        }

        if (kreditbildirim.getText().trim().equals("") && faizbildirim1.getText().trim().equals("")
                && muddetbildirim1.getText().trim().equals("")) {

            double abank = Double.parseDouble(kredit.getText());
            double b = Double.parseDouble(faiz1.getText());
            double c = Double.parseDouble(muddet1.getText());

            double boran = b / 100;  //faiz kimi girilen deyiseni edede cevirir
            double aoran = boran / 12; //ayliq faiz orani,istifade edilmir
            double pmt0 = (abank * boran / 12);   //Excell funksiyasi PMT=(a70*boran/12)/(1-(1+boran/12)^(-(c/12)*12))
            double pmt1 = (1 + boran / 12);
            double pmt2 = (-(c / 12) * 12);
            double power = Math.pow(pmt1, pmt2);
            double odenis = (pmt0 / (1 - power));
            double fb = abank * aoran;
            DecimalFormat df = new DecimalFormat("#.##");
            DecimalFormat day = new DecimalFormat("#");

            String netice = "Kreditin mebleği:" + " " + df.format(abank) + " " + "AZN" + "\n"
                    + "Kreditin müddeti:" + " " + day.format(c) + " " + "Ay" + "\n"
                    + "Aylıq ödeniş mebleği:" + " " + df.format(odenis) + " " + "AZN" + "\n"
                    + "Esas borc:" + " " + df.format(abank) + " " + "AZN" + "\n"
                    + "Faiz borcu:" + " " + df.format(((odenis * c) - abank)) + " " + "AZN" + "\n"
                    + "Toplam mebleğ:" + " " + df.format((odenis * c)) + " " + "AZN";

            textarea1.setText(netice);

        }


    }//GEN-LAST:event_buton1ActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        kredit.setText("");
        faiz1.setText("");
        muddet1.setText("");

    }//GEN-LAST:event_silActionPerformed

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
            java.util.logging.Logger.getLogger(KrediOKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KrediOKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KrediOKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KrediOKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KrediOKredit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton1;
    private javax.swing.JTextField faiz1;
    private javax.swing.JLabel faizbildirim1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kredit;
    private javax.swing.JLabel kreditbildirim;
    private javax.swing.JTextField muddet1;
    private javax.swing.JLabel muddetbildirim1;
    private javax.swing.JButton sil;
    private javax.swing.JTextArea textarea1;
    // End of variables declaration//GEN-END:variables

}

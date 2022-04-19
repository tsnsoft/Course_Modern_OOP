package tsn.javase.demo06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Point;

public class Form1 extends javax.swing.JFrame {

    // Текст таймера прописывается в данном месте кода формы вручную!
    javax.swing.Timer jTimer1 = new javax.swing.Timer(1, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 1
            Point p = jLabel1.getLocation();
            if (p.x <= 300) {
                ++p.x;
            } else {
                jTimer1.stop();
                jTimer2.start();
            }
            jLabel1.setLocation(p);
        }
    });

    // Текст таймера прописывается в данном месте кода формы вручную!
    javax.swing.Timer jTimer2 = new javax.swing.Timer(1, new ActionListener() {
        public void actionPerformed(ActionEvent evt) { // МЕТОД ТАЙМЕРА 2
            Point p = jLabel1.getLocation();
            if (p.x >= 30) {
                --p.x;
            } else {
                jTimer2.stop();
                jTimer1.start();
            }
            jLabel1.setLocation(p);
        }
    });

    public Form1() {
        initComponents();

        // Текст таймера прописывается в данном месте кода формы вручную!
        java.util.Timer uTimer1 = new java.util.Timer();
        uTimer1.schedule(new java.util.TimerTask() {
            public void run() {
                jLabel3.setText(new java.text.SimpleDateFormat(
                        "dd-MMM-yy hh:mm:ss").format(java.util.Calendar.getInstance().getTime()));
            }
        }, 0, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с таймерами");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Старт");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 212, 90, 30);

        jButton2.setText("Стоп");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 210, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/demo06/pic.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 80, 90);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 10, 200, 21);

        jProgressBar1.setValue(50);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(20, 280, 220, 40);

        jButton3.setText("Поехали!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 280, 120, 40);

        setSize(new java.awt.Dimension(416, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Запуск таймера
        jTimer1.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Остановка  таймеров
        jTimer1.stop();
        jTimer2.stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = jProgressBar1.getMinimum();
                        i <= jProgressBar1.getMaximum(); i++) {
                    jProgressBar1.setValue(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        th.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpingo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lokesh Chandra
 */
public class Admin_Panel extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Panel
     */
    Timer t;
    static int cn=0;
    InetAddress obj;
    public Admin_Panel() {
        initComponents();
        t=new Timer();
        setLocationRelativeTo(null);
        checkTimer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void checkTimer()
    {
        MysqlConnection msql = new MysqlConnection();
        //   ResultSet rs = null;
        //   Statement stmt = msql.conn.createStatement();
        t.schedule(new TimerTask()
        {
            public void run()
            {
                
                
                try {
                    ResultSet rs = null;
                    Statement stmt = msql.conn.createStatement();
                    rs = stmt.executeQuery("select count(*) from public_gathering");
                    
                    while(rs.next())
                    {
                        if(cn<rs.getInt(1))
                        {
                            cn = rs.getInt(1);
                            notice.setText("NEW MSG");
                        }
                        
                    }
                    
                    
                    try {
                        //networking............

                        obj = InetAddress.getByName("192.168.0.101");
                    } catch (UnknownHostException ex) {
                        Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        if(obj.isReachable(2000))
                        {
                           // System.out.println("Host is reachable");
                            camn1.setText("ONLINE");
                        }
                        else
                        {
                            //System.out.println("Sorry ! ");
                            camn1.setText("OFFLINE");
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        },0, 5000);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sector = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cam01 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        camn2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        notification = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cam02 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cam03 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        notice = new javax.swing.JTextField();
        camn3 = new javax.swing.JTextField();
        camn1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helpingo/images/milobaba.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 350, 510));

        sector.setEditable(false);
        sector.setBackground(new java.awt.Color(255, 255, 255));
        sector.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sector.setForeground(new java.awt.Color(255, 102, 0));
        sector.setBorder(null);
        jPanel1.add(sector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 290, -1));

        title.setEditable(false);
        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 102, 0));
        title.setBorder(null);
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 650));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cam01.setBackground(new java.awt.Color(255, 255, 255));
        cam01.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cam01.setForeground(new java.awt.Color(255, 102, 0));
        cam01.setText("Click");
        cam01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cam01ActionPerformed(evt);
            }
        });
        jPanel2.add(cam01, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 380, 30));

        jLabel6.setFont(new java.awt.Font("HP Simplified Light", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Live Streaming :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 30));

        camn2.setEditable(false);
        camn2.setBackground(new java.awt.Color(255, 102, 0));
        camn2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        camn2.setForeground(new java.awt.Color(0, 0, 0));
        camn2.setText("OFFLINE");
        camn2.setBorder(null);
        camn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camn2ActionPerformed(evt);
            }
        });
        jPanel2.add(camn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 80, 30));

        jLabel7.setFont(new java.awt.Font("HP Simplified Light", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Notification Area :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, 30));

        jLabel8.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Admin Panel");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 280, 50));

        notification.setBackground(new java.awt.Color(255, 255, 255));
        notification.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        notification.setForeground(new java.awt.Color(255, 102, 0));
        notification.setText("Notification");
        notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationActionPerformed(evt);
            }
        });
        jPanel2.add(notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 380, 30));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CAM 01");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        cam02.setBackground(new java.awt.Color(255, 255, 255));
        cam02.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cam02.setForeground(new java.awt.Color(255, 102, 0));
        cam02.setText("Click");
        jPanel2.add(cam02, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 380, 30));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CAM 02");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        cam03.setBackground(new java.awt.Color(255, 255, 255));
        cam03.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cam03.setForeground(new java.awt.Color(255, 102, 0));
        cam03.setText("Click");
        jPanel2.add(cam03, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 380, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CAM 03");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("LIVE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setForeground(new java.awt.Color(255, 102, 0));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 572, 110, 30));

        notice.setEditable(false);
        notice.setBackground(new java.awt.Color(255, 102, 0));
        notice.setFont(new java.awt.Font("DialogInput", 1, 28)); // NOI18N
        notice.setForeground(new java.awt.Color(0, 0, 0));
        notice.setBorder(null);
        jPanel2.add(notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 130, 30));

        camn3.setEditable(false);
        camn3.setBackground(new java.awt.Color(255, 102, 0));
        camn3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        camn3.setForeground(new java.awt.Color(0, 0, 0));
        camn3.setText("OFFLINE");
        camn3.setBorder(null);
        camn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camn3ActionPerformed(evt);
            }
        });
        jPanel2.add(camn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 30));

        camn1.setEditable(false);
        camn1.setBackground(new java.awt.Color(255, 102, 0));
        camn1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        camn1.setForeground(new java.awt.Color(0, 0, 0));
        camn1.setText("OFFLINE");
        camn1.setBorder(null);
        camn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camn1ActionPerformed(evt);
            }
        });
        jPanel2.add(camn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 650, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cam01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cam01ActionPerformed
      
            // TODO add your handling code here:
            
             try{
                ProcessBuilder pb = new ProcessBuilder("python", "F:\\live_stream.py");
                pb.directory(new File("F:\\"));
		Process p = pb.start();
                
                
                }catch(IOException e)
                {
                    System.out.println(e);
}
    }//GEN-LAST:event_cam01ActionPerformed

    private void notificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationActionPerformed
        // TODO add your handling code here:
        String s = notice.getText();
        
        if("NEW MSG".equals(s))
            notice.setText("");
        Notification nf = new Notification();
        nf.setVisible(true);
        
    }//GEN-LAST:event_notificationActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Admin_Login al = new Admin_Login();
        al.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void camn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camn2ActionPerformed

    private void camn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camn3ActionPerformed

    private void camn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cam01;
    private javax.swing.JButton cam02;
    private javax.swing.JButton cam03;
    private javax.swing.JTextField camn1;
    private javax.swing.JTextField camn2;
    private javax.swing.JTextField camn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField notice;
    private javax.swing.JButton notification;
    public javax.swing.JTextField sector;
    public javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}

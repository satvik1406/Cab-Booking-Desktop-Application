/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CabBooking;

/**
 *
 * @author karupakula
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        pwd = new javax.swing.JPasswordField();
        msg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("SIGN UP");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("USER NAME");

        username.setBackground(new java.awt.Color(241, 241, 241));
        username.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USER ID");

        userid.setBackground(new java.awt.Color(241, 241, 241));
        userid.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        userid.setBorder(null);
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(241, 241, 241));
        email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        email.setBorder(null);

        phno.setBackground(new java.awt.Color(241, 241, 241));
        phno.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        phno.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PASSWORD");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-MAIL");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PHONE NUMBER");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        ok.setBackground(new java.awt.Color(0, 0, 0));
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        pwd.setBackground(new java.awt.Color(241, 241, 241));
        pwd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        msg.setBackground(new java.awt.Color(241, 241, 241));
        msg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 81, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancel))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(pwd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phno, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(44, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 310, 500));

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/karupakula/Desktop/blk.JPG")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 310, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/karupakula/Desktop/blue.JPG")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed
    
    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }
    
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        SignupFunc suf = new SignupFunc();

        if(!(suf.isempty(username.getText(),userid.getText(),new String(pwd.getPassword()),email.getText(),phno.getText())))
        {
            if(suf.isuserid(userid.getText()) && suf.isemail(email.getText()) && suf.isphno(phno.getText()))
            {
                
                msg.setText("Registration Successful!");
                suf.writesql(username.getText(),userid.getText(),new String(pwd.getPassword()),email.getText(),phno.getText());
                username.setText("");
                userid.setText("");
                pwd.setText("");
                email.setText("");
                phno.setText("");
                this.setVisible(false);

            }
            else if(!suf.isuserid(userid.getText()) && suf.isemail(email.getText()) && suf.isphno(phno.getText()))
            {
                msg.setText("Userid already exists");
                username.setText(username.getText());
                userid.setText("");
                pwd.setText(new String(pwd.getPassword()));
                email.setText(email.getText());
                phno.setText(phno.getText());
            }
            else if(suf.isuserid(userid.getText()) && !suf.isemail(email.getText()) && suf.isphno(phno.getText()))
            {
                msg.setText("Invalid E-mail Address");
                username.setText(username.getText());
                userid.setText(userid.getText());
                pwd.setText(new String(pwd.getPassword()));
                email.setText("");
                phno.setText(phno.getText());
            }
            else if(suf.isuserid(userid.getText()) && suf.isemail(email.getText()) && !suf.isphno(phno.getText()))
            {
                msg.setText("Invalid Phone Number");
                username.setText(username.getText());
                userid.setText(userid.getText());
                pwd.setText(new String(pwd.getPassword()));
                email.setText(email.getText());
                phno.setText("");
            }
            else if(suf.isuserid(userid.getText()) && !suf.isemail(email.getText()) && !suf.isphno(phno.getText()))
            {
                msg.setText("Invalid Phone Number and Email id");
                username.setText(username.getText());
                userid.setText(userid.getText());
                pwd.setText(new String(pwd.getPassword()));
                email.setText("");
                phno.setText("");
            }
            else if(!suf.isuserid(userid.getText()) && suf.isemail(email.getText()) && !suf.isphno(phno.getText()))
            {
                msg.setText("Invalid Phone Number and User ID");
                username.setText(username.getText());
                userid.setText("");
                pwd.setText(new String(pwd.getPassword()));
                email.setText(email.getText());
                phno.setText("");
            }
            else if(!suf.isuserid(userid.getText()) && !suf.isemail(email.getText()) && suf.isphno(phno.getText()))
            {
                msg.setText("Invalid Email and User ID");
                username.setText(username.getText());
                userid.setText("");
                pwd.setText(new String(pwd.getPassword()));
                email.setText("");
                phno.setText(phno.getText());
            }
            else
            {
                msg.setText("Please fill the valid Inputs");
                username.setText(username.getText());
                userid.setText("");
                pwd.setText(new String(pwd.getPassword()));
                email.setText("");
                phno.setText("");        
            }
        }
        else
        {
            msg.setText("Oops, Please fill all the fields");
            username.setText("");
            userid.setText("");
            pwd.setText("");
            email.setText("");
            phno.setText("");
        }

    }//GEN-LAST:event_okActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        username.setText("");
        userid.setText("");
        pwd.setText("");
        email.setText("");
        phno.setText("");
        msg.setText("");
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel msg;
    private javax.swing.JButton ok;
    private javax.swing.JTextField phno;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField userid;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
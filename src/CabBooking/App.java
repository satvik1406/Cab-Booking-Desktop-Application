/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CabBooking;

import java.util.Timer;
import java.util.TimerTask;
import static javax.management.Query.value;

/**
 *
 * @author karupakula
 */
public class App extends javax.swing.JFrame {

    Customer customer = new Customer();
    HomeFunc homefu = new HomeFunc();
    Driver driver = new Driver();
    int c=0;
    /**
     * Creates new form App
     */
    public App() {
        initComponents();
    }
    
    public App(String userid)
    {
        initComponents();
        customer.getcontent(userid);
        welcome.setText(customer.username + "!");
        accbal.setText(customer.accbal);
        
        if(Integer.parseInt(customer.accbal)<300)
            msg.setText("*Low Balance!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accbal = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        addmoney = new javax.swing.JButton();
        progress = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        from = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        to = new javax.swing.JComboBox<>();
        ridenow = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fare = new javax.swing.JLabel();
        dname = new javax.swing.JLabel();
        car = new javax.swing.JLabel();
        carid = new javax.swing.JLabel();
        dphno = new javax.swing.JLabel();
        msg2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dist = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(248, 248, 250));

        jPanel1.setBackground(new java.awt.Color(248, 248, 250));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Account Balance");

        accbal.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        accbal.setText("jLabel3");

        msg.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 0, 0));

        addmoney.setBackground(new java.awt.Color(0, 0, 0));
        addmoney.setForeground(new java.awt.Color(255, 255, 255));
        addmoney.setText("Add Money");
        addmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmoneyActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Welcome,");

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        welcome.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(welcome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(accbal))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(addmoney)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(msg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accbal)
                .addGap(18, 18, 18)
                .addComponent(msg)
                .addGap(39, 39, 39)
                .addComponent(addmoney)
                .addGap(28, 28, 28)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(248, 248, 250));

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BITSH", "Thumkunta", "Patny", "Secunderabad", "Rasoolpura", " " }));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setText("From:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setText("To:");

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BITSH", "Thumkunta", "Patny", "Secunderabad", "Rasoolpura" }));
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });

        ridenow.setBackground(new java.awt.Color(0, 0, 0));
        ridenow.setForeground(new java.awt.Color(255, 255, 255));
        ridenow.setText("Ride Now");
        ridenow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridenowActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setText("The fare is ");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel7.setText("Driver's Name  ");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel8.setText("Car Model ");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel9.setText("Car Number ");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel10.setText("Driver's Contact Number ");

        fare.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        dname.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        car.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        carid.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        dphno.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        msg2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        msg2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel11.setText("Distance ");

        dist.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Rating ");

        rating.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel Ride");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dphno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fare))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dname))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carid, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(car))))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(dist))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rating)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ridenow, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fare))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dname)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dist)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rating)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(car))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(carid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dphno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msg2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ridenow)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon("/home/karupakula/Desktop/blue.JPG")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("/home/karupakula/Desktop/bottom.JPG")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmoneyActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AddMoney(customer.userid).setVisible(true);
    }//GEN-LAST:event_addmoneyActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toActionPerformed

    private void ridenowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridenowActionPerformed
        // TODO add your handling code her

        if(from.getSelectedItem().toString().equals(to.getSelectedItem().toString()))
        {
            msg2.setText("From and To locations cannot be same");
            dname.setText("");
            dphno.setText("");
            car.setText("");
            carid.setText("");
            fare.setText("");
            dist.setText("");
        }
        else
        {
            customer.calfare(from.getSelectedItem().toString(),to.getSelectedItem().toString());
            fare.setText(Integer.toString(customer.fare));
            dist.setText(Integer.toString(customer.dist));

            if(Integer.parseInt(customer.accbal)>300){
                driver.cald(from.getSelectedItem().toString());
                if(driver.c != 0)
                {
                    dname.setText(driver.dname);
                    dphno.setText(driver.dphno);
                    car.setText(driver.car);
                    carid.setText(driver.carid);
                    rating.setText(driver.rating);
                    msg2.setText("Your cab is booked");

                    c=0;
                    
                    Timer time = new Timer();
                    TimerTask task = new TimerTask(){
                        public void run()
                        {
                            if(c==0){
                            progress.setValue(100);
                            msg2.setText("Your ride is Complete");
                            driver.setstatus();
                            driver.setnearloc(to.getSelectedItem().toString());
                            customer.reducebalance(customer.fare);
                            homefu.trip();
                            accbal.setText(customer.accbal);
                            new Rating(driver.carid).setVisible(true);
                            }
                        }
                    };

                    time.schedule(task,customer.dist*100);
                    
                    
                    Timer timep = new Timer();
                    TimerTask taskp = new TimerTask(){
                        public void run()
                        { 
                            if(c==0)
                                progress.setValue(25);
                        }
                    };
                    time.schedule(taskp,(customer.dist*100)/4);
                    
                    Timer timep2 = new Timer();
                    TimerTask taskp2 = new TimerTask(){
                        public void run()
                        {
                            if(c==0)
                                progress.setValue(50);
                        }
                    };
                    time.schedule(taskp2,(customer.dist*100)/2);
                    
                    Timer timep3 = new Timer();
                    TimerTask taskp3 = new TimerTask(){
                        public void run()
                        {
                            if(c==0)
                                progress.setValue(75);
                        }
                    };
                    time.schedule(taskp3,(customer.dist*100*3)/4);
                    
                }
                else
                {
                    dname.setText("");
                    dphno.setText("");
                    car.setText("");
                    carid.setText("");
                    msg2.setText("Sorry! No cabs available");
                }
            }
            else
            {
                dname.setText("");
                dphno.setText("");
                car.setText("");
                carid.setText("");
                msg2.setText("Please maintain the minimum balance");
            }

        }

    }//GEN-LAST:event_ridenowActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        c = 1;
        driver.setstatus();
        msg2.setText("Your Ride is Cancelled");
        progress.setValue(0);
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accbal;
    private javax.swing.JButton addmoney;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel car;
    private javax.swing.JLabel carid;
    private javax.swing.JLabel dist;
    private javax.swing.JLabel dname;
    private javax.swing.JLabel dphno;
    private javax.swing.JLabel fare;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg2;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel rating;
    private javax.swing.JButton ridenow;
    private javax.swing.JComboBox<String> to;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
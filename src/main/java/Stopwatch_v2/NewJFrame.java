/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stopwatch_v2;

/**
 *
 * @author Asif
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    /**
     * local variable
     */
    
    static int hour = 0;
    static int min = 0;
    static int sec = 0;
    static int milisec = 0;
    
    static boolean state = true;
    
    Thread t;
    
    public NewJFrame() {
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

        jFrame1 = new javax.swing.JFrame();
        lbl_hour = new javax.swing.JLabel();
        jStart = new javax.swing.JButton();
        lbl_min = new javax.swing.JLabel();
        lbl_sec = new javax.swing.JLabel();
        lbl_milisec = new javax.swing.JLabel();
        jStop = new javax.swing.JButton();
        jReset = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_hour.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_hour.setText("00");

        jStart.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jStart.setText("Start");
        jStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartActionPerformed(evt);
            }
        });

        lbl_min.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_min.setText("00");

        lbl_sec.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_sec.setText("00");

        lbl_milisec.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_milisec.setText("00");

        jStop.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jStop.setText("Stop");
        jStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStopActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_hour)
                    .addComponent(jStart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_sec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jReset)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_milisec)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_milisec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartActionPerformed
        // TODO add your handling code here:
        state = true;
        
        t = new Thread(){
            @Override
            public void run(){
                for(;;){
                    if (state == true) {
                    try {
                        sleep(1);
                        if (milisec > 1000) {
                            milisec = 0;
                            sec++;
                        }if (sec > 60) {
                            milisec = 0;
                            sec = 0;
                            min++;
                        }if (min > 60) {
                            milisec = 0;
                            sec = 0;
                            min = 0;
                            hour++;
                        }
                        lbl_milisec.setText(" " + milisec);
                        milisec++;
                        lbl_sec.setText(" " + sec);
                        lbl_min.setText(" " + min);
                        lbl_hour.setText(" "+ hour);
                        
                    } catch (Exception e) {
                        t.interrupt();
                    }
                }
              }
                
            }
        };  
        t.start();  
    }//GEN-LAST:event_jStartActionPerformed

    @SuppressWarnings("deprecation")
    private void jStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStopActionPerformed
        // TODO add your handling code here:
        state = false;
        
                
    }//GEN-LAST:event_jStopActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        // TODO add your handling code here:
        state = false;
        
        hour = 0;
        min = 0;
        sec = 0;
        milisec = 0;
        
        lbl_hour.setText("00");
        lbl_min.setText("00");
        lbl_sec.setText("00");
        lbl_milisec.setText("00");
    }//GEN-LAST:event_jResetActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JButton jReset;
    private javax.swing.JButton jStart;
    private javax.swing.JButton jStop;
    private javax.swing.JLabel lbl_hour;
    private javax.swing.JLabel lbl_milisec;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_sec;
    // End of variables declaration//GEN-END:variables
}

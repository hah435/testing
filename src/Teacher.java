

import com.mongodb.DB;
import com.mongodb.MongoClient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbp
 */
public class Teacher extends javax.swing.JPanel {

    /**
     * Creates new form Teacher
     */
    public static MongoClient conn;
public static DB db;
public static String firstname;
public static String lastname;
public static Login login;
public static MainFrame frame;
    public Teacher(MongoClient connection,DB db1,String firstname,Login t, MainFrame frame) {
        conn=connection;
        db=db1;
        this.firstname=firstname;
        login=t;
        this.frame=frame;
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

        OneBtn = new javax.swing.JButton();
        SectionBtn = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        OneBtn.setText("update one Student");
        OneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneBtnActionPerformed(evt);
            }
        });

        SectionBtn.setText("Update Section");
        SectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SectionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(OneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(SectionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentShown

    private void OneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneBtnActionPerformed
        // TODO add your handling code here:
        TeacherOne teacherOne=new TeacherOne(conn,db,firstname,this,login);
        teacherOne.setSize(frame.getSize());
        frame.add(teacherOne);
         this.setVisible(false);
        
    }//GEN-LAST:event_OneBtnActionPerformed

    private void SectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionBtnActionPerformed
        // TODO add your handling code here:
         TeacherSection teacherSection=new TeacherSection(conn,db,firstname,this,login);
        teacherSection.setSize(frame.getSize());
        frame.add(teacherSection);
         this.setVisible(false);
    }//GEN-LAST:event_SectionBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OneBtn;
    private javax.swing.JButton SectionBtn;
    // End of variables declaration//GEN-END:variables
}

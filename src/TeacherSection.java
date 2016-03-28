



import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbp
 */
public class TeacherSection extends javax.swing.JPanel {

    /**
     * Creates new form TeacherOne
     */
    public static MongoClient conn;
public static DB db;
public static String firstname;

public static Login login;
public static Teacher teacher;
public static String lastname;
public static boolean skip=false;
public static boolean update=false;
    public TeacherSection(MongoClient connection,DB db1,String firstname,Teacher t2,Login t) {
        conn=connection;
        db=db1;
        this.firstname=firstname;
        teacher=t2;
        login=t;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        GradeList = new javax.swing.JList<>();
        LogoutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        FirstnameField = new javax.swing.JTextField();
        MidnameField = new javax.swing.JTextField();
        LastnameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MidField = new javax.swing.JTextField();
        FinalField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        GradeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        GradeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                GradeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(GradeList);

        LogoutBtn.setText("LogOut");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Firstname");

        jLabel2.setText("Midname");

        jLabel3.setText("Lastname");

        jLabel4.setText("Mid");

        jLabel5.setText("Final");

        jLabel6.setText("Note:-1 mean its not ready");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogoutBtn)
                            .addComponent(MidField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackBtn)
                            .addComponent(FinalField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(FirstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(MidnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(14, 14, 14))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MidnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FinalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogoutBtn)
                            .addComponent(BackBtn))
                        .addGap(34, 34, 34)))
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        
         DBCollection coll = db.getCollection("user");
        BasicDBObject andQuery = new BasicDBObject();
        List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
        String username=login.user;
        obj.add(new BasicDBObject("user", username));
        andQuery.put("$and", obj);
        
         DBCursor cursor = coll.find(andQuery);
        while (cursor.hasNext()){
        lastname=cursor.next().get("lastname").toString();
        }
        
        DBCollection coll1 = db.getCollection("teacher");
     
        BasicDBObject andQuery1 = new BasicDBObject();
        List<BasicDBObject> obj1 = new ArrayList<BasicDBObject>();
        obj1.add(new BasicDBObject("firstname", firstname));
        obj1.add(new BasicDBObject("lastname", lastname));
        andQuery1.put("$and", obj1);
        cursor = coll1.find(andQuery1);
        
        while (cursor.hasNext()){
            
         BasicDBList teache = (BasicDBList) cursor.next().get("teach");
        String data[]=new String[teache.size()];
        
         for(int j=0;j<teache.size();++j){
BasicDBObject teach = (BasicDBObject) teache.get(j);
String val=teach.getString("grade")+"-"+teach.getString("section");
data[j]=val;

        }
           GradeList.setListData(data);
        }
      
    }//GEN-LAST:event_formComponentResized

    private void GradeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_GradeListValueChanged
        // TODO add your handling code here:
        if (!evt.getValueIsAdjusting()) {
             String selected = GradeList.getSelectedValue();
             int  grade=0;
           int section=0;
             for(int i=0;i<selected.length();++i){
                 if(selected.charAt(i)=='-'){
                    
                     grade=(int)Double.parseDouble(selected.substring(0,i));
                     section=(int)Double.parseDouble(selected.substring(i+1));
                 }
             }
          
             
       
         DBCollection coll = db.getCollection("student");
BasicDBObject andQuery = new BasicDBObject();
List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
                      
	obj.add(new BasicDBObject("grade", grade));
	obj.add(new BasicDBObject("section", section));
                       
                       
	andQuery.put("$and", obj);
DBCursor cursor = coll.find(andQuery);
while (cursor.hasNext()){
    
    DBObject object=cursor.next();
    this.FirstnameField.setText(object.get("firstname").toString());
    this.MidnameField.setText(object.get("mid_name").toString());
 LastnameField.setText(object.get("lastname").toString());
    
     BasicDBList marks = (BasicDBList)object.get("marks");
     for(int i=0;i<marks.size();++i){
         BasicDBObject mark = (BasicDBObject) marks.get(i);
         if(mark.getString("teacher").equals(firstname)){
    
   if(mark.get("mid")==null){
    
         MidField.setText("-1");
    FinalField.setText("-1");
     
                 
}else if(mark.get("mid")!=null&&mark.get("final")==null){
    
            MidField.setText(mark.getString("mid"));
    FinalField.setText("-1");
}else{
    
     MidField.setText(mark.getString("mid"));
    FinalField.setText(mark.getString("final"));
    
}
    
break;
     }
    
     
     }
   int reply= JOptionPane.showConfirmDialog(null, "if you want to update press yes", "Update or Skip", JOptionPane.YES_NO_OPTION);
    if(reply==JOptionPane.YES_OPTION){
     int   midmark=Integer.parseInt(JOptionPane.showInputDialog("Please input mark for mid: ")) ;
     int   finalmark=Integer.parseInt(JOptionPane.showInputDialog("Please input mark for final: "));
           BasicDBObject andQuery1 = new BasicDBObject();
List<BasicDBObject> obj1 = new ArrayList<BasicDBObject>();
                        obj1.add(new BasicDBObject("firstname", FirstnameField.getText()));
                        obj1.add(new BasicDBObject("mid_name", MidnameField.getText()));
                        obj1.add(new BasicDBObject("lastname", LastnameField.getText()));
	obj1.add(new BasicDBObject("grade", grade));
	obj1.add(new BasicDBObject("section", section));
                       obj1.add(new BasicDBObject("marks.teacher", firstname));
	andQuery1.put("$and", obj1);
        BasicDBObject data = new BasicDBObject();
    if(midmark==-1&&finalmark==-1){
         JOptionPane.showMessageDialog(null, "No data was updated!");
    }else if(midmark!=-1&&finalmark!=-1){
    data.put("marks.$.mid",midmark );
    JOptionPane.showMessageDialog(null, "data was updated .");
    }else{
        data.put("marks.$.mid",midmark );
        data.put("marks.$.final",finalmark );
            JOptionPane.showMessageDialog(null, "data was updated .");

    }
        BasicDBObject command = new BasicDBObject();
    command.put("$set", data);
        coll.update(andQuery1, command);

    }

    
  
        
   
       
  
        
    }
    
}
        
    }//GEN-LAST:event_GradeListValueChanged

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        teacher.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField FinalField;
    private javax.swing.JTextField FirstnameField;
    private javax.swing.JList<String> GradeList;
    private javax.swing.JTextField LastnameField;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JTextField MidField;
    private javax.swing.JTextField MidnameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */
public class book_travel extends javax.swing.JFrame {
    public static int chng = 0;
    /**
     * Creates new form book_travel
     */
    public book_travel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("From");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Bangalore", "Hyderabad", "Chennai", "Mumbai", "Kolkata" }));

        jLabel2.setText("Select type of transport");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Flight");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Train");

        jButton1.setText("Select Travel Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Number of Seats");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox2, 0, 104, Short.MAX_VALUE)
                                .addComponent(jTextField1)))))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rec_date = customer_page1.date;
        String fromm = (String)jComboBox1.getSelectedItem();
        String ty="";
        if(jRadioButton1.isSelected())
        {
            ty = "flight";
        }
        if(jRadioButton2.isSelected())
        {
            ty = "train";
        }
        int found=0;        
       int iid = customer_page1.flag_cus;
       String wss = "";
       
       if(iid==1)
       {
           wss = "Dehradun";
       }
       if(iid==2)
       {
           wss = "Jaipur";
       }
       if(iid==3)
       {
           wss = "Mysore";
       }
       if(iid==4)
       {
           wss = "Agra";
       }
       
       String id = Integer.toString(iid);
       JOptionPane.showMessageDialog(this,"the value of the id is"+id);
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsproj1","root","91069");
            Statement stmt = (Statement)con.createStatement();
            String query = "Select tdate from travel_details where fro = '"+fromm+"' and typee = '"+ty+"' and too = '"+wss+"' and tdate<='"+rec_date+"';";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                String mo = rs.getString("tdate");
                jComboBox2.addItem(mo);
                JOptionPane.showMessageDialog(this,"Click Ok to continue");
                found++;
            }
            if(found==0)
            {
                JOptionPane.showMessageDialog(this,"NOt found");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int seat = Integer.parseInt(jTextField1.getText());
        String costt="";
        String cuss = login1.customer_id;
         String rec_date = customer_page1.date;
        String fromm = (String)jComboBox1.getSelectedItem();
        String ty="";
        if(jRadioButton1.isSelected())
        {
            ty = "flight";
        }
        if(jRadioButton2.isSelected())
        {
            ty = "train";
        }
        String wss = "";
        int found=0;
         int iid = customer_page1.flag_cus;
       if(iid==1)
       {
           wss = "Dehradun";
       }
       if(iid==2)
       {
           wss = "Mysore";
       }
       if(iid==3)
       {
           wss = "Agra";
       }
       if(iid==4)
       {
           wss = "Jaipur";
       }
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsproj1","root","91069");
            Statement stmt = (Statement)con.createStatement();
            String query = "Select cost from travel_cost where fro = '"+fromm+"' and typee = '"+ty+"' and too = '"+wss+"';";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                costt = rs.getString("cost");
                
                JOptionPane.showMessageDialog(this,"Cost received");
                found++;
            }
            if(found==0)
            {
                JOptionPane.showMessageDialog(this,"NOt found");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        
        int cc = Integer.parseInt(costt);
        int tot_cost = seat*cc;
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsProj1","root","91069");
            Statement stmt = (Statement)con.createStatement();
            String ii = "not_paid";
            String query = "insert into payment(c_id,name,cost,status) values ('"+cuss+"','"+ty+"','"+tot_cost+"','"+ii+"');";
            stmt.executeUpdate(query);

            JOptionPane.showMessageDialog(this,"Successfully Added");
            chng = 1;
            this.setVisible(false);
            customer_page2 l = new customer_page2();
            l.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        customer_page2 l = new customer_page2();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(book_travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book_travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book_travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book_travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book_travel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
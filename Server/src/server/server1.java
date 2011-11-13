
package server;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class server1 extends javax.swing.JFrame
{

    /** Creates new form server1 */
    public server1()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Bill Buddy");

        jPanel1.setMaximumSize(new java.awt.Dimension(25000, 25000));
        jPanel1.setMinimumSize(new java.awt.Dimension(440, 302));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 302));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 135, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 135, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/server/bill buddy 1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Adminitrator Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = jTextField2.getText();
        String password = jPasswordField1.getText();

        if (username.length() == 0 && password.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Username and Password fields empty", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        else if (username.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Username field empty", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        else if (password.length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Password field empty", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        else 
        {
            DB database = new DB();
        
            
            try 
            {
                ResultSet result = database.select("Select * from admin");
            
                while (result.next()) 
                { // process results one row at a time
                    //System.out.println(result.getString(1));
                
                    if (result.getString(1).equalsIgnoreCase(username)) 
                    {
                    
                        if (result.getString(2).equalsIgnoreCase(password)) 
                        {
                            JOptionPane.showMessageDialog(null, "Login Successful", "Message", JOptionPane.INFORMATION_MESSAGE);
                            Server server = new Server();
                            server.setVisible(true);
                        } 
                        
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Username or Password Incorrect", "Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }
                    
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Username or Password Incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } 
            
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Cannot access database", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jPasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(
                
                new Runnable()
                {

                    @Override
                    public void run() 
                    {
                        new server1().setVisible(true);
                    }
                }
                
                );
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author r
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Start() {
        initComponents();
    }
    static boolean Maximized = true;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Project = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Maximize = new javax.swing.JLabel();
        Minimized = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Signup = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        Anggotakel = new javax.swing.JLabel();
        doni = new javax.swing.JLabel();
        pranata = new javax.swing.JLabel();
        surya = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(0, 51, 102));

        Panel2.setBackground(new java.awt.Color(255, 255, 255));

        Name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 153, 0));
        Name.setText("HomeBase");

        Project.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Project.setText("Aplikasi Presensi Mahasiwa");

        Close.setIcon(new javax.swing.ImageIcon("C:\\Users\\r\\OneDrive\\Pictures\\ALr\\Icons\\close-button.png")); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        Maximize.setIcon(new javax.swing.ImageIcon("C:\\Users\\r\\OneDrive\\Pictures\\ALr\\Icons\\maximize.png")); // NOI18N
        Maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizeMouseClicked(evt);
            }
        });

        Minimized.setIcon(new javax.swing.ImageIcon("C:\\Users\\r\\OneDrive\\Pictures\\ALr\\Icons\\minimize.png")); // NOI18N
        Minimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Minimized)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Maximize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Close))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(Project, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Close))
                    .addComponent(Maximize)
                    .addComponent(Minimized))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Project)
                .addContainerGap())
        );

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\r\\OneDrive\\Pictures\\ALr\\output-onlinepngtools.png")); // NOI18N

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Signup.setBackground(new java.awt.Color(255, 255, 255));
        Signup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Signup.setText("Sign up");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });

        Panel3.setBackground(new java.awt.Color(0, 51, 102));

        Anggotakel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Anggotakel.setForeground(new java.awt.Color(255, 255, 255));
        Anggotakel.setText("Anggota kelompok:");

        doni.setForeground(new java.awt.Color(255, 255, 255));
        doni.setText("3. Doni indra pratama (71160133)");

        pranata.setForeground(new java.awt.Color(255, 255, 255));
        pranata.setText("1. Pranata Putra (71160082)");

        surya.setForeground(new java.awt.Color(255, 255, 255));
        surya.setText("2. Surya nathaniel kattu (71160108)");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                        .addComponent(pranata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(doni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(surya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Anggotakel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Anggotakel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pranata, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(surya, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Logo)
                    .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(251, 251, 251))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Signup))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logo)
                .addGap(38, 38, 38)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void LoginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        System.exit(0);
    }                    

    private void MaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeMouseClicked
        // TODO add your handling code here:
        if(maximized){
            Start.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            maximized = false;
            Start.this.setMaximizedBounds(env.getMaximumWindowBounds());
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_MaximizeMouseClicked
    static boolean maximized = true;
    
    private void MinimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizedMouseClicked
        // TODO add your handling code here:
        Start.this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizedMouseClicked
    static boolean minimized = true;
    
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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anggotakel;
    private javax.swing.JLabel Close;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Maximize;
    private javax.swing.JLabel Minimized;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JLabel Project;
    private javax.swing.JButton Signup;
    private javax.swing.JLabel doni;
    private javax.swing.JLabel pranata;
    private javax.swing.JLabel surya;
    // End of variables declaration//GEN-END:variables
}

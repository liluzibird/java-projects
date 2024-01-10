
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/*
You need to create a database labeled dial.
* After that I have a method in called from main that will create the necc.
* tables that a person will need.
 */

/**
 *
 * @author mayj
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
JFrame pframe = new JFrame ("Phone Call");
JFrame vframe = new JFrame ("View Tickets");
JFrame eframe = new JFrame ("Employee Add/Del");
viewTicket viewticket = new viewTicket();
    /**
     *
     */
    public main() {
       
         
            pframe.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
            pframe.getContentPane().add (new phoneCall());
            pframe.pack();
              
            vframe.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
            vframe.getContentPane().add (viewticket);
            vframe.pack();
            
            eframe.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
            eframe.getContentPane().add (new pnlAdmin());
            eframe.pack();
            
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

        buttonPhoneCall = new javax.swing.JButton();
        buttonInfo = new javax.swing.JButton();
        mainLogo = new javax.swing.JLabel();
        buttonViewTicket = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPhoneCall.setText("Phone Call");
        buttonPhoneCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPhoneCallActionPerformed(evt);
            }
        });

        buttonInfo.setText("Employees");
        buttonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInfoActionPerformed(evt);
            }
        });

        mainLogo.setText("Helpdesk");

        buttonViewTicket.setText("View Ticket");
        buttonViewTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(mainLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(buttonViewTicket)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(buttonPhoneCall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(buttonInfo)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLogo)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPhoneCall)
                    .addComponent(buttonInfo))
                .addGap(44, 44, 44)
                .addComponent(buttonViewTicket)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPhoneCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPhoneCallActionPerformed
         // TODO add your handling code here:
        buttonPhoneCall.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
     
          
            pframe.setVisible (true);

        }
    });
    }//GEN-LAST:event_buttonPhoneCallActionPerformed

    private void buttonViewTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewTicketActionPerformed
        
        // TODO add your handling code here:
         buttonViewTicket.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            viewticket.db.updateViewRs();//update view rs so next/prev is accurate
            viewticket.updateConsole();//update console in case something else is added
            vframe.setVisible (true);
            
        }
    });
        
    }//GEN-LAST:event_buttonViewTicketActionPerformed

    private void buttonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInfoActionPerformed
         eframe.setVisible (true);
    }//GEN-LAST:event_buttonInfoActionPerformed

    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInfo;
    private javax.swing.JButton buttonPhoneCall;
    private javax.swing.JToggleButton buttonViewTicket;
    private javax.swing.JLabel mainLogo;
    // End of variables declaration//GEN-END:variables
}

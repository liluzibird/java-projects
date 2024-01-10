
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayj
 */
public class viewTicket extends javax.swing.JPanel {
database db = new database();
phonecallTicket ticket;
    /**
     * Creates new form viewTicket
     */
    public viewTicket() {
        initComponents();
        changeWindow();
       
        
       
       ticket = db.getTicket();
        setInfo(db.getTicket());  
        updateConsole();
        db.updateViewRs();
      // populateEmployees();
    }
    
    public void setInfo(phonecallTicket dticket){
   
         this.ticket = dticket;
    textID.setText(Integer.toString(ticket.id));
    textWho.setText(ticket.who);
    textTag.setText(ticket.tag);
    textDate.setText(ticket.date);
    textPhone.setText(ticket.phone);
    textProblem.setText(ticket.problem);
    textNotes.setText(ticket.notes);
    txtStatus.setText(ticket.status);
   
    }
    
    public void updateConsole(){
        console.setText(db.displayAllTickets());
    
   
    }
    //http//www.homeandlearn.co.uk/java/database_scrolling_buttons.html
    
    public void changeWindow(){
      }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        panelContainer = new javax.swing.JPanel();
        panelINFO = new javax.swing.JPanel();
        labelNotes = new javax.swing.JLabel();
        labelProblem = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelCompTag = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelWho = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textID = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textDate = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textTag = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        textPhone = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        textProblem = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        textNotes = new javax.swing.JTextPane();
        labelID = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textWho = new javax.swing.JTextPane();
        btnRow = new javax.swing.JButton();
        textRow = new javax.swing.JTextField();
        btnByID = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnByName = new javax.swing.JButton();
        pnlEdit = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblAssignedTo = new javax.swing.JLabel();
        cbAssigned = new javax.swing.JComboBox(db.getArrayAllEmployees());
        btnView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jscrollpane = new javax.swing.JScrollPane();
        txtStatus = new javax.swing.JTextPane();
        cbStatus = new javax.swing.JComboBox();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAssignedTo = new javax.swing.JTextPane();
        btnSubmitStatus = new javax.swing.JButton();

        jLabel1.setText("View Tickets");

        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        labelNotes.setText("Notes");

        labelProblem.setText("Problem");

        labelTime.setText("Date/Time");

        labelCompTag.setText("Comp Tag #");

        labelPhone.setText("Phone #");

        labelWho.setText("Who");

        jScrollPane2.setViewportView(textID);

        jScrollPane3.setViewportView(textDate);

        jScrollPane4.setViewportView(textTag);

        jScrollPane5.setViewportView(textPhone);

        jScrollPane6.setViewportView(textProblem);

        jScrollPane7.setViewportView(textNotes);

        labelID.setText("ID");

        jScrollPane8.setViewportView(textWho);

        btnRow.setText("ROW");
        btnRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRowActionPerformed(evt);
            }
        });

        textRow.setText("10");

        btnByID.setText("By ID");
        btnByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByIDActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnByName.setText("By Name");
        btnByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByNameActionPerformed(evt);
            }
        });

        lblStatus.setText("Status");

        lblAssignedTo.setText("Assigned To:");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jscrollpane.setViewportView(txtStatus);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New", "In Progress", "On Hold", "Completed" }));

        jScrollPane10.setViewportView(txtAssignedTo);

        btnSubmitStatus.setText("Submit");
        btnSubmitStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAssignedTo)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblStatus)))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAssigned, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btnSubmitStatus)
                        .addGap(27, 27, 27))))
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAssignedTo)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnEdit)
                    .addComponent(btnSubmitStatus))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelINFOLayout = new javax.swing.GroupLayout(panelINFO);
        panelINFO.setLayout(panelINFOLayout);
        panelINFOLayout.setHorizontalGroup(
            panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelINFOLayout.createSequentialGroup()
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelINFOLayout.createSequentialGroup()
                                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelCompTag)
                                            .addComponent(labelTime)
                                            .addComponent(labelPhone)
                                            .addComponent(labelWho)
                                            .addComponent(labelID)
                                            .addComponent(labelProblem))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5)
                                            .addComponent(jScrollPane6)
                                            .addComponent(jScrollPane2)
                                            .addComponent(jScrollPane8)))
                                    .addGroup(panelINFOLayout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(labelNotes)))
                                .addGap(18, 18, 18)
                                .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btnRow)
                                .addGap(18, 18, 18)
                                .addComponent(textRow, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnByID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrevious)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnByName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelINFOLayout.setVerticalGroup(
            panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelINFOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelINFOLayout.createSequentialGroup()
                                .addComponent(labelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelWho)
                                .addGap(1, 1, 1))
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPhone))
                        .addGap(11, 11, 11)
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelINFOLayout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelCompTag, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRow)
                    .addComponent(textRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnByID)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnByName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainerLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(panelINFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainerLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(panelINFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 99, Short.MAX_VALUE)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByIDActionPerformed
       console.setText(db.displayAllTickets());
    }//GEN-LAST:event_btnByIDActionPerformed

    private void btnByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByNameActionPerformed
        console.setText(db.displayNameTickets());
    }//GEN-LAST:event_btnByNameActionPerformed

    private void btnRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRowActionPerformed
        String s = textRow.getText();
        int num = Integer.parseInt(s);
        if(num > db.total() || num < 1)
        {  System.out.println("invalid row");
            JOptionPane.showMessageDialog(null,
                "Invalid row. Must be between 1 and " + db.total());
        }
        else setInfo(db.getRow(num));
    }//GEN-LAST:event_btnRowActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      
        System.out.println(ticket.id + " " + ticket.who);
        setInfo(db.nextTicket(ticket));
        System.out.println("after "+ticket.id);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        setInfo(db.previousTicket(ticket));
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
     cbStatus.setVisible(true);
     cbAssigned.setVisible(true);
    // cbAssigned.setSelectedIndex(5);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
     cbStatus.setVisible(false);
     cbAssigned.setVisible(false);
     
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSubmitStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitStatusActionPerformed
      // db.updateEmployeeStatus(ticket.id, cbStatus.getSelectedIndex());
        db.updateEmployeeStatus(ticket.id, cbStatus.getSelectedIndex());
        setInfo(ticket);
        
    }//GEN-LAST:event_btnSubmitStatusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByID;
    private javax.swing.JButton btnByName;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnRow;
    private javax.swing.JButton btnSubmitStatus;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox cbAssigned;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JTextArea console;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jscrollpane;
    private javax.swing.JLabel labelCompTag;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNotes;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelProblem;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelWho;
    private javax.swing.JLabel lblAssignedTo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelINFO;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JTextPane textDate;
    private javax.swing.JTextPane textID;
    private javax.swing.JTextPane textNotes;
    private javax.swing.JTextPane textPhone;
    private javax.swing.JTextPane textProblem;
    private javax.swing.JTextField textRow;
    private javax.swing.JTextPane textTag;
    private javax.swing.JTextPane textWho;
    private javax.swing.JTextPane txtAssignedTo;
    private javax.swing.JTextPane txtStatus;
    // End of variables declaration//GEN-END:variables
}

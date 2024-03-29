
package View;

public class RenewalTracking extends javax.swing.JPanel {



    

    /**
     * Creates new form RegistrationPanel
     */
    public RenewalTracking() {
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

        viewTeacherButton = new javax.swing.JButton();
        HEADING = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RenewalTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        NoRenewalTable = new javax.swing.JTable();
        RenewalRequiredHeading = new javax.swing.JLabel();
        NoRenewalRequiredHeading = new javax.swing.JLabel();
        RenewButton = new javax.swing.JButton();

        viewTeacherButton.setText("Enroll student");
        viewTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTeacherButtonActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 700));

        HEADING.setBackground(new java.awt.Color(255, 255, 255));
        HEADING.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        HEADING.setForeground(new java.awt.Color(255, 51, 102));
        HEADING.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADING.setText(" List of Students needing Renewal ");

        backButton.setBackground(new java.awt.Color(255, 51, 102));
        backButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 255));

        RenewalTable.setBackground(new java.awt.Color(204, 204, 204));
        RenewalTable.setForeground(new java.awt.Color(0, 51, 51));
        RenewalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STUDENT ID", "FULL NAME", "AGE", " ENROLLMENT DATE", " RENEWAL DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RenewalTable.setSelectionBackground(java.awt.Color.white);
        RenewalTable.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(RenewalTable);

        jScrollPane2.setBackground(new java.awt.Color(0, 102, 255));

        NoRenewalTable.setBackground(new java.awt.Color(204, 204, 204));
        NoRenewalTable.setForeground(new java.awt.Color(0, 51, 51));
        NoRenewalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STUDENT ID", "FULL NAME", "AGE", "ENROLLMENT DATE", "RENEWAL DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        NoRenewalTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        NoRenewalTable.setSelectionForeground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(NoRenewalTable);

        RenewalRequiredHeading.setBackground(new java.awt.Color(204, 255, 255));
        RenewalRequiredHeading.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        RenewalRequiredHeading.setForeground(new java.awt.Color(0, 51, 255));
        RenewalRequiredHeading.setText("RENEWAL ");

        NoRenewalRequiredHeading.setBackground(new java.awt.Color(255, 255, 255));
        NoRenewalRequiredHeading.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        NoRenewalRequiredHeading.setForeground(new java.awt.Color(0, 51, 255));
        NoRenewalRequiredHeading.setText("NON RENEWAL ");

        RenewButton.setBackground(new java.awt.Color(255, 51, 102));
        RenewButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        RenewButton.setForeground(new java.awt.Color(255, 255, 255));
        RenewButton.setText("Renew");
        RenewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RenewalRequiredHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoRenewalRequiredHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(HEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RenewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(HEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(NoRenewalRequiredHeading)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(RenewalRequiredHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RenewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTeacherButtonActionPerformed
       
               
    }//GEN-LAST:event_viewTeacherButtonActionPerformed

    private void RenewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenewButtonActionPerformed
     
    }//GEN-LAST:event_RenewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel HEADING;
    public javax.swing.JLabel NoRenewalRequiredHeading;
    public javax.swing.JTable NoRenewalTable;
    public javax.swing.JButton RenewButton;
    public javax.swing.JLabel RenewalRequiredHeading;
    public javax.swing.JTable RenewalTable;
    public javax.swing.JButton backButton;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewTeacherButton;
    // End of variables declaration//GEN-END:variables
}

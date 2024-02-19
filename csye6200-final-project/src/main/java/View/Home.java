/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Classroom;
import Controller.Vaccination;
import Utils.Icon;
import Controller.StudentMain;

import models.Daycare;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Home extends javax.swing.JPanel {

    private JPanel mainContainer;
    private Daycare daycare;

    private Map<JButton, String> buttonIconMap = new HashMap<>();

    public Home(JPanel mainContainer, Daycare daycare) {
        initComponents();
        Icon image = new Icon();
        for (Map.Entry<JButton, String> button : buttonIconMap.entrySet()) {
            image.setIcon(button.getValue(), button.getKey());
        }
        this.mainContainer = mainContainer;
        this.daycare = daycare;
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        dashboardContainer = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        studentsTile = new javax.swing.JPanel();
        studentsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        immunizationButton = new javax.swing.JButton();
        teachersButton = new javax.swing.JButton();
        classroomsButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        center1 = new javax.swing.JLabel();
        headingBanner = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        dashboardContainer.setBackground(new java.awt.Color(255, 255, 255));
        dashboardContainer.setForeground(new java.awt.Color(255, 255, 255));
        dashboardContainer.setDoubleBuffered(false);
        dashboardContainer.setEnabled(false);
        dashboardContainer.setFocusTraversalKeysEnabled(false);
        dashboardContainer.setFocusable(false);
        dashboardContainer.setOpaque(false);
        dashboardContainer.setRequestFocusEnabled(false);
        dashboardContainer.setVerifyInputWhenFocusTarget(false);
        dashboardContainer.setLayout(new java.awt.CardLayout(10, 10));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        studentsTile.setBackground(new java.awt.Color(255, 255, 255));
        studentsTile.setForeground(new java.awt.Color(255, 255, 255));
        studentsTile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentsButton.setBackground(new java.awt.Color(255, 255, 255));
        studentsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18));
        studentsButton.setForeground(new java.awt.Color(255, 255, 255));
        studentsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student5.png")));
        studentsButton.setBorderPainted(false);
        studentsButton.setContentAreaFilled(false);
        studentsButton.setDefaultCapable(false);
        studentsButton.setFocusPainted(false);
        studentsButton.setFocusTraversalKeysEnabled(false);
        studentsButton.setFocusable(false);
        studentsButton.setRequestFocusEnabled(false);
        studentsButton.setVerifyInputWhenFocusTarget(false);
        studentsButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentsButtonFocusGained(evt);
            }
        });
        studentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsButtonActionPerformed(evt);
            }
        });
        studentsTile.add(studentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 260, 160));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Immunization");
        studentsTile.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 130, -1));

        immunizationButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        immunizationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/immune1.png"))); // NOI18N
        immunizationButton.setBorderPainted(false);
        immunizationButton.setContentAreaFilled(false);
        immunizationButton.setDefaultCapable(false);
        immunizationButton.setFocusPainted(false);
        immunizationButton.setFocusTraversalKeysEnabled(false);
        immunizationButton.setFocusable(false);
        immunizationButton.setVerifyInputWhenFocusTarget(false);
        immunizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationButtonActionPerformed(evt);
            }
        });
        studentsTile.add(immunizationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 250, 150));

        teachersButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        teachersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teacher3.png"))); // NOI18N
        teachersButton.setBorderPainted(false);
        teachersButton.setContentAreaFilled(false);
        teachersButton.setDefaultCapable(false);
        teachersButton.setFocusPainted(false);
        teachersButton.setFocusTraversalKeysEnabled(false);
        teachersButton.setFocusable(false);
        teachersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersButtonActionPerformed(evt);
            }
        });
        studentsTile.add(teachersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 250, 160));

        classroomsButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        classroomsButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class1.png"))); // NOI18N
        classroomsButton1.setBorderPainted(false);
        classroomsButton1.setContentAreaFilled(false);
        classroomsButton1.setDefaultCapable(false);
        classroomsButton1.setFocusPainted(false);
        classroomsButton1.setFocusTraversalKeysEnabled(false);
        classroomsButton1.setFocusable(false);
        classroomsButton1.setRequestFocusEnabled(false);
        classroomsButton1.setVerifyInputWhenFocusTarget(false);
        classroomsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomsButton1ActionPerformed(evt);
            }
        });
        studentsTile.add(classroomsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 250, 150));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Teachers");
        studentsTile.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 90, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Classroom");
        studentsTile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 110, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Students");
        studentsTile.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 90, -1));

        center1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/center3.jpeg"))); // NOI18N
        studentsTile.add(center1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 410, 310));

        headingBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heading2.png"))); // NOI18N
        studentsTile.add(headingBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -10, 610, 90));

        homePanel.add(studentsTile);

        dashboardContainer.add(homePanel, "card2");

        add(dashboardContainer);
    }

    private void classroomsButton1ActionPerformed(java.awt.event.ActionEvent evt) { // TODO add your handling code here:
        Classroom cpc = new Classroom(dashboardContainer, daycare);
        CardLayout layout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(cpc.getClassroomsPanel());
        layout.next(dashboardContainer);
    }

    private void immunizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationButtonActionPerformed

        Vaccination imf = new Vaccination(dashboardContainer, daycare);
        CardLayout layout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(imf.getImmunizationPanel());
        layout.next(dashboardContainer);
    }

    private void teachersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersButtonActionPerformed

        InstructorRecords tp = new InstructorRecords(dashboardContainer, daycare);
        CardLayout layout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(tp);
        layout.next(dashboardContainer);
    }

    private void studentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsButtonActionPerformed


        StudentMain spc = new StudentMain(dashboardContainer, daycare);
        CardLayout layout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(spc.getStudentPanel());
        layout.next(dashboardContainer);
    }//GEN-LAST:event_studentsButtonActionPerformed

    private void studentsButtonFocusGained(java.awt.event.FocusEvent evt) {

    }
    private javax.swing.JLabel center1;
    private javax.swing.JButton classroomsButton1;
    private javax.swing.JPanel dashboardContainer;
    private javax.swing.JLabel headingBanner;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton immunizationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton studentsButton;
    private javax.swing.JPanel studentsTile;
    private javax.swing.JButton teachersButton;

}

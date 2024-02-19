
package Controller;

import models.AbstractPerson;
import models.Daycare;
import models.Student;
import View.VaccinationDetails;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Vaccination {

    private JPanel container;
    private Daycare daycare;

    private VaccinationDetails panel;

    private javax.swing.JButton viewAnnButton;
    private javax.swing.JButton backButton;
    public javax.swing.JTable vaxDetailTable;

    

    public Vaccination(JPanel container, Daycare daycare) {
        this.container = container;
        this.daycare = daycare;

        this.panel = new VaccinationDetails();
        this.backButton = panel.backButton;
//        this.immuTable = panel.immuTable;
        this.vaxDetailTable = panel.StudentVaxTable;
        this.viewAnnButton = panel.viewVaccination;

        
        backButton.addActionListener(l -> {
            goBack();
        });
        
        viewAnnButton.addActionListener(c ->{
            viewAnn();
        });
        
       
    }
    
    public void viewVaccinationAnniversary(){
        int selectedRow = vaxDetailTable.getSelectedRow();
     
     if(selectedRow< 0){
         JOptionPane.showMessageDialog(null, "Please Select a Student");
     }
     int studentId = (int) vaxDetailTable.getValueAt(selectedRow, 0);
     AbstractPerson selectedStudent= daycare.getStudentById(studentId);
     if(((Student)selectedStudent).getVaxList().isEmpty()){
         System.out.println("No Entry");
         JOptionPane.showMessageDialog(null, "No Vaccination Records Found");
     }
     List<String> lastDose = ((Student) selectedStudent).getVaxLastDose();
     List<String> nextDose = ((Student) selectedStudent).getVaxNextDose();
     System.out.println((Student)selectedStudent);
     
     panel.hibLast.setText(lastDose.get(0));
     panel.hibNext.setText(nextDose.get(0));
     
     panel.dtapLast.setText(lastDose.get(1));
     panel.dtapNext.setText(nextDose.get(1));
     
     panel.polioLast.setText(lastDose.get(2));
     panel.polioNext.setText(nextDose.get(2));
     
     panel.hepatitisbLast.setText(lastDose.get(3));
     panel.hepatitisbNext.setText(nextDose.get(3));
     
     panel.mmrLast.setText(lastDose.get(4));
     panel.mmrNext.setText(nextDose.get(4));
     
     panel.varicellaLast.setText(lastDose.get(5));
     panel.varicellaNext.setText(nextDose.get(5));
  
    }

    public VaccinationDetails getImmunizationPanel() {
        setTable();
        return panel;
    }

    public void setTable() {


//        vaxDetailTable.setAutoCreateRowSorter(true);
        DefaultTableModel vaxTableModel = (DefaultTableModel) vaxDetailTable.getModel();
        vaxTableModel.setRowCount(0);
        for (AbstractPerson student : daycare.getListStudent()) {
            Object[] row = new Object[9];
            Student s = (Student) student;
            row[0] = s.getId();
            row[1] = student.getFirstName() + " " + s.getLastName();
            row[2] = student.getAge();
            List<String> VaxCount = ((Student) student).getVaxCount();
            // ["Hib", "DTaP", "Polio", "Hepatitis B", "MMR", "Varicella"]
            row[3] = VaxCount.get(0); // "Hib"
            row[4] = VaxCount.get(1); // "DTaP"
            row[5] = VaxCount.get(2); // "Polio"
            row[6] = VaxCount.get(3); // "Hepatitis B"
            row[7] = VaxCount.get(4); // "MMR"
            row[8] = VaxCount.get(5); // "Varicella"
            vaxTableModel.addRow(row);
        }
        
    
    }
    
    
    private void viewAnn(){
        viewVaccinationAnniversary();
    }
    private void goBack() {
        container.remove(panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }

}

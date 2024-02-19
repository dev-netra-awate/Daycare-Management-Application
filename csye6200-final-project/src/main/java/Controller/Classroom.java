
package Controller;

import models.Daycare;
import View.DaycareClassrooms;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Instructor;

public class Classroom {

    private JPanel container;
    private Daycare daycare;

    private DaycareClassrooms panel;

    private JButton backButton;
    private JTable classTable;

//    --------- Panels-----------------------
    private PanelInfo panel1;
    private PanelInfo panel2;
    private PanelInfo panel3;
    private PanelInfo panel4;
    private PanelInfo panel5;
    private PanelInfo panel6;

    public Classroom(JPanel container, Daycare daycare) {
        this.container = container;
        this.daycare = daycare;

        this.panel = new DaycareClassrooms();

        this.backButton = panel.backButton;


        backButton.addActionListener(l -> {
            goBack();
        });
    }
    
    public static class PanelInfo{
        private JTable infoTable;
        
        
        public PanelInfo(JTable t){
            infoTable = t;
        }
        
        public void addClassroomInPanel(models.Classroom classRoomObject){
            DefaultTableModel model = (DefaultTableModel) infoTable.getModel();
            model.setRowCount(0);
            Object[] row1 = new Object[2];
            Object[] row2 = new Object[2];
            Object[] row3 = new Object[2];
            Object[] row4 = new Object[2];
            row1[0] = "Max Possible Groups";
            row1[1] = classRoomObject.getClassroomNumber();
            int[] ageArr = classRoomObject.getRangeOfAge();
            row2[0] = "Range";
            row2[1] = ageArr[0] + " - " + ageArr[1];
            row3[0] = "Group Size";
            row3[1] = classRoomObject.getClassroomNumber();
            row4[0] = "Total Students";
            int count = 0;
            for(Instructor teacher
                    : classRoomObject.getListTeacher()){
                count += teacher.getCount();
            }
            row4[1] = count;
            model.addRow(row1);
            model.addRow(row2);
            model.addRow(row3);
            model.addRow(row4);
        }
        
    }


    public DaycareClassrooms getClassroomsPanel() {
        displayClassrooms();
        return panel;
    }
    
    
    public void displayClassrooms(){
        List<models.Classroom> listclassRoom = daycare.getListClassroom();
        panel1 = new PanelInfo(panel.jTable1);
        panel1.addClassroomInPanel(listclassRoom.get(0));
        
        panel2 = new PanelInfo(panel.jTable2);
        panel2.addClassroomInPanel(listclassRoom.get(1));
        
        panel3 = new PanelInfo(panel.jTable3);
        panel3.addClassroomInPanel(listclassRoom.get(2));
        
        panel4 = new PanelInfo(panel.jTable4);
        panel4.addClassroomInPanel(listclassRoom.get(3));
        
        panel5 = new PanelInfo(panel.jTable5);
        panel5.addClassroomInPanel(listclassRoom.get(4));
//        
        panel6 = new PanelInfo(panel.jTable6);
        panel6.addClassroomInPanel(listclassRoom.get(5));

    }

    private void goBack() {
        container.remove(panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }

}

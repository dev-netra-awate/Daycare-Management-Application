
package Configuration;

import Utils.Util;
import models.RatioRule;
import models.Student;
import models.StudentEagerSingletonFactory;
import models.Immunization;
import java.util.ArrayList;
import java.util.List;


public class Daycare {

    public static models.Daycare captureData() {
        List<String> ImmunizationList = Util.readingCSVFile("Vaccination.txt");
        
        List<Immunization> vaccinationListForDaycare = new ArrayList<>();
        for (String vacRecord : ImmunizationList) {
            vaccinationListForDaycare.add(new Immunization(vacRecord));
        }
        models.Daycare daycare = new models.Daycare();
        List<String> StudentCSVList = Util.readingCSVFile("StudentList.txt");
        for (String studentString : StudentCSVList) {
            Student studentObj = StudentEagerSingletonFactory.getInstance().getObject(studentString);
            for (Immunization i : vaccinationListForDaycare) {
                if (i.getStudentId() == studentObj.getId()) {
                    studentObj.addVax(i);
                }
            }
            daycare.addToDaycare(studentObj);
            daycare.addStudentObjToCSV();
        }
        List<String> RatioData = Util.readingCSVFile("Ratio.txt");
        List<RatioRule> ratioRules = new ArrayList<>();
        for (String s : RatioData) {
            ratioRules.add(new RatioRule((s)));
        }

        List<String> TeacherList = Util.readingCSVFile("Instructor.txt");
        daycare.setTeacherCSVList(TeacherList);
        for (RatioRule r : ratioRules) {
            daycare.addRatioRule(r);
        }

        List<String> StudentList = Util.readingCSVFile("StudentList.txt");
        for (String studentString : StudentList) {
            Student studentObj = StudentEagerSingletonFactory.getInstance().getObject(studentString);
            for (Immunization i : vaccinationListForDaycare) {
                if (i.getStudentId() == studentObj.getId()) {
                    studentObj.addVax(i);
                }
            }
            daycare.addToDaycare(studentObj);
            daycare.addStudentObjToCSV();
        }
        return daycare;
    }
}

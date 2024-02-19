package models;

import Utils.Util;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Daycare {
    
    
    private int classId;
    private int teacherId;
    
    private List<Classroom> listClassroom = new ArrayList<>();
    
    private List<RatioRule> rulesRatio = new ArrayList<>();
    private List<Student> listStudent = new ArrayList<>();
    
    private List<Student> IsRenewFalseStudentList = new ArrayList<>();
    private List<AbstractPerson> listTeacher = new ArrayList<>();
    private List<String> CSVListTeacher = new ArrayList<>();
    private List<Student> IsRenewTrueStudentList = new ArrayList<>();


    public Daycare() {

        teacherId = 0;
        classId = 0;

    }
    
    public void addRatioRule(RatioRule r){
        rulesRatio.add(r);
    }

    public void addToDaycare(Student s){
        listStudent.add(s);

        addNewStudentToClass(s);

    }
    
    private void addNewStudentToClass(Student studentObj){
        if (listClassroom.isEmpty()){
            for (RatioRule ratioObj:rulesRatio){
                if (ratioObj.inRange(studentObj.getAge())){
                    Classroom classRoomObj = ClassroomEagerSingletonFactory.getInstance().getObject(classId++,ratioObj.getLow(),ratioObj.getHigh(), ratioObj.getSizeOfClassroom(), ratioObj.getNumber());
                    Instructor teacherObj = getNextTeacher(ratioObj.getSizeOfGroup(),classRoomObj.getClassId());
                    studentObj.setClassroomId(classRoomObj.getClassId());
                    teacherObj.addStudent(studentObj);
                    classRoomObj.addTeacher(teacherObj);
                    for(int i = 0; i < ratioObj.getSizeOfClassroom()-1; i++){
                        classRoomObj.addTeacher(getNextTeacher(ratioObj.getSizeOfGroup(),classRoomObj.getClassId()));
                    }
                    listClassroom.add(classRoomObj);
                    return;

                }
            }
        }

        for(Classroom classRoomObj : listClassroom){
          
            if (classRoomObj.inRange(studentObj.getAge())){
               
                for(Instructor teacherObj:classRoomObj.getListTeacher()){
                    if(teacherObj.isEmpty()){
                       
                        studentObj.setClassroomId(classRoomObj.getClassId());
                        teacherObj.addStudent(studentObj);
                        return;
                    }

                }
            }

        }

        // no classRoom exist
        for (RatioRule ratioObj:rulesRatio){
            if (ratioObj.inRange(studentObj.getAge())){
                Classroom classRoomObj = ClassroomEagerSingletonFactory.getInstance().getObject(classId++,ratioObj.getLow(),ratioObj.getHigh(),ratioObj.getSizeOfClassroom(), ratioObj.getNumber());
                Instructor teacherObj = getNextTeacher(ratioObj.getSizeOfGroup(),classRoomObj.getClassId());
                studentObj.setClassroomId(classRoomObj.getClassId());
                teacherObj.addStudent(studentObj);
                classRoomObj.addTeacher(teacherObj);
                for(int i = 0; i < ratioObj.getSizeOfClassroom()-1; i++){
                    classRoomObj.addTeacher(getNextTeacher(ratioObj.getSizeOfGroup(),classRoomObj.getClassId()));

                }
                listClassroom.add(classRoomObj);

            }
        }

    }
    
    public Instructor getNextTeacher(int size, int cid){
        return new Instructor(CSVListTeacher.get(teacherId), teacherId++, size, cid);
    }

    public void addStudentObjToCSV(){
        List<String> CSVListObj = new ArrayList<>();        
        for (Student studentObj : listStudent) {
            CSVListObj.add(studentObj.toCSV());
        }        
        Util.writingCSVFile(CSVListObj, "Student.txt");
    }
    
    public AbstractPerson getStudentById(int id) {
        for(AbstractPerson person : listStudent) {
            if(person.getId() == id)
                return person;
        }
        return null;
    }
     

   
    public void deleteStudentById(int studentId) {
        
        List<Student> studentsListObj = listStudent
            .stream()
            .filter(i -> i.getId()!=studentId)
            .collect(toList());
        
        this.listStudent = studentsListObj;        
    }
    
    

    public List<Student> getListStudent(){
        return listStudent;
    }

    public List<Classroom> getListClassroom() {
        return listClassroom;
    }

    public void showAll(){
        for (Classroom c: listClassroom){
            c.showTeachers();
        }
    }

    
    public void setTeacherCSVList(List<String> teacherCSVList) {
        CSVListTeacher = teacherCSVList;
    }

    
    public List<Student> gerRenewalStudentList(){
       IsRenewTrueStudentList.clear();
       for(Student s: listStudent){
           if(s.isIsRenewRequired() == true)
               IsRenewTrueStudentList.add(s);
       }
        return IsRenewTrueStudentList;
    }

    public List<Student> getNonRenewStudentList(){
       IsRenewFalseStudentList.clear();
       for(Student s: listStudent){
           if(s.isIsRenewRequired() == false)
               IsRenewFalseStudentList.add(s);
       }
        return IsRenewFalseStudentList;
    } 

//    public void setTeacherCSVList(List<String> TeacherCSVList) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    
}

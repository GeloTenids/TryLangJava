/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentSystem;

import java.util.ArrayList;

/**
 *
 * @author gelodrei
 */
public class StudentDL {
    
    public ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();
    
    StudentDL(){
        makeList();
    }
    public ArrayList<StudentModel> makeList(){
        
        StudentModel stud1 = new StudentModel();
        stud1.firstName = "Charles";
        stud1.lastName = "potazo";
        stud1.course = "BSIT";
        stud1.year = "2";
        stud1.section = "1";
        stud1.midtermGrade = 97.99;
        stud1.finalGrade = 98.54;
        studentList.add(stud1);
        
        StudentModel stud2 = new StudentModel();
        stud2.firstName = "Marc";
        stud2.lastName = "tenido";
        stud2.course = "BSIT";
        stud2.year = "2";
        stud2.section = "1";
        stud2.midtermGrade = 96.99;
        stud2.finalGrade = 97.54;
        studentList.add(stud2);
        
        StudentModel stud3 = new StudentModel();
        stud3.firstName = "John";
        stud3.lastName = "cena";
        stud3.course = "CAN'T";
        stud3.year = "SEE";
        stud3.section = "ME";
        stud3.midtermGrade = 81.69;
        stud3.finalGrade = 74.54;
        studentList.add(stud3);
        
        return studentList;
    }
    
    public double computeAverage(String lastName){
    
        double average = 0;
        
        for(StudentModel student : studentList){
            if(student.lastName.equals(lastName.toLowerCase())){
                average = (student.midtermGrade + student.midtermGrade) / 2;
                break;
            }
            else{
                average = 0;
            }
        }
        
        return average;
    }
    
}

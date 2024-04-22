/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentSystem;

/**
 *
 * @author gelodrei
 */
public class StudentBL {
    
    public String GetAverage(String lastName){
    
        String result = null;
        StudentDL student = new StudentDL();
        
        if(student.computeAverage(lastName) >= 96 && student.computeAverage(lastName) <= 100){
            result = student.computeAverage(lastName) + " With Highest Honor";
        }
        else if(student.computeAverage(lastName) >= 89 && student.computeAverage(lastName) <= 95.99){
            result = student.computeAverage(lastName) + " With Honors";
        }
        else if(student.computeAverage(lastName) >= 75 && student.computeAverage(lastName) <= 88.99){
            result = student.computeAverage(lastName) + " Passed";
        }
        else if(student.computeAverage(lastName) <= 74 ){
            result = student.computeAverage(lastName) + " Failed";
        }
        else{
            result = student.computeAverage(lastName) + " Invalid";
        }
        return result;
    }
}

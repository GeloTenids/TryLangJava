/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentSystem;

/**
 *
 * @author gelodrei
 */
public class Student {
    String firstName, lastName, course, section, year;
    double midtermGrade, finalGrade;
    
    Student(String fName, String lName, String course, String section, String year, double mGrade, double fGrade){
    
        this.firstName = fName;
        this.lastName = lName;
        this.course = course;
        this.section = section;
        this.year = year;
        this.midtermGrade = mGrade;
        this.finalGrade = fGrade;

    }
    public String Introduce(){
    
        return firstName + " " + lastName + " " + course + " " + year + " " + section;
    }
    
    public String evalGrade(){
    
        double average = (midtermGrade + finalGrade) / 2;
        String eval = "no grade";
        
        if(average >= 98 && average <= 100){
        
            eval = "Your Grade is: " + average + ", With Highest Honors!";
        }
        else if(average >= 95 && average <= 97.99){
        
            eval = "Your Grade is: " + average + ", With High Honors!";
        }
        else if(average >= 90 && average <= 94.99){
        
            eval = "Your Grade is: " + average + ", With Honors!";
        }
        else if(average >= 75 && average <= 89.99){
        
            eval = "Your Grade is: " + average + ", Passed!";
        }
        else if(average <= 74){
        
            eval = "Your Grade is: " + average + ", Failed!";
        }
        else{
        
            eval = "invalid grade";
        }
        return eval;
    }
}

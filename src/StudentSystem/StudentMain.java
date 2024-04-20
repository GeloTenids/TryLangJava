/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StudentSystem;

import java.util.*;
/**
 *
 * @author gelodrei
 */
public class StudentMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First Name: ");
        String fName = scan.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lName = scan.nextLine();
        
        System.out.print("Enter Course: ");
        String course = scan.nextLine();
        
        System.out.print("Enter Section: ");
        String sec = scan.nextLine();
        
        System.out.print("Enter Year: ");
        String yr = scan.nextLine();
        
        System.out.print("Enter Midterm Grade: ");
        double mGrade = scan.nextDouble();
        
        System.out.print("Enter Final Grade: ");
        double fGrade = scan.nextDouble();
        
        Student s = new Student(fName, lName, course, sec, yr, mGrade, fGrade);
        
        System.out.println(s.Introduce());
        
        System.out.println(s.evalGrade());
    }
    
}

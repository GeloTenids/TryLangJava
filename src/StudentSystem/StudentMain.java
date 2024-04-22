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
        StudentBL studBL = new StudentBL();
        System.out.println("Enter Last Name to compute for grades: ");
        String lastName = scan.nextLine();
        
        System.out.println(studBL.GetAverage(lastName));
        
        main(args);
    }
    
}

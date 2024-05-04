/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OverRideAndLoad;

/**
 *
 * @author gelodrei
 */
public class EncapMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guitars electric = new Electric();
        electric.aboutGuitar();
        
        Guitars acoustic = new Acoustic();
        acoustic.aboutGuitar();
        
        Guitars classical = new Classical();
        classical.aboutGuitar();
    }
    
}

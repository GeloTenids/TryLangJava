/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverRideAndLoad;

/**
 *
 * @author gelodrei
 */
public class Acoustic implements Guitars {
    
    String type = "Acoustic guitar";
    
    @Override
    public void aboutGuitar(){
        System.out.println(type + " A standard guitar that can produce a sound using a string.\n");
    }
}

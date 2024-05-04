/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverRideAndLoad;

/**
 *
 * @author gelodrei
 */
public class Classical implements Guitars {
    String type = "Classical guitar";
    
    @Override
    public void aboutGuitar(){
        System.out.println(type + " Looks like an acoustic, but has a folk tone and soft strings.\n");
    }
}

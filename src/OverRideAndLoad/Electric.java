/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverRideAndLoad;

/**
 *
 * @author gelodrei
 */
public class Electric implements Guitars {
    String type = "Electric guitar";
    
    @Override
    public void aboutGuitar(){
        System.out.println(type + " A guitar tha uses coil pickup to absorb vibrations "
                + "from the strings and create sound.\n");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samb;

/**
 *
 * @author user
 */
public class Kahitano {
    Desktopthree d;
    Desktopfour d4;

    public Kahitano(Desktopthree d, Desktopfour d4) {
        this.d = d;
        this.d4 = d4;
    }
    
    public void populate(String selected){
        
        d4.getEquipment().setText(selected);
    }
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.hotel_flowers;

import valids.ValidateForGest;

/**
 *
 * @author camilo.velez4
 */
public class GestRooms {

    ValidateForGest vl = new ValidateForGest();
    Rooms rm = new Rooms();
    int numbToValid;
    boolean retGest;

    public GestRooms() {
    }

    public boolean GestionConsult() {

        numbToValid = vl.leeryValidarCaracter("Desea Consultar o Gestionar Las Habitaciones:\n1. Consultar\n2. Gestinoar");
        
        if(numbToValid == 1){
            retGest = true;
        }else{
            retGest = false;
        }
        
        return retGest;
    }

}

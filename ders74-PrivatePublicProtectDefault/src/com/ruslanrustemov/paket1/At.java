/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruslanrustemov.paket1;

import com.ruslanrustemov.paket2.Heyvan;

/**
 *
 * @author Nurlan Rustamov
 */
public class At extends Heyvan{
    
    public At(String ad) {
        super(ad);
    }
//    burada HeyvanDan Extends etdik deye super.ad o anda geldi
    public void adiniDe(){
        System.out.println(super.ad);
    }
    
}

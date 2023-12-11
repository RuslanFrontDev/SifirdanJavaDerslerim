/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruslanrustemov.Cebr;

/**
 *
 * @author Nurlan Rustamov
 */
public class TetbiqEt extends Islemler {
// 1.burada projeye sag masusu tiklayib Proporties-e gedirik 
// 2. packaging-de 1,2,3 alani isareleyib Ok basiriq
// 3.projeye yeniden gelib mausun sag duymesini basiriq
// 4. ve clean and bulid edirik
// 5. 71.dersimizde ise jar dosyasini istifade edirik (70 ve71 eyni dersimizdi)
// 6. 71. dersde Libraries-e sagi tiklayib Add JAR/Folder-e basiriq
// 7. bizim Jar dosyamiz NetBEansProject-in altinda ders70-Paketler_JarFile alitnda dist-in altinda yerlesir
// 8. En son default package-nin altinda bir dene java class-ni yazib tetbiq edirik    
    
    
    @Override
    public void toplama(double a, double b) {
        System.out.println("toplama" + (a + b));
    }

    @Override
    public void cixma(double a, double b) {
        System.out.println("cixma" + (a - b));
    }

    @Override
    public void vurma(double a, double b) {
        System.out.println("vurma" + (a * b));
    }

    @Override
    public void bolme(double a, double b) {
        System.out.println("bolme" + (a / b));
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
// Qeyd: Genisletmek üçün extends-den istifade olunur
public interface IGenisletilmisInterFace {

    public void nefesAl();
}
//Qeyd: Ikinci InterFace hec vaxt Public ve ya Private yazilmaz
//public interface Heyvan extends IGenisletilmisInterFace {
//
//    public void ovlandi();
//}

interface Heyvan extends IGenisletilmisInterFace {

    public void ovlandi();
}

interface Qurd extends Heyvan {

    public void surundu();
}

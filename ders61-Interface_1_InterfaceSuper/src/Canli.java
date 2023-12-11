/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nurlan Rustamov
 */
public interface Canli {
    default void nefesAl(){
        System.out.println("Canli nefes alir");
    };
    void qacmaq();
}

interface Insan {
    default void nefesAl(){
        System.out.println("Insan nefes alir");
    };
}
